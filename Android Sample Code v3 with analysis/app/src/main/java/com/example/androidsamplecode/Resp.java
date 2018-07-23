package com.example.androidsamplecode;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sagi on 6/13/2017.
 */

public class Resp {


    /**
     * status : success
     * result : {"duration":"49168.50","sessionStatus":"Processing","analysisSegments":[{"offset":0,"duration":10000,"end":10000,"analysis":{"Arousal":{"Value":"84.19","Group":"high"}}},{"offset":1000,"duration":10000,"end":11000,"analysis":{"Temper":{"Value":null,"Group":"Unknown"}}},{"offset":2000,"duration":10000,"end":12000,"analysis":{"Valence":{"Value":"11.46","Group":"negative"}}},{"offset":4000,"duration":10000,"end":14000,"analysis":{"Arousal":{"Value":"83.28","Group":"high"}}},{"offset":5000,"duration":10000,"end":15000,"analysis":{"Valence":{"Value":"69.60","Group":"positive"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Temper":{"Value":"65.64","Group":"medium"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":3,"Phrase":"Enthusiastic"},"Secondary":{"Id":5,"Phrase":"Happy"}},"Group11":{"Primary":{"Id":6,"Phrase":"Leadership, Charisma"},"Secondary":{"Id":4,"Phrase":"Friendly, Warm"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":11,"Phrase":"friendliness"}},"Composite":{"Primary":{"Id":251,"Phrase":"Emotional leadership, preaching. Mix of belonging and possessiveness."},"Secondary":{"Id":254,"Phrase":"Friendly communication."}}}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Temper":{"Value":"83.23","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Arousal":{"Value":"83.56","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Valence":{"Value":"12.18","Group":"negative"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":11,"Phrase":"Supremacy, Arrogance"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":14,"Phrase":"hostility"}},"Composite":{"Primary":{"Id":360,"Phrase":"Possessiveness. Extroverted egocentricity. Possibly pride."},"Secondary":{"Id":198,"Phrase":"Highly emotional, possibly from jealousy or hatred."}}}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Temper":{"Value":"84.33","Group":"high"}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":5,"Phrase":"Hostility, Anger"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":10,"Phrase":"excitement"},"Secondary":{"Id":2,"Phrase":"anger"}},"Composite":{"Primary":{"Id":213,"Phrase":"Outburst from vulnerability."},"Secondary":{"Id":342,"Phrase":"Outburst of anger. Possibly from rejection."}}}}},{"offset":15000,"duration":10000,"end":25000,"analysis":{"Arousal":{"Value":"84.29","Group":"high"}}},{"offset":15000,"duration":10000,"end":25000,"analysis":{"Valence":{"Value":"11.18","Group":"negative"}}},{"offset":16000,"duration":10000,"end":26000,"analysis":{"Temper":{"Value":"84.37","Group":"high"}}},{"offset":16000,"duration":10000,"end":26000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":3,"Phrase":"Enthusiastic"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":1,"Phrase":"Creative, Passionate"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":2,"Phrase":"anger"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":318,"Phrase":"Zealous."}}}}},{"offset":18000,"duration":10000,"end":28000,"analysis":{"Arousal":{"Value":"84.42","Group":"high"}}},{"offset":18000,"duration":10000,"end":28000,"analysis":{"Valence":{"Value":"11.88","Group":"negative"}}},{"offset":20000,"duration":10000,"end":30000,"analysis":{"Temper":{"Value":"84.56","Group":"high"}}},{"offset":20000,"duration":10000,"end":30000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":11,"Phrase":"Supremacy, Arrogance"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":360,"Phrase":"Possessiveness. Extroverted egocentricity. Possibly pride."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}},{"offset":21000,"duration":10000,"end":31000,"analysis":{"Valence":{"Value":"10.89","Group":"negative"}}},{"offset":23000,"duration":10000,"end":33000,"analysis":{"Arousal":{"Value":"85.01","Group":"high"}}},{"offset":25000,"duration":10000,"end":35000,"analysis":{"Valence":{"Value":"11.71","Group":"negative"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Temper":{"Value":"83.75","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Arousal":{"Value":"85.86","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}}]}
     */

    private String status;
    private ResultBean result;

    public static Resp objectFromData(String str) {

        return new Gson().fromJson(str, Resp.class);
    }

    public static Resp objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), Resp.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Resp> arrayRespFromData(String str) {

        Type listType = new TypeToken<ArrayList<Resp>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<Resp> arrayRespFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<Resp>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * duration : 49168.50
         * sessionStatus : Processing
         * analysisSegments : [{"offset":0,"duration":10000,"end":10000,"analysis":{"Arousal":{"Value":"84.19","Group":"high"}}},{"offset":1000,"duration":10000,"end":11000,"analysis":{"Temper":{"Value":null,"Group":"Unknown"}}},{"offset":2000,"duration":10000,"end":12000,"analysis":{"Valence":{"Value":"11.46","Group":"negative"}}},{"offset":4000,"duration":10000,"end":14000,"analysis":{"Arousal":{"Value":"83.28","Group":"high"}}},{"offset":5000,"duration":10000,"end":15000,"analysis":{"Valence":{"Value":"69.60","Group":"positive"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Temper":{"Value":"65.64","Group":"medium"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":3,"Phrase":"Enthusiastic"},"Secondary":{"Id":5,"Phrase":"Happy"}},"Group11":{"Primary":{"Id":6,"Phrase":"Leadership, Charisma"},"Secondary":{"Id":4,"Phrase":"Friendly, Warm"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":11,"Phrase":"friendliness"}},"Composite":{"Primary":{"Id":251,"Phrase":"Emotional leadership, preaching. Mix of belonging and possessiveness."},"Secondary":{"Id":254,"Phrase":"Friendly communication."}}}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Temper":{"Value":"83.23","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Arousal":{"Value":"83.56","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Valence":{"Value":"12.18","Group":"negative"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":11,"Phrase":"Supremacy, Arrogance"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":14,"Phrase":"hostility"}},"Composite":{"Primary":{"Id":360,"Phrase":"Possessiveness. Extroverted egocentricity. Possibly pride."},"Secondary":{"Id":198,"Phrase":"Highly emotional, possibly from jealousy or hatred."}}}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Temper":{"Value":"84.33","Group":"high"}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":5,"Phrase":"Hostility, Anger"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":10,"Phrase":"excitement"},"Secondary":{"Id":2,"Phrase":"anger"}},"Composite":{"Primary":{"Id":213,"Phrase":"Outburst from vulnerability."},"Secondary":{"Id":342,"Phrase":"Outburst of anger. Possibly from rejection."}}}}},{"offset":15000,"duration":10000,"end":25000,"analysis":{"Arousal":{"Value":"84.29","Group":"high"}}},{"offset":15000,"duration":10000,"end":25000,"analysis":{"Valence":{"Value":"11.18","Group":"negative"}}},{"offset":16000,"duration":10000,"end":26000,"analysis":{"Temper":{"Value":"84.37","Group":"high"}}},{"offset":16000,"duration":10000,"end":26000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":3,"Phrase":"Enthusiastic"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":1,"Phrase":"Creative, Passionate"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":2,"Phrase":"anger"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":318,"Phrase":"Zealous."}}}}},{"offset":18000,"duration":10000,"end":28000,"analysis":{"Arousal":{"Value":"84.42","Group":"high"}}},{"offset":18000,"duration":10000,"end":28000,"analysis":{"Valence":{"Value":"11.88","Group":"negative"}}},{"offset":20000,"duration":10000,"end":30000,"analysis":{"Temper":{"Value":"84.56","Group":"high"}}},{"offset":20000,"duration":10000,"end":30000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":11,"Phrase":"Supremacy, Arrogance"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":360,"Phrase":"Possessiveness. Extroverted egocentricity. Possibly pride."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}},{"offset":21000,"duration":10000,"end":31000,"analysis":{"Valence":{"Value":"10.89","Group":"negative"}}},{"offset":23000,"duration":10000,"end":33000,"analysis":{"Arousal":{"Value":"85.01","Group":"high"}}},{"offset":25000,"duration":10000,"end":35000,"analysis":{"Valence":{"Value":"11.71","Group":"negative"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Temper":{"Value":"83.75","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Arousal":{"Value":"85.86","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}}]
         */

        private String duration;
        private String sessionStatus;
        private List<AnalysisSegmentsBean> analysisSegments;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }

        public static ResultBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResultBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResultBean> arrayResultBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResultBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getSessionStatus() {
            return sessionStatus;
        }

        public void setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
        }

        public List<AnalysisSegmentsBean> getAnalysisSegments() {
            return analysisSegments;
        }

        public void setAnalysisSegments(List<AnalysisSegmentsBean> analysisSegments) {
            this.analysisSegments = analysisSegments;
        }

        public static class AnalysisSegmentsBean {
            /**
             * offset : 0
             * duration : 10000
             * end : 10000
             * analysis : {"Arousal":{"Value":"84.19","Group":"high"}}
             */

            private int offset;
            private int duration;
            private int end;
            private AnalysisBean analysis;

            public static AnalysisSegmentsBean objectFromData(String str) {

                return new Gson().fromJson(str, AnalysisSegmentsBean.class);
            }

            public static AnalysisSegmentsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), AnalysisSegmentsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<AnalysisSegmentsBean> arrayAnalysisSegmentsBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<AnalysisSegmentsBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<AnalysisSegmentsBean> arrayAnalysisSegmentsBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<AnalysisSegmentsBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getEnd() {
                return end;
            }

            public void setEnd(int end) {
                this.end = end;
            }

            public AnalysisBean getAnalysis() {
                return analysis;
            }

            public void setAnalysis(AnalysisBean analysis) {
                this.analysis = analysis;
            }

            public static class AnalysisBean {
                /**
                 * Arousal : {"Value":"84.19","Group":"high"}
                 */

                private ArousalBean Arousal;

                public static AnalysisBean objectFromData(String str) {

                    return new Gson().fromJson(str, AnalysisBean.class);
                }

                public static AnalysisBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(str), AnalysisBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<AnalysisBean> arrayAnalysisBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<AnalysisBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<AnalysisBean> arrayAnalysisBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<AnalysisBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public ArousalBean getArousal() {
                    return Arousal;
                }

                public void setArousal(ArousalBean Arousal) {
                    this.Arousal = Arousal;
                }

                public static class ArousalBean {
                    /**
                     * Value : 84.19
                     * Group : high
                     */

                    private String Value;
                    private String Group;

                    public static ArousalBean objectFromData(String str) {

                        return new Gson().fromJson(str, ArousalBean.class);
                    }

                    public static ArousalBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new Gson().fromJson(jsonObject.getString(str), ArousalBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public static List<ArousalBean> arrayArousalBeanFromData(String str) {

                        Type listType = new TypeToken<ArrayList<ArousalBean>>() {
                        }.getType();

                        return new Gson().fromJson(str, listType);
                    }

                    public static List<ArousalBean> arrayArousalBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<ArousalBean>>() {
                            }.getType();

                            return new Gson().fromJson(jsonObject.getString(str), listType);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return new ArrayList();


                    }

                    public String getValue() {
                        return Value;
                    }

                    public void setValue(String Value) {
                        this.Value = Value;
                    }

                    public String getGroup() {
                        return Group;
                    }

                    public void setGroup(String Group) {
                        this.Group = Group;
                    }
                }
            }
        }
    }
}

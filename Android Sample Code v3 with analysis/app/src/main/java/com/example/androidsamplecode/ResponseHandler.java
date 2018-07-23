package com.example.androidsamplecode;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ResponseHandler {


    /**
     * status : success
     * result : {"duration":"49168.50","sessionStatus":"Done","analysisSegments":[{"offset":0,"duration":10000,"end":10000,"analysis":{"Arousal":{"Value":"84.17","Group":"high"}}},{"offset":2000,"duration":10000,"end":12000,"analysis":{"Valence":{"Value":"11.81","Group":"negative"}}},{"offset":3000,"duration":10000,"end":13000,"analysis":{"Temper":{"Value":"66.79","Group":"medium"}}},{"offset":3000,"duration":10000,"end":13000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":3,"Phrase":"Enthusiastic"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":6,"Phrase":"Leadership, Charisma"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":18,"Phrase":"motivation"},"Secondary":{"Id":9,"Phrase":"egoism"}},"Composite":{"Primary":{"Id":392,"Phrase":"Enthusiasm. Inspiration. Discovery."},"Secondary":{"Id":143,"Phrase":"Insistence and stubbornness. Possibly childishness."}}}}},{"offset":4000,"duration":10000,"end":14000,"analysis":{"Arousal":{"Value":"83.23","Group":"high"}}},{"offset":4000,"duration":10000,"end":14000,"analysis":{"Valence":{"Value":"None","Group":"Unknown"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Temper":{"Value":"66.03","Group":"medium"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":3,"Phrase":"Enthusiastic"},"Secondary":{"Id":5,"Phrase":"Happy"}},"Group11":{"Primary":{"Id":6,"Phrase":"Leadership, Charisma"},"Secondary":{"Id":4,"Phrase":"Friendly, Warm"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":11,"Phrase":"friendliness"}},"Composite":{"Primary":{"Id":251,"Phrase":"Emotional leadership, preaching. Mix of belonging and possessiveness."},"Secondary":{"Id":254,"Phrase":"Friendly communication."}}}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Temper":{"Value":"83.22","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Arousal":{"Value":"83.66","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Valence":{"Value":"12.29","Group":"negative"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":11,"Phrase":"Supremacy, Arrogance"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":10,"Phrase":"excitement"}},"Composite":{"Primary":{"Id":360,"Phrase":"Possessiveness. Extroverted egocentricity. Possibly pride."},"Secondary":{"Id":213,"Phrase":"Outburst from vulnerability."}}}}},{"offset":12000,"duration":10000,"end":22000,"analysis":{"Valence":{"Value":"13.13","Group":"negative"}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Temper":{"Value":"84.62","Group":"high"}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":5,"Phrase":"Hostility, Anger"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":10,"Phrase":"excitement"},"Secondary":{"Id":2,"Phrase":"anger"}},"Composite":{"Primary":{"Id":213,"Phrase":"Outburst from vulnerability."},"Secondary":{"Id":342,"Phrase":"Outburst of anger. Possibly from rejection."}}}}},{"offset":15000,"duration":10000,"end":25000,"analysis":{"Arousal":{"Value":"84.11","Group":"high"}}},{"offset":16000,"duration":10000,"end":26000,"analysis":{"Valence":{"Value":"11.19","Group":"negative"}}},{"offset":17000,"duration":10000,"end":27000,"analysis":{"Temper":{"Value":"84.43","Group":"high"}}},{"offset":17000,"duration":10000,"end":27000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":180,"Phrase":"Domineering. Possibly obsessive."}}}}},{"offset":19000,"duration":10000,"end":29000,"analysis":{"Arousal":{"Value":"84.29","Group":"high"}}},{"offset":21000,"duration":10000,"end":31000,"analysis":{"Temper":{"Value":"84.36","Group":"high"}}},{"offset":21000,"duration":10000,"end":31000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}},{"offset":22000,"duration":10000,"end":32000,"analysis":{"Arousal":{"Value":"84.92","Group":"high"}}},{"offset":22000,"duration":10000,"end":32000,"analysis":{"Valence":{"Value":"25.56","Group":"negative"}}},{"offset":25000,"duration":10000,"end":35000,"analysis":{"Valence":{"Value":"10.97","Group":"negative"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Temper":{"Value":"83.61","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Arousal":{"Value":"85.93","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Temper":{"Value":"83.86","Group":"high"}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Arousal":{"Value":"85.82","Group":"high"}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Valence":{"Value":"26.84","Group":"negative"}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":14,"Phrase":"hostility"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":384,"Phrase":"Incitement. Negative expression of feelings."}}}}},{"offset":33000,"duration":10000,"end":43000,"analysis":{"Temper":{"Value":"84.52","Group":"high"}}},{"offset":33000,"duration":10000,"end":43000,"analysis":{"Arousal":{"Value":"85.47","Group":"high"}}},{"offset":33000,"duration":10000,"end":43000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":14,"Phrase":"hostility"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":294,"Phrase":"Confrontational and bombastic."}}}}},{"offset":34000,"duration":10000,"end":44000,"analysis":{"Valence":{"Value":"26.35","Group":"negative"}}}],"analysisSummary":{"AnalysisResult":{"Temper":{"Mode":"high","ModePct":"77.78"},"Valence":{"Mode":"negative","ModePct":"100.00"},"Arousal":{"Mode":"high","ModePct":"100.00"}}}}
     * recordingId : 0763e734-5af0-49da-b188-661bdc437763
     */

    private String status;
    private ResultBean result;
    private String recordingId;

    public static ResponseHandler objectFromData(String str) {

        return new Gson().fromJson(str, ResponseHandler.class);
    }

    public static List<ResponseHandler> arrayResponseHandlerFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ResponseHandler>>() {
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

    public String getRecordingId() {
        return recordingId;
    }

    public void setRecordingId(String recordingId) {
        this.recordingId = recordingId;
    }

    public static class ResultBean {
        /**
         * duration : 49168.50
         * sessionStatus : Done
         * analysisSegments : [{"offset":0,"duration":10000,"end":10000,"analysis":{"Arousal":{"Value":"84.17","Group":"high"}}},{"offset":2000,"duration":10000,"end":12000,"analysis":{"Valence":{"Value":"11.81","Group":"negative"}}},{"offset":3000,"duration":10000,"end":13000,"analysis":{"Temper":{"Value":"66.79","Group":"medium"}}},{"offset":3000,"duration":10000,"end":13000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":3,"Phrase":"Enthusiastic"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":6,"Phrase":"Leadership, Charisma"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":18,"Phrase":"motivation"},"Secondary":{"Id":9,"Phrase":"egoism"}},"Composite":{"Primary":{"Id":392,"Phrase":"Enthusiasm. Inspiration. Discovery."},"Secondary":{"Id":143,"Phrase":"Insistence and stubbornness. Possibly childishness."}}}}},{"offset":4000,"duration":10000,"end":14000,"analysis":{"Arousal":{"Value":"83.23","Group":"high"}}},{"offset":4000,"duration":10000,"end":14000,"analysis":{"Valence":{"Value":"None","Group":"Unknown"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Temper":{"Value":"66.03","Group":"medium"}}},{"offset":6000,"duration":10000,"end":16000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":3,"Phrase":"Enthusiastic"},"Secondary":{"Id":5,"Phrase":"Happy"}},"Group11":{"Primary":{"Id":6,"Phrase":"Leadership, Charisma"},"Secondary":{"Id":4,"Phrase":"Friendly, Warm"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":11,"Phrase":"friendliness"}},"Composite":{"Primary":{"Id":251,"Phrase":"Emotional leadership, preaching. Mix of belonging and possessiveness."},"Secondary":{"Id":254,"Phrase":"Friendly communication."}}}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Temper":{"Value":"83.22","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Arousal":{"Value":"83.66","Group":"high"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Valence":{"Value":"12.29","Group":"negative"}}},{"offset":10000,"duration":10000,"end":20000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":11,"Phrase":"Supremacy, Arrogance"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":8,"Phrase":"dominance"},"Secondary":{"Id":10,"Phrase":"excitement"}},"Composite":{"Primary":{"Id":360,"Phrase":"Possessiveness. Extroverted egocentricity. Possibly pride."},"Secondary":{"Id":213,"Phrase":"Outburst from vulnerability."}}}}},{"offset":12000,"duration":10000,"end":22000,"analysis":{"Valence":{"Value":"13.13","Group":"negative"}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Temper":{"Value":"84.62","Group":"high"}}},{"offset":14000,"duration":10000,"end":24000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":5,"Phrase":"Hostility, Anger"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":10,"Phrase":"excitement"},"Secondary":{"Id":2,"Phrase":"anger"}},"Composite":{"Primary":{"Id":213,"Phrase":"Outburst from vulnerability."},"Secondary":{"Id":342,"Phrase":"Outburst of anger. Possibly from rejection."}}}}},{"offset":15000,"duration":10000,"end":25000,"analysis":{"Arousal":{"Value":"84.11","Group":"high"}}},{"offset":16000,"duration":10000,"end":26000,"analysis":{"Valence":{"Value":"11.19","Group":"negative"}}},{"offset":17000,"duration":10000,"end":27000,"analysis":{"Temper":{"Value":"84.43","Group":"high"}}},{"offset":17000,"duration":10000,"end":27000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":180,"Phrase":"Domineering. Possibly obsessive."}}}}},{"offset":19000,"duration":10000,"end":29000,"analysis":{"Arousal":{"Value":"84.29","Group":"high"}}},{"offset":21000,"duration":10000,"end":31000,"analysis":{"Temper":{"Value":"84.36","Group":"high"}}},{"offset":21000,"duration":10000,"end":31000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}},{"offset":22000,"duration":10000,"end":32000,"analysis":{"Arousal":{"Value":"84.92","Group":"high"}}},{"offset":22000,"duration":10000,"end":32000,"analysis":{"Valence":{"Value":"25.56","Group":"negative"}}},{"offset":25000,"duration":10000,"end":35000,"analysis":{"Valence":{"Value":"10.97","Group":"negative"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Temper":{"Value":"83.61","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Arousal":{"Value":"85.93","Group":"high"}}},{"offset":27000,"duration":10000,"end":37000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":11,"Phrase":"Supremacy, Arrogance"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":8,"Phrase":"dominance"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":390,"Phrase":"Enthusiasm. Superiority, aggressiveness."}}}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Temper":{"Value":"83.86","Group":"high"}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Arousal":{"Value":"85.82","Group":"high"}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Valence":{"Value":"26.84","Group":"negative"}}},{"offset":28000,"duration":10000,"end":38000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":14,"Phrase":"hostility"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":384,"Phrase":"Incitement. Negative expression of feelings."}}}}},{"offset":33000,"duration":10000,"end":43000,"analysis":{"Temper":{"Value":"84.52","Group":"high"}}},{"offset":33000,"duration":10000,"end":43000,"analysis":{"Arousal":{"Value":"85.47","Group":"high"}}},{"offset":33000,"duration":10000,"end":43000,"analysis":{"Mood":{"Group7":{"Primary":{"Id":1,"Phrase":"Angry"},"Secondary":{"Id":1,"Phrase":"Angry"}},"Group11":{"Primary":{"Id":2,"Phrase":"Criticism, Cynicism"},"Secondary":{"Id":5,"Phrase":"Hostility, Anger"}},"Group21":{"Primary":{"Id":7,"Phrase":"disliking"},"Secondary":{"Id":14,"Phrase":"hostility"}},"Composite":{"Primary":{"Id":357,"Phrase":"Suspicious. Demeaning."},"Secondary":{"Id":294,"Phrase":"Confrontational and bombastic."}}}}},{"offset":34000,"duration":10000,"end":44000,"analysis":{"Valence":{"Value":"26.35","Group":"negative"}}}]
         * analysisSummary : {"AnalysisResult":{"Temper":{"Mode":"high","ModePct":"77.78"},"Valence":{"Mode":"negative","ModePct":"100.00"},"Arousal":{"Mode":"high","ModePct":"100.00"}}}
         */

        private String duration;
        private String sessionStatus;
        private AnalysisSummaryBean analysisSummary;
        private List<AnalysisSegmentsBean> analysisSegments;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
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

        public AnalysisSummaryBean getAnalysisSummary() {
            return analysisSummary;
        }

        public void setAnalysisSummary(AnalysisSummaryBean analysisSummary) {
            this.analysisSummary = analysisSummary;
        }

        public List<AnalysisSegmentsBean> getAnalysisSegments() {
            return analysisSegments;
        }

        public void setAnalysisSegments(List<AnalysisSegmentsBean> analysisSegments) {
            this.analysisSegments = analysisSegments;
        }

        public static class AnalysisSummaryBean {
            /**
             * AnalysisResult : {"Temper":{"Mode":"high","ModePct":"77.78"},"Valence":{"Mode":"negative","ModePct":"100.00"},"Arousal":{"Mode":"high","ModePct":"100.00"}}
             */

            private AnalysisResultBean AnalysisResult;

            public static AnalysisSummaryBean objectFromData(String str) {

                return new Gson().fromJson(str, AnalysisSummaryBean.class);
            }

            public static List<AnalysisSummaryBean> arrayAnalysisSummaryBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<AnalysisSummaryBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public AnalysisResultBean getAnalysisResult() {
                return AnalysisResult;
            }

            public void setAnalysisResult(AnalysisResultBean AnalysisResult) {
                this.AnalysisResult = AnalysisResult;
            }

            public static class AnalysisResultBean {
                /**
                 * Temper : {"Mode":"high","ModePct":"77.78"}
                 * Valence : {"Mode":"negative","ModePct":"100.00"}
                 * Arousal : {"Mode":"high","ModePct":"100.00"}
                 */

                private TemperBean Temper;
                private ValenceBean Valence;
                private ArousalBean Arousal;

                public static AnalysisResultBean objectFromData(String str) {

                    return new Gson().fromJson(str, AnalysisResultBean.class);
                }

                public static List<AnalysisResultBean> arrayAnalysisResultBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<AnalysisResultBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public TemperBean getTemper() {
                    return Temper;
                }

                public void setTemper(TemperBean Temper) {
                    this.Temper = Temper;
                }

                public ValenceBean getValence() {
                    return Valence;
                }

                public void setValence(ValenceBean Valence) {
                    this.Valence = Valence;
                }

                public ArousalBean getArousal() {
                    return Arousal;
                }

                public void setArousal(ArousalBean Arousal) {
                    this.Arousal = Arousal;
                }

                public static class TemperBean {
                    /**
                     * Mode : high
                     * ModePct : 77.78
                     */

                    private String Mode;
                    private String ModePct;

                    public static TemperBean objectFromData(String str) {

                        return new Gson().fromJson(str, TemperBean.class);
                    }

                    public static List<TemperBean> arrayTemperBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<TemperBean>>() {
                            }.getType();

                            return new Gson().fromJson(jsonObject.getString(str), listType);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return new ArrayList();


                    }

                    public String getMode() {
                        return Mode;
                    }

                    public void setMode(String Mode) {
                        this.Mode = Mode;
                    }

                    public String getModePct() {
                        return ModePct;
                    }

                    public void setModePct(String ModePct) {
                        this.ModePct = ModePct;
                    }
                }

                public static class ValenceBean {
                    /**
                     * Mode : negative
                     * ModePct : 100.00
                     */

                    private String Mode;
                    private String ModePct;

                    public static ValenceBean objectFromData(String str) {

                        return new Gson().fromJson(str, ValenceBean.class);
                    }

                    public static List<ValenceBean> arrayValenceBeanFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<ValenceBean>>() {
                            }.getType();

                            return new Gson().fromJson(jsonObject.getString(str), listType);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return new ArrayList();


                    }

                    public String getMode() {
                        return Mode;
                    }

                    public void setMode(String Mode) {
                        this.Mode = Mode;
                    }

                    public String getModePct() {
                        return ModePct;
                    }

                    public void setModePct(String ModePct) {
                        this.ModePct = ModePct;
                    }
                }

                public static class ArousalBean {
                    /**
                     * Mode : high
                     * ModePct : 100.00
                     */

                    private String Mode;
                    private String ModePct;

                    public static ArousalBean objectFromData(String str) {

                        return new Gson().fromJson(str, ArousalBean.class);
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

                    public String getMode() {
                        return Mode;
                    }

                    public void setMode(String Mode) {
                        this.Mode = Mode;
                    }

                    public String getModePct() {
                        return ModePct;
                    }

                    public void setModePct(String ModePct) {
                        this.ModePct = ModePct;
                    }
                }
            }
        }

        public static class AnalysisSegmentsBean {
            /**
             * offset : 0
             * duration : 10000
             * end : 10000
             * analysis : {"Arousal":{"Value":"84.17","Group":"high"}}
             */

            private int offset;
            private int duration;
            private int end;
            private AnalysisBean analysis;

            public static AnalysisSegmentsBean objectFromData(String str) {

                return new Gson().fromJson(str, AnalysisSegmentsBean.class);
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
                 * Arousal : {"Value":"84.17","Group":"high"}
                 */

                private ArousalBeanX Arousal;

                public static AnalysisBean objectFromData(String str) {

                    return new Gson().fromJson(str, AnalysisBean.class);
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

                public ArousalBeanX getArousal() {
                    return Arousal;
                }

                public void setArousal(ArousalBeanX Arousal) {
                    this.Arousal = Arousal;
                }

                public static class ArousalBeanX {
                    /**
                     * Value : 84.17
                     * Group : high
                     */

                    private String Value;
                    private String Group;

                    public static ArousalBeanX objectFromData(String str) {

                        return new Gson().fromJson(str, ArousalBeanX.class);
                    }

                    public static List<ArousalBeanX> arrayArousalBeanXFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);
                            Type listType = new TypeToken<ArrayList<ArousalBeanX>>() {
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

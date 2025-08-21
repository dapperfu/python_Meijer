package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public class BulkRatingOptions {

    public enum Filter implements UGCOption {
        ContentLocale("ContentLocale");

        private final String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        Filter(String str) {
            this.key = str;
        }
    }

    public enum StatsType implements UGCOption {
        Reviews("Reviews"),
        NativeReviews("NativeReviews"),
        Questions("Questions"),
        Answers("Answers"),
        All("Reviews,NativeReviews,Questions,Answers");

        private String key;

        @Override // com.bazaarvoice.bvandroidsdk.UGCOption
        public String getKey() {
            return this.key;
        }

        StatsType(String str) {
            this.key = str;
        }
    }
}

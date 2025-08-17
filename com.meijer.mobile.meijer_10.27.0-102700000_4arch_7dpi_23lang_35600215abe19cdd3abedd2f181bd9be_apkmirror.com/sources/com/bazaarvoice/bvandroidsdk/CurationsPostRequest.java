package com.bazaarvoice.bvandroidsdk;

import L6.b;
import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class CurationsPostRequest {
    Builder builder;

    public static final class Builder {
        protected CurationsAuthor author;
        protected Bitmap bitmap;
        protected CurationsCoordinate coordinate;
        protected List<String> groups;
        protected List<CurationsLink> links;
        protected String permalink;
        protected List<CurationsPhoto> photos;
        protected String place;
        protected List<String> tags;
        protected String teaser;
        protected String text;
        protected Long timestampInSeconds;

        private Builder(CurationsAuthor curationsAuthor, List<String> list, String str) {
            this.author = curationsAuthor;
            this.groups = list;
            this.text = str;
        }

        public CurationsPostRequest build() {
            return new CurationsPostRequest(this);
        }

        public Builder geoCoordinates(Double d10, Double d11) {
            this.coordinate = new CurationsCoordinate(d10.doubleValue(), d11.doubleValue());
            return this;
        }

        public Builder links(List<CurationsLink> list) {
            this.links = list;
            return this;
        }

        public Builder permalink(String str) {
            this.permalink = str;
            return this;
        }

        public Builder place(String str) {
            this.place = str;
            return this;
        }

        public Builder tags(List<String> list) {
            this.tags = list;
            return this;
        }

        public Builder teaser(String str) {
            this.teaser = str;
            return this;
        }

        public Builder timestampInSeconds(Long l10) {
            this.timestampInSeconds = l10;
            return this;
        }

        public Builder(CurationsAuthor curationsAuthor, List<String> list, String str, Bitmap bitmap) {
            this(curationsAuthor, list, str);
            this.bitmap = bitmap;
        }

        public Builder(CurationsAuthor curationsAuthor, List<String> list, String str, List<CurationsPhoto> list2) {
            this(curationsAuthor, list, str);
            this.photos = list2;
        }
    }

    private CurationsPostRequest(Builder builder) {
        this.builder = builder;
    }

    protected String getJsonPayload() {
        HashMap map = new HashMap();
        map.put("author", this.builder.author);
        map.put("groups", this.builder.groups);
        map.put("text", this.builder.text);
        b.h(map, "coordinates", this.builder.coordinate);
        b.h(map, "permalink", this.builder.permalink);
        b.h(map, "place", this.builder.place);
        b.h(map, "tags", this.builder.tags);
        b.h(map, "teaser", this.builder.teaser);
        b.h(map, "timestamp", this.builder.timestampInSeconds);
        b.h(map, "links", this.builder.links);
        b.h(map, "photos", this.builder.photos);
        return BVSDK.getInstance().getBvWorkerData().getGson().x(map);
    }

    protected String toUrlQueryString() {
        BVSDK bvsdk = BVSDK.getInstance();
        BVUserProvidedData bvUserProvidedData = bvsdk.getBvUserProvidedData();
        return bvsdk.getBvWorkerData().getRootApiUrls().getBazaarvoiceApiRootUrl() + "curations/content/add/?client=" + bvUserProvidedData.getBvConfig().getClientId() + "&passkey=" + bvUserProvidedData.getBvConfig().getApiKeyCurations();
    }
}

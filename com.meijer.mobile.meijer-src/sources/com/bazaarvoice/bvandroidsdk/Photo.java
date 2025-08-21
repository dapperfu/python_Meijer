package com.bazaarvoice.bvandroidsdk;

import java.util.Map;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class Photo {

    @InterfaceC16127c("Caption")
    private String caption;

    @InterfaceC16127c("Sizes")
    private Content content;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC16127c("Id")
    private String f63854id;

    public class Content {
        private static final String kURL = "Url";

        @InterfaceC16127c("large")
        private Map<String, Object> large;
        private transient String largeUrl;

        @InterfaceC16127c("normal")
        private Map<String, Object> normal;
        private transient String normalUrl;

        @InterfaceC16127c("thumbnail")
        private Map<String, Object> thumbnail;
        private transient String thumbnailUrl;

        public Content() {
        }

        public String getLargeUrl() {
            return (String) this.large.get(kURL);
        }

        public String getNormalUrl() {
            return (String) this.normal.get(kURL);
        }

        public String getThumbnailUrl() {
            return (String) this.thumbnail.get(kURL);
        }
    }

    public String getCaption() {
        return this.caption;
    }

    public Content getContent() {
        return this.content;
    }

    public String getId() {
        return this.f63854id;
    }

    void setCaption(String str) {
        this.caption = str;
    }
}

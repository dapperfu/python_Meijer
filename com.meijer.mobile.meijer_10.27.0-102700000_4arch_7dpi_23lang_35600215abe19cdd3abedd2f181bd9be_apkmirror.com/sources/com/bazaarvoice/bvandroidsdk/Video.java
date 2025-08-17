package com.bazaarvoice.bvandroidsdk;

import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Video {

    @InterfaceC15617c("Caption")
    private String caption;

    @InterfaceC15617c("Sizes")
    private Content content;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c("Id")
    private String f63029id;

    public class Content {
        private static final String kURL = "Url";

        @InterfaceC15617c("normal")
        private Map<String, Object> normal;
        private transient String normalUrl;

        @InterfaceC15617c("thumbnail")
        private Map<String, Object> thumbnail;
        private transient String thumbnailUrl;

        public Content() {
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
        return this.f63029id;
    }

    void setCaption(String str) {
        this.caption = str;
    }
}

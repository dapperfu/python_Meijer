package com.bazaarvoice.bvandroidsdk;

import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class Badge {

    @InterfaceC16127c("BadgeType")
    private String badgeType;

    @InterfaceC16127c("ContentType")
    private String contentType;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC16127c("Id")
    private String f63841id;
    private transient Type type;

    public enum Type {
        Merit,
        Custom,
        Affiliation,
        Rank;

        /* JADX INFO: Access modifiers changed from: private */
        public static Type fromString(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return Custom;
            }
        }
    }

    private void setBadgeType(String str) {
        this.badgeType = str;
        this.type = Type.fromString(str);
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getId() {
        return this.f63841id;
    }

    public Type getType() {
        return Type.fromString(this.badgeType);
    }
}

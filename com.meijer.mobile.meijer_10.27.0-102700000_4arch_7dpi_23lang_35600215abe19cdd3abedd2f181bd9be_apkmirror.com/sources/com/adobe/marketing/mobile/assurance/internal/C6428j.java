package com.adobe.marketing.mobile.assurance.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/j;", "", "<init>", "()V", "", "closeCode", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "a", "(I)Lcom/adobe/marketing/mobile/assurance/internal/g;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.assurance.internal.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6428j {

    /* renamed from: a, reason: collision with root package name */
    public static final C6428j f62267a = new C6428j();

    @JvmStatic
    public static final EnumC6425g a(int closeCode) {
        if (closeCode == 1006) {
            return EnumC6425g.GENERIC_ERROR;
        }
        if (closeCode == 4400) {
            return EnumC6425g.CLIENT_ERROR;
        }
        switch (closeCode) {
            case 4900:
                return EnumC6425g.ORG_ID_MISMATCH;
            case 4901:
                return EnumC6425g.CONNECTION_LIMIT;
            case 4902:
                return EnumC6425g.EVENT_LIMIT;
            case 4903:
                return EnumC6425g.SESSION_DELETED;
            default:
                return null;
        }
    }

    private C6428j() {
    }
}

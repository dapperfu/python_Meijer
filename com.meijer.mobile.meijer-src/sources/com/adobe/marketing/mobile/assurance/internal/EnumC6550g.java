package com.adobe.marketing.mobile.assurance.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010j\u0002\b\u0013j\u0002\b\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/g;", "", "", "errorResId", "descriptionResId", "", "isRetryable", "<init>", "(Ljava/lang/String;IIIZ)V", "a", "I", "b", "c", "Z", "", "e", "()Ljava/lang/String;", "error", "description", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.assurance.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC6550g {
    GENERIC_ERROR(u5.b.f163725p, u5.b.f163713d, true),
    NO_ORG_ID(u5.b.f163726q, u5.b.f163714e, false),
    ORG_ID_MISMATCH(u5.b.f163732w, u5.b.f163720k, false),
    CONNECTION_LIMIT(u5.b.f163723n, u5.b.f163711b, false),
    EVENT_LIMIT(u5.b.f163724o, u5.b.f163712c, false),
    CLIENT_ERROR(u5.b.f163733x, u5.b.f163721l, false),
    SESSION_DELETED(u5.b.f163731v, u5.b.f163719j, false),
    CREATE_DEVICE_REQUEST_MALFORMED(u5.b.f163727r, u5.b.f163715f, false),
    STATUS_CHECK_REQUEST_MALFORMED(u5.b.f163727r, u5.b.f163715f, false),
    RETRY_LIMIT_REACHED(u5.b.f163730u, u5.b.f163718i, true),
    CREATE_DEVICE_REQUEST_FAILED(u5.b.f163729t, u5.b.f163717h, true),
    DEVICE_STATUS_REQUEST_FAILED(u5.b.f163729t, u5.b.f163717h, true),
    UNEXPECTED_ERROR(u5.b.f163728s, u5.b.f163716g, true);


    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorResId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int descriptionResId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean isRetryable;

    EnumC6550g(int i10, int i11, boolean z10) {
        this.errorResId = i10;
        this.descriptionResId = i11;
        this.isRetryable = z10;
    }

    public final String b() {
        String string;
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext != null) {
            string = applicationContext.getString(this.descriptionResId);
        } else {
            string = null;
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    public final String e() {
        String string;
        Context applicationContext = R5.K.f().a().getApplicationContext();
        if (applicationContext != null) {
            string = applicationContext.getString(this.errorResId);
        } else {
            string = null;
        }
        if (string == null) {
            return "";
        }
        return string;
    }
}

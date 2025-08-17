package com.adobe.marketing.mobile.assurance.internal;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010j\u0002\b\u0013j\u0002\b\u000fj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/g;", "", "", "errorResId", "descriptionResId", "", "isRetryable", "<init>", "(Ljava/lang/String;IIIZ)V", "a", "I", "b", "c", "Z", "", "e", "()Ljava/lang/String;", "error", "description", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.assurance.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC6425g {
    GENERIC_ERROR(t5.b.f161472p, t5.b.f161460d, true),
    NO_ORG_ID(t5.b.f161473q, t5.b.f161461e, false),
    ORG_ID_MISMATCH(t5.b.f161479w, t5.b.f161467k, false),
    CONNECTION_LIMIT(t5.b.f161470n, t5.b.f161458b, false),
    EVENT_LIMIT(t5.b.f161471o, t5.b.f161459c, false),
    CLIENT_ERROR(t5.b.f161480x, t5.b.f161468l, false),
    SESSION_DELETED(t5.b.f161478v, t5.b.f161466j, false),
    CREATE_DEVICE_REQUEST_MALFORMED(t5.b.f161474r, t5.b.f161462f, false),
    STATUS_CHECK_REQUEST_MALFORMED(t5.b.f161474r, t5.b.f161462f, false),
    RETRY_LIMIT_REACHED(t5.b.f161477u, t5.b.f161465i, true),
    CREATE_DEVICE_REQUEST_FAILED(t5.b.f161476t, t5.b.f161464h, true),
    DEVICE_STATUS_REQUEST_FAILED(t5.b.f161476t, t5.b.f161464h, true),
    UNEXPECTED_ERROR(t5.b.f161475s, t5.b.f161463g, true);


    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int errorResId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int descriptionResId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final boolean isRetryable;

    EnumC6425g(int i10, int i11, boolean z10) {
        this.errorResId = i10;
        this.descriptionResId = i11;
        this.isRetryable = z10;
    }

    public final String b() {
        String string;
        Context applicationContext = Q5.K.f().a().getApplicationContext();
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
        Context applicationContext = Q5.K.f().a().getApplicationContext();
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

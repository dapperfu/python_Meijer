package com.adobe.marketing.mobile.assurance.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/i;", "", "<init>", "()V", "", "b", "I", "a", "()I", "CONNECTION_TIMEOUT_MS", "c", "READ_TIMEOUT_MS", "", "d", "J", "()J", "STATUS_CHECK_DELAY_MS", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.assurance.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6427i {

    /* renamed from: a, reason: collision with root package name */
    public static final C6427i f62263a = new C6427i();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int CONNECTION_TIMEOUT_MS;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int READ_TIMEOUT_MS;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long STATUS_CHECK_DELAY_MS;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CONNECTION_TIMEOUT_MS = (int) timeUnit.toMillis(5L);
        READ_TIMEOUT_MS = (int) timeUnit.toMillis(5L);
        STATUS_CHECK_DELAY_MS = timeUnit.toMillis(2L);
    }

    public final int a() {
        return CONNECTION_TIMEOUT_MS;
    }

    public final int b() {
        return READ_TIMEOUT_MS;
    }

    public final long c() {
        return STATUS_CHECK_DELAY_MS;
    }

    private C6427i() {
    }
}

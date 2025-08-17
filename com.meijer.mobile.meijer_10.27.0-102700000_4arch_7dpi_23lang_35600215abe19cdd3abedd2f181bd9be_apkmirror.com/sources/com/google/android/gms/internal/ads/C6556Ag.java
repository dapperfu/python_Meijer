package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6556Ag {

    /* renamed from: a, reason: collision with root package name */
    public static final C7266Vf f65155a = C7266Vf.d("gads:trustless_token_for_decagon:enabled", true);

    /* renamed from: b, reason: collision with root package name */
    public static final C7266Vf f65156b;

    static {
        C7266Vf.d("gads:invalidate_token_at_refresh_start", true);
        C7266Vf.d("gms:expose_token_for_gma:enabled", true);
        C7266Vf.d("gads:referesh_rate_limit", false);
        f65156b = C7266Vf.b("gads:timeout_for_trustless_token:millis", 2000L);
        C7266Vf.d("gads:token_anonymization:enabled", true);
        C7266Vf.b("gads:cached_token:ttl_millis", 10800000L);
    }
}

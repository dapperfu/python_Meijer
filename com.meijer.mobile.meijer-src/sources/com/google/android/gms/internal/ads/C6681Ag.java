package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6681Ag {

    /* renamed from: a, reason: collision with root package name */
    public static final C7391Vf f65995a = C7391Vf.d("gads:trustless_token_for_decagon:enabled", true);

    /* renamed from: b, reason: collision with root package name */
    public static final C7391Vf f65996b;

    static {
        C7391Vf.d("gads:invalidate_token_at_refresh_start", true);
        C7391Vf.d("gms:expose_token_for_gma:enabled", true);
        C7391Vf.d("gads:referesh_rate_limit", false);
        f65996b = C7391Vf.b("gads:timeout_for_trustless_token:millis", 2000L);
        C7391Vf.d("gads:token_anonymization:enabled", true);
        C7391Vf.b("gads:cached_token:ttl_millis", 10800000L);
    }
}

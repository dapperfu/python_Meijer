package Rd;

import android.net.Uri;
import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g<Hd.e> f32486a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC1266a<Hd.e, a.d.c> f32487b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    private static final com.google.android.gms.common.api.a<a.d.c> f32488c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final i f32489d;

    /* JADX WARN: Type inference failed for: r0v1, types: [Hd.d, Rd.i] */
    static {
        a.g<Hd.e> gVar = new a.g<>();
        f32486a = gVar;
        h hVar = new h();
        f32487b = hVar;
        f32488c = new com.google.android.gms.common.api.a<>("Phenotype.API", hVar, gVar);
        f32489d = new Hd.d();
    }

    public static Uri a(String str) {
        String str2;
        String strValueOf = String.valueOf(Uri.encode(str));
        if (strValueOf.length() != 0) {
            str2 = "content://com.google.android.gms.phenotype/".concat(strValueOf);
        } else {
            str2 = new String("content://com.google.android.gms.phenotype/");
        }
        return Uri.parse(str2);
    }
}

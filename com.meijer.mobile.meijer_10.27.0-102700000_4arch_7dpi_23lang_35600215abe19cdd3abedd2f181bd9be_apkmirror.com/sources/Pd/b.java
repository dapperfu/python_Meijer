package Pd;

import android.net.Uri;
import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g<Fd.e> f25272a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC1257a<Fd.e, a.d.c> f25273b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    private static final com.google.android.gms.common.api.a<a.d.c> f25274c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    private static final i f25275d;

    /* JADX WARN: Type inference failed for: r0v1, types: [Fd.d, Pd.i] */
    static {
        a.g<Fd.e> gVar = new a.g<>();
        f25272a = gVar;
        h hVar = new h();
        f25273b = hVar;
        f25274c = new com.google.android.gms.common.api.a<>("Phenotype.API", hVar, gVar);
        f25275d = new Fd.d();
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

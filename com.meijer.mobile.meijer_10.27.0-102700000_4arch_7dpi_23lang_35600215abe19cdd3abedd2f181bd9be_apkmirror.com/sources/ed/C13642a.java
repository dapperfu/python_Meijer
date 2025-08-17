package ed;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.clearcut.C10280b;
import com.google.android.gms.internal.clearcut.U0;
import com.google.android.gms.internal.clearcut.Y1;
import com.google.android.gms.internal.clearcut.i2;
import com.google.android.gms.internal.clearcut.l2;
import com.google.android.gms.internal.clearcut.r2;
import com.google.android.gms.internal.clearcut.t2;
import java.util.ArrayList;
import java.util.TimeZone;

/* renamed from: ed.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13642a {

    /* renamed from: n, reason: collision with root package name */
    private static final a.g<l2> f128662n;

    /* renamed from: o, reason: collision with root package name */
    private static final a.AbstractC1257a<l2, a.d.c> f128663o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.common.api.a<a.d.c> f128664p;

    /* renamed from: q, reason: collision with root package name */
    private static final Pd.a[] f128665q;

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f128666r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[][] f128667s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f128668a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128669b;

    /* renamed from: c, reason: collision with root package name */
    private final int f128670c;

    /* renamed from: d, reason: collision with root package name */
    private String f128671d;

    /* renamed from: e, reason: collision with root package name */
    private int f128672e;

    /* renamed from: f, reason: collision with root package name */
    private String f128673f;

    /* renamed from: g, reason: collision with root package name */
    private String f128674g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f128675h;

    /* renamed from: i, reason: collision with root package name */
    private Y1 f128676i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC13644c f128677j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f128678k;

    /* renamed from: l, reason: collision with root package name */
    private d f128679l;

    /* renamed from: m, reason: collision with root package name */
    private final b f128680m;

    /* renamed from: ed.a$a, reason: collision with other inner class name */
    public class C2022a {

        /* renamed from: a, reason: collision with root package name */
        private int f128681a;

        /* renamed from: b, reason: collision with root package name */
        private String f128682b;

        /* renamed from: c, reason: collision with root package name */
        private String f128683c;

        /* renamed from: d, reason: collision with root package name */
        private String f128684d;

        /* renamed from: e, reason: collision with root package name */
        private Y1 f128685e;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList<Integer> f128686f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList<String> f128687g;

        /* renamed from: h, reason: collision with root package name */
        private ArrayList<Integer> f128688h;

        /* renamed from: i, reason: collision with root package name */
        private ArrayList<Pd.a> f128689i;

        /* renamed from: j, reason: collision with root package name */
        private ArrayList<byte[]> f128690j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f128691k;

        /* renamed from: l, reason: collision with root package name */
        private final i2 f128692l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f128693m;

        private C2022a(C13642a c13642a, byte[] bArr) {
            this(bArr, (c) null);
        }

        private C2022a(byte[] bArr, c cVar) {
            this.f128681a = C13642a.this.f128672e;
            this.f128682b = C13642a.this.f128671d;
            this.f128683c = C13642a.this.f128673f;
            this.f128684d = null;
            this.f128685e = C13642a.this.f128676i;
            this.f128686f = null;
            this.f128687g = null;
            this.f128688h = null;
            this.f128689i = null;
            this.f128690j = null;
            this.f128691k = true;
            i2 i2Var = new i2();
            this.f128692l = i2Var;
            this.f128693m = false;
            this.f128683c = C13642a.this.f128673f;
            this.f128684d = null;
            i2Var.f81477A = C10280b.a(C13642a.this.f128668a);
            i2Var.f81478c = C13642a.this.f128678k.a();
            i2Var.f81479d = C13642a.this.f128678k.c();
            d unused = C13642a.this.f128679l;
            i2Var.f81494s = TimeZone.getDefault().getOffset(i2Var.f81478c) / 1000;
            if (bArr != null) {
                i2Var.f81489n = bArr;
            }
        }

        public void a() {
            if (this.f128693m) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f128693m = true;
            C13647f c13647f = new C13647f(new t2(C13642a.this.f128669b, C13642a.this.f128670c, this.f128681a, this.f128682b, this.f128683c, this.f128684d, C13642a.this.f128675h, this.f128685e), this.f128692l, null, null, C13642a.f(null), null, C13642a.f(null), null, null, this.f128691k);
            if (C13642a.this.f128680m.a(c13647f)) {
                C13642a.this.f128677j.f(c13647f);
            } else {
                h.a(Status.f64735f, null);
            }
        }

        public C2022a b(int i10) {
            this.f128692l.f81482g = i10;
            return this;
        }

        /* synthetic */ C2022a(C13642a c13642a, byte[] bArr, C13643b c13643b) {
            this(c13642a, bArr);
        }
    }

    /* renamed from: ed.a$b */
    public interface b {
        boolean a(C13647f c13647f);
    }

    /* renamed from: ed.a$c */
    public interface c {
    }

    /* renamed from: ed.a$d */
    public static class d {
    }

    @VisibleForTesting
    private C13642a(Context context, int i10, String str, String str2, String str3, boolean z10, InterfaceC13644c interfaceC13644c, com.google.android.gms.common.util.f fVar, d dVar, b bVar) {
        this.f128672e = -1;
        Y1 y12 = Y1.DEFAULT;
        this.f128676i = y12;
        this.f128668a = context;
        this.f128669b = context.getPackageName();
        this.f128670c = b(context);
        this.f128672e = -1;
        this.f128671d = str;
        this.f128673f = str2;
        this.f128674g = null;
        this.f128675h = z10;
        this.f128677j = interfaceC13644c;
        this.f128678k = fVar;
        this.f128679l = new d();
        this.f128676i = y12;
        this.f128680m = bVar;
        if (z10) {
            r.b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
            return 0;
        }
    }

    static /* synthetic */ int[] f(ArrayList arrayList) {
        return d(null);
    }

    static {
        a.g<l2> gVar = new a.g<>();
        f128662n = gVar;
        C13643b c13643b = new C13643b();
        f128663o = c13643b;
        f128664p = new com.google.android.gms.common.api.a<>("ClearcutLogger.API", c13643b, gVar);
        f128665q = new Pd.a[0];
        f128666r = new String[0];
        f128667s = new byte[0][];
    }

    public C13642a(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, U0.p(context), i.d(), null, new r2(context));
    }

    private static int[] d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            Integer num = arrayList.get(i10);
            i10++;
            iArr[i11] = num.intValue();
            i11++;
        }
        return iArr;
    }

    public final C2022a a(byte[] bArr) {
        return new C2022a(this, bArr, (C13643b) null);
    }
}

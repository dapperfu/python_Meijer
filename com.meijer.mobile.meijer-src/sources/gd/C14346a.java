package gd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.clearcut.C10405b;
import com.google.android.gms.internal.clearcut.U0;
import com.google.android.gms.internal.clearcut.Y1;
import com.google.android.gms.internal.clearcut.i2;
import com.google.android.gms.internal.clearcut.l2;
import com.google.android.gms.internal.clearcut.r2;
import com.google.android.gms.internal.clearcut.t2;
import java.util.ArrayList;
import java.util.TimeZone;

/* renamed from: gd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14346a {

    /* renamed from: n, reason: collision with root package name */
    private static final a.g<l2> f134130n;

    /* renamed from: o, reason: collision with root package name */
    private static final a.AbstractC1266a<l2, a.d.c> f134131o;

    /* renamed from: p, reason: collision with root package name */
    @Deprecated
    public static final com.google.android.gms.common.api.a<a.d.c> f134132p;

    /* renamed from: q, reason: collision with root package name */
    private static final Rd.a[] f134133q;

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f134134r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[][] f134135s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f134136a;

    /* renamed from: b, reason: collision with root package name */
    private final String f134137b;

    /* renamed from: c, reason: collision with root package name */
    private final int f134138c;

    /* renamed from: d, reason: collision with root package name */
    private String f134139d;

    /* renamed from: e, reason: collision with root package name */
    private int f134140e;

    /* renamed from: f, reason: collision with root package name */
    private String f134141f;

    /* renamed from: g, reason: collision with root package name */
    private String f134142g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f134143h;

    /* renamed from: i, reason: collision with root package name */
    private Y1 f134144i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC14348c f134145j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f134146k;

    /* renamed from: l, reason: collision with root package name */
    private d f134147l;

    /* renamed from: m, reason: collision with root package name */
    private final b f134148m;

    /* renamed from: gd.a$a, reason: collision with other inner class name */
    public class C2120a {

        /* renamed from: a, reason: collision with root package name */
        private int f134149a;

        /* renamed from: b, reason: collision with root package name */
        private String f134150b;

        /* renamed from: c, reason: collision with root package name */
        private String f134151c;

        /* renamed from: d, reason: collision with root package name */
        private String f134152d;

        /* renamed from: e, reason: collision with root package name */
        private Y1 f134153e;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList<Integer> f134154f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList<String> f134155g;

        /* renamed from: h, reason: collision with root package name */
        private ArrayList<Integer> f134156h;

        /* renamed from: i, reason: collision with root package name */
        private ArrayList<Rd.a> f134157i;

        /* renamed from: j, reason: collision with root package name */
        private ArrayList<byte[]> f134158j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f134159k;

        /* renamed from: l, reason: collision with root package name */
        private final i2 f134160l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f134161m;

        private C2120a(C14346a c14346a, byte[] bArr) {
            this(bArr, (c) null);
        }

        private C2120a(byte[] bArr, c cVar) {
            this.f134149a = C14346a.this.f134140e;
            this.f134150b = C14346a.this.f134139d;
            this.f134151c = C14346a.this.f134141f;
            this.f134152d = null;
            this.f134153e = C14346a.this.f134144i;
            this.f134154f = null;
            this.f134155g = null;
            this.f134156h = null;
            this.f134157i = null;
            this.f134158j = null;
            this.f134159k = true;
            i2 i2Var = new i2();
            this.f134160l = i2Var;
            this.f134161m = false;
            this.f134151c = C14346a.this.f134141f;
            this.f134152d = null;
            i2Var.f82317A = C10405b.a(C14346a.this.f134136a);
            i2Var.f82318c = C14346a.this.f134146k.a();
            i2Var.f82319d = C14346a.this.f134146k.c();
            d unused = C14346a.this.f134147l;
            i2Var.f82334s = TimeZone.getDefault().getOffset(i2Var.f82318c) / 1000;
            if (bArr != null) {
                i2Var.f82329n = bArr;
            }
        }

        public void a() {
            if (this.f134161m) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f134161m = true;
            C14351f c14351f = new C14351f(new t2(C14346a.this.f134137b, C14346a.this.f134138c, this.f134149a, this.f134150b, this.f134151c, this.f134152d, C14346a.this.f134143h, this.f134153e), this.f134160l, null, null, C14346a.f(null), null, C14346a.f(null), null, null, this.f134159k);
            if (C14346a.this.f134148m.a(c14351f)) {
                C14346a.this.f134145j.k(c14351f);
            } else {
                h.a(Status.f65575f, null);
            }
        }

        public C2120a b(int i10) {
            this.f134160l.f82322g = i10;
            return this;
        }

        /* synthetic */ C2120a(C14346a c14346a, byte[] bArr, C14347b c14347b) {
            this(c14346a, bArr);
        }
    }

    /* renamed from: gd.a$b */
    public interface b {
        boolean a(C14351f c14351f);
    }

    /* renamed from: gd.a$c */
    public interface c {
    }

    /* renamed from: gd.a$d */
    public static class d {
    }

    @VisibleForTesting
    private C14346a(Context context, int i10, String str, String str2, String str3, boolean z10, InterfaceC14348c interfaceC14348c, com.google.android.gms.common.util.f fVar, d dVar, b bVar) {
        this.f134140e = -1;
        Y1 y12 = Y1.DEFAULT;
        this.f134144i = y12;
        this.f134136a = context;
        this.f134137b = context.getPackageName();
        this.f134138c = b(context);
        this.f134140e = -1;
        this.f134139d = str;
        this.f134141f = str2;
        this.f134142g = null;
        this.f134143h = z10;
        this.f134145j = interfaceC14348c;
        this.f134146k = fVar;
        this.f134147l = new d();
        this.f134144i = y12;
        this.f134148m = bVar;
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
        f134130n = gVar;
        C14347b c14347b = new C14347b();
        f134131o = c14347b;
        f134132p = new com.google.android.gms.common.api.a<>("ClearcutLogger.API", c14347b, gVar);
        f134133q = new Rd.a[0];
        f134134r = new String[0];
        f134135s = new byte[0][];
    }

    public C14346a(Context context, String str, String str2) {
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

    public final C2120a a(byte[] bArr) {
        return new C2120a(this, bArr, (C14347b) null);
    }
}

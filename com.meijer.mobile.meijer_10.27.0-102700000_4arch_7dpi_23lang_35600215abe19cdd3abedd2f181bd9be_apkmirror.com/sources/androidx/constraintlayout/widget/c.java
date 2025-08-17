package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f53158d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    private static SparseIntArray f53159e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f53160a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f53161b = true;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<Integer, a> f53162c = new HashMap<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f53163a;

        /* renamed from: b, reason: collision with root package name */
        public final d f53164b = new d();

        /* renamed from: c, reason: collision with root package name */
        public final C1091c f53165c = new C1091c();

        /* renamed from: d, reason: collision with root package name */
        public final b f53166d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f53167e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f53168f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f53163a = i10;
            b bVar2 = this.f53166d;
            bVar2.f53210h = bVar.f53064d;
            bVar2.f53212i = bVar.f53066e;
            bVar2.f53214j = bVar.f53068f;
            bVar2.f53216k = bVar.f53070g;
            bVar2.f53217l = bVar.f53072h;
            bVar2.f53218m = bVar.f53074i;
            bVar2.f53219n = bVar.f53076j;
            bVar2.f53220o = bVar.f53078k;
            bVar2.f53221p = bVar.f53080l;
            bVar2.f53222q = bVar.f53088p;
            bVar2.f53223r = bVar.f53089q;
            bVar2.f53224s = bVar.f53090r;
            bVar2.f53225t = bVar.f53091s;
            bVar2.f53226u = bVar.f53098z;
            bVar2.f53227v = bVar.f53032A;
            bVar2.f53228w = bVar.f53033B;
            bVar2.f53229x = bVar.f53082m;
            bVar2.f53230y = bVar.f53084n;
            bVar2.f53231z = bVar.f53086o;
            bVar2.f53170A = bVar.f53048Q;
            bVar2.f53171B = bVar.f53049R;
            bVar2.f53172C = bVar.f53050S;
            bVar2.f53208g = bVar.f53062c;
            bVar2.f53204e = bVar.f53058a;
            bVar2.f53206f = bVar.f53060b;
            bVar2.f53200c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f53202d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f53173D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f53174E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f53175F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f53176G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f53185P = bVar.f53037F;
            bVar2.f53186Q = bVar.f53036E;
            bVar2.f53188S = bVar.f53039H;
            bVar2.f53187R = bVar.f53038G;
            bVar2.f53211h0 = bVar.f53051T;
            bVar2.f53213i0 = bVar.f53052U;
            bVar2.f53189T = bVar.f53040I;
            bVar2.f53190U = bVar.f53041J;
            bVar2.f53191V = bVar.f53044M;
            bVar2.f53192W = bVar.f53045N;
            bVar2.f53193X = bVar.f53042K;
            bVar2.f53194Y = bVar.f53043L;
            bVar2.f53195Z = bVar.f53046O;
            bVar2.f53197a0 = bVar.f53047P;
            bVar2.f53209g0 = bVar.f53053V;
            bVar2.f53180K = bVar.f53093u;
            bVar2.f53182M = bVar.f53095w;
            bVar2.f53179J = bVar.f53092t;
            bVar2.f53181L = bVar.f53094v;
            bVar2.f53184O = bVar.f53096x;
            bVar2.f53183N = bVar.f53097y;
            bVar2.f53177H = bVar.getMarginEnd();
            this.f53166d.f53178I = bVar.getMarginStart();
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f53166d;
            bVar.f53064d = bVar2.f53210h;
            bVar.f53066e = bVar2.f53212i;
            bVar.f53068f = bVar2.f53214j;
            bVar.f53070g = bVar2.f53216k;
            bVar.f53072h = bVar2.f53217l;
            bVar.f53074i = bVar2.f53218m;
            bVar.f53076j = bVar2.f53219n;
            bVar.f53078k = bVar2.f53220o;
            bVar.f53080l = bVar2.f53221p;
            bVar.f53088p = bVar2.f53222q;
            bVar.f53089q = bVar2.f53223r;
            bVar.f53090r = bVar2.f53224s;
            bVar.f53091s = bVar2.f53225t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f53173D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f53174E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f53175F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f53176G;
            bVar.f53096x = bVar2.f53184O;
            bVar.f53097y = bVar2.f53183N;
            bVar.f53093u = bVar2.f53180K;
            bVar.f53095w = bVar2.f53182M;
            bVar.f53098z = bVar2.f53226u;
            bVar.f53032A = bVar2.f53227v;
            bVar.f53082m = bVar2.f53229x;
            bVar.f53084n = bVar2.f53230y;
            bVar.f53086o = bVar2.f53231z;
            bVar.f53033B = bVar2.f53228w;
            bVar.f53048Q = bVar2.f53170A;
            bVar.f53049R = bVar2.f53171B;
            bVar.f53037F = bVar2.f53185P;
            bVar.f53036E = bVar2.f53186Q;
            bVar.f53039H = bVar2.f53188S;
            bVar.f53038G = bVar2.f53187R;
            bVar.f53051T = bVar2.f53211h0;
            bVar.f53052U = bVar2.f53213i0;
            bVar.f53040I = bVar2.f53189T;
            bVar.f53041J = bVar2.f53190U;
            bVar.f53044M = bVar2.f53191V;
            bVar.f53045N = bVar2.f53192W;
            bVar.f53042K = bVar2.f53193X;
            bVar.f53043L = bVar2.f53194Y;
            bVar.f53046O = bVar2.f53195Z;
            bVar.f53047P = bVar2.f53197a0;
            bVar.f53050S = bVar2.f53172C;
            bVar.f53062c = bVar2.f53208g;
            bVar.f53058a = bVar2.f53204e;
            bVar.f53060b = bVar2.f53206f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f53200c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f53202d;
            String str = bVar2.f53209g0;
            if (str != null) {
                bVar.f53053V = str;
            }
            bVar.setMarginStart(bVar2.f53178I);
            bVar.setMarginEnd(this.f53166d.f53177H);
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f53166d.a(this.f53166d);
            aVar.f53165c.a(this.f53165c);
            aVar.f53164b.a(this.f53164b);
            aVar.f53167e.a(this.f53167e);
            aVar.f53163a = this.f53163a;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, Constraints.a aVar) {
            f(i10, aVar);
            this.f53164b.f53243d = aVar.f53111p0;
            e eVar = this.f53167e;
            eVar.f53247b = aVar.f53114s0;
            eVar.f53248c = aVar.f53115t0;
            eVar.f53249d = aVar.f53116u0;
            eVar.f53250e = aVar.f53117v0;
            eVar.f53251f = aVar.f53118w0;
            eVar.f53252g = aVar.f53119x0;
            eVar.f53253h = aVar.f53120y0;
            eVar.f53254i = aVar.f53121z0;
            eVar.f53255j = aVar.f53109A0;
            eVar.f53256k = aVar.f53110B0;
            eVar.f53258m = aVar.f53113r0;
            eVar.f53257l = aVar.f53112q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(ConstraintHelper constraintHelper, int i10, Constraints.a aVar) {
            g(i10, aVar);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f53166d;
                bVar.f53203d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f53199b0 = barrier.getType();
                this.f53166d.f53205e0 = barrier.getReferencedIds();
                this.f53166d.f53201c0 = barrier.getMargin();
            }
        }
    }

    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f53169k0;

        /* renamed from: c, reason: collision with root package name */
        public int f53200c;

        /* renamed from: d, reason: collision with root package name */
        public int f53202d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f53205e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f53207f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f53209g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53196a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f53198b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f53204e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f53206f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f53208g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f53210h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f53212i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f53214j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f53216k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f53217l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f53218m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f53219n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f53220o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f53221p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f53222q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f53223r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f53224s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f53225t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f53226u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f53227v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f53228w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f53229x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f53230y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f53231z = 0.0f;

        /* renamed from: A, reason: collision with root package name */
        public int f53170A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f53171B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f53172C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f53173D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f53174E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f53175F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f53176G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f53177H = -1;

        /* renamed from: I, reason: collision with root package name */
        public int f53178I = -1;

        /* renamed from: J, reason: collision with root package name */
        public int f53179J = -1;

        /* renamed from: K, reason: collision with root package name */
        public int f53180K = -1;

        /* renamed from: L, reason: collision with root package name */
        public int f53181L = -1;

        /* renamed from: M, reason: collision with root package name */
        public int f53182M = -1;

        /* renamed from: N, reason: collision with root package name */
        public int f53183N = -1;

        /* renamed from: O, reason: collision with root package name */
        public int f53184O = -1;

        /* renamed from: P, reason: collision with root package name */
        public float f53185P = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public float f53186Q = -1.0f;

        /* renamed from: R, reason: collision with root package name */
        public int f53187R = 0;

        /* renamed from: S, reason: collision with root package name */
        public int f53188S = 0;

        /* renamed from: T, reason: collision with root package name */
        public int f53189T = 0;

        /* renamed from: U, reason: collision with root package name */
        public int f53190U = 0;

        /* renamed from: V, reason: collision with root package name */
        public int f53191V = -1;

        /* renamed from: W, reason: collision with root package name */
        public int f53192W = -1;

        /* renamed from: X, reason: collision with root package name */
        public int f53193X = -1;

        /* renamed from: Y, reason: collision with root package name */
        public int f53194Y = -1;

        /* renamed from: Z, reason: collision with root package name */
        public float f53195Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f53197a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f53199b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f53201c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f53203d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f53211h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f53213i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f53215j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f53169k0 = sparseIntArray;
            sparseIntArray.append(f.f53449d4, 24);
            f53169k0.append(f.f53456e4, 25);
            f53169k0.append(f.f53470g4, 28);
            f53169k0.append(f.f53477h4, 29);
            f53169k0.append(f.f53512m4, 35);
            f53169k0.append(f.f53505l4, 34);
            f53169k0.append(f.f53355O3, 4);
            f53169k0.append(f.f53349N3, 3);
            f53169k0.append(f.f53337L3, 1);
            f53169k0.append(f.f53547r4, 6);
            f53169k0.append(f.f53554s4, 7);
            f53169k0.append(f.f53397V3, 17);
            f53169k0.append(f.f53403W3, 18);
            f53169k0.append(f.f53409X3, 19);
            f53169k0.append(f.f53581w3, 26);
            f53169k0.append(f.f53484i4, 31);
            f53169k0.append(f.f53491j4, 32);
            f53169k0.append(f.f53391U3, 10);
            f53169k0.append(f.f53385T3, 9);
            f53169k0.append(f.f53575v4, 13);
            f53169k0.append(f.f53596y4, 16);
            f53169k0.append(f.f53582w4, 14);
            f53169k0.append(f.f53561t4, 11);
            f53169k0.append(f.f53589x4, 15);
            f53169k0.append(f.f53568u4, 12);
            f53169k0.append(f.f53533p4, 38);
            f53169k0.append(f.f53435b4, 37);
            f53169k0.append(f.f53428a4, 39);
            f53169k0.append(f.f53526o4, 40);
            f53169k0.append(f.f53421Z3, 20);
            f53169k0.append(f.f53519n4, 36);
            f53169k0.append(f.f53379S3, 5);
            f53169k0.append(f.f53442c4, 76);
            f53169k0.append(f.f53498k4, 76);
            f53169k0.append(f.f53463f4, 76);
            f53169k0.append(f.f53343M3, 76);
            f53169k0.append(f.f53331K3, 76);
            f53169k0.append(f.f53602z3, 23);
            f53169k0.append(f.f53270B3, 27);
            f53169k0.append(f.f53284D3, 30);
            f53169k0.append(f.f53291E3, 8);
            f53169k0.append(f.f53263A3, 33);
            f53169k0.append(f.f53277C3, 2);
            f53169k0.append(f.f53588x3, 22);
            f53169k0.append(f.f53595y3, 21);
            f53169k0.append(f.f53361P3, 61);
            f53169k0.append(f.f53373R3, 62);
            f53169k0.append(f.f53367Q3, 63);
            f53169k0.append(f.f53540q4, 69);
            f53169k0.append(f.f53415Y3, 70);
            f53169k0.append(f.f53319I3, 71);
            f53169k0.append(f.f53305G3, 72);
            f53169k0.append(f.f53312H3, 73);
            f53169k0.append(f.f53325J3, 74);
            f53169k0.append(f.f53298F3, 75);
        }

        public void a(b bVar) {
            this.f53196a = bVar.f53196a;
            this.f53200c = bVar.f53200c;
            this.f53198b = bVar.f53198b;
            this.f53202d = bVar.f53202d;
            this.f53204e = bVar.f53204e;
            this.f53206f = bVar.f53206f;
            this.f53208g = bVar.f53208g;
            this.f53210h = bVar.f53210h;
            this.f53212i = bVar.f53212i;
            this.f53214j = bVar.f53214j;
            this.f53216k = bVar.f53216k;
            this.f53217l = bVar.f53217l;
            this.f53218m = bVar.f53218m;
            this.f53219n = bVar.f53219n;
            this.f53220o = bVar.f53220o;
            this.f53221p = bVar.f53221p;
            this.f53222q = bVar.f53222q;
            this.f53223r = bVar.f53223r;
            this.f53224s = bVar.f53224s;
            this.f53225t = bVar.f53225t;
            this.f53226u = bVar.f53226u;
            this.f53227v = bVar.f53227v;
            this.f53228w = bVar.f53228w;
            this.f53229x = bVar.f53229x;
            this.f53230y = bVar.f53230y;
            this.f53231z = bVar.f53231z;
            this.f53170A = bVar.f53170A;
            this.f53171B = bVar.f53171B;
            this.f53172C = bVar.f53172C;
            this.f53173D = bVar.f53173D;
            this.f53174E = bVar.f53174E;
            this.f53175F = bVar.f53175F;
            this.f53176G = bVar.f53176G;
            this.f53177H = bVar.f53177H;
            this.f53178I = bVar.f53178I;
            this.f53179J = bVar.f53179J;
            this.f53180K = bVar.f53180K;
            this.f53181L = bVar.f53181L;
            this.f53182M = bVar.f53182M;
            this.f53183N = bVar.f53183N;
            this.f53184O = bVar.f53184O;
            this.f53185P = bVar.f53185P;
            this.f53186Q = bVar.f53186Q;
            this.f53187R = bVar.f53187R;
            this.f53188S = bVar.f53188S;
            this.f53189T = bVar.f53189T;
            this.f53190U = bVar.f53190U;
            this.f53191V = bVar.f53191V;
            this.f53192W = bVar.f53192W;
            this.f53193X = bVar.f53193X;
            this.f53194Y = bVar.f53194Y;
            this.f53195Z = bVar.f53195Z;
            this.f53197a0 = bVar.f53197a0;
            this.f53199b0 = bVar.f53199b0;
            this.f53201c0 = bVar.f53201c0;
            this.f53203d0 = bVar.f53203d0;
            this.f53209g0 = bVar.f53209g0;
            int[] iArr = bVar.f53205e0;
            if (iArr != null) {
                this.f53205e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f53205e0 = null;
            }
            this.f53207f0 = bVar.f53207f0;
            this.f53211h0 = bVar.f53211h0;
            this.f53213i0 = bVar.f53213i0;
            this.f53215j0 = bVar.f53215j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53574v3);
            this.f53198b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f53169k0.get(index);
                if (i11 == 80) {
                    this.f53211h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f53211h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f53221p = c.t(typedArrayObtainStyledAttributes, index, this.f53221p);
                            break;
                        case 2:
                            this.f53176G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53176G);
                            break;
                        case 3:
                            this.f53220o = c.t(typedArrayObtainStyledAttributes, index, this.f53220o);
                            break;
                        case 4:
                            this.f53219n = c.t(typedArrayObtainStyledAttributes, index, this.f53219n);
                            break;
                        case 5:
                            this.f53228w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f53170A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53170A);
                            break;
                        case 7:
                            this.f53171B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53171B);
                            break;
                        case 8:
                            this.f53177H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53177H);
                            break;
                        case 9:
                            this.f53225t = c.t(typedArrayObtainStyledAttributes, index, this.f53225t);
                            break;
                        case 10:
                            this.f53224s = c.t(typedArrayObtainStyledAttributes, index, this.f53224s);
                            break;
                        case 11:
                            this.f53182M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53182M);
                            break;
                        case 12:
                            this.f53183N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53183N);
                            break;
                        case 13:
                            this.f53179J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53179J);
                            break;
                        case 14:
                            this.f53181L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53181L);
                            break;
                        case 15:
                            this.f53184O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53184O);
                            break;
                        case 16:
                            this.f53180K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53180K);
                            break;
                        case 17:
                            this.f53204e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53204e);
                            break;
                        case 18:
                            this.f53206f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53206f);
                            break;
                        case 19:
                            this.f53208g = typedArrayObtainStyledAttributes.getFloat(index, this.f53208g);
                            break;
                        case 20:
                            this.f53226u = typedArrayObtainStyledAttributes.getFloat(index, this.f53226u);
                            break;
                        case 21:
                            this.f53202d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f53202d);
                            break;
                        case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                            this.f53200c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f53200c);
                            break;
                        case 23:
                            this.f53173D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53173D);
                            break;
                        case 24:
                            this.f53210h = c.t(typedArrayObtainStyledAttributes, index, this.f53210h);
                            break;
                        case 25:
                            this.f53212i = c.t(typedArrayObtainStyledAttributes, index, this.f53212i);
                            break;
                        case 26:
                            this.f53172C = typedArrayObtainStyledAttributes.getInt(index, this.f53172C);
                            break;
                        case 27:
                            this.f53174E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53174E);
                            break;
                        case 28:
                            this.f53214j = c.t(typedArrayObtainStyledAttributes, index, this.f53214j);
                            break;
                        case 29:
                            this.f53216k = c.t(typedArrayObtainStyledAttributes, index, this.f53216k);
                            break;
                        case 30:
                            this.f53178I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53178I);
                            break;
                        case 31:
                            this.f53222q = c.t(typedArrayObtainStyledAttributes, index, this.f53222q);
                            break;
                        case l3.f92486e /* 32 */:
                            this.f53223r = c.t(typedArrayObtainStyledAttributes, index, this.f53223r);
                            break;
                        case 33:
                            this.f53175F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53175F);
                            break;
                        case 34:
                            this.f53218m = c.t(typedArrayObtainStyledAttributes, index, this.f53218m);
                            break;
                        case 35:
                            this.f53217l = c.t(typedArrayObtainStyledAttributes, index, this.f53217l);
                            break;
                        case 36:
                            this.f53227v = typedArrayObtainStyledAttributes.getFloat(index, this.f53227v);
                            break;
                        case 37:
                            this.f53186Q = typedArrayObtainStyledAttributes.getFloat(index, this.f53186Q);
                            break;
                        case 38:
                            this.f53185P = typedArrayObtainStyledAttributes.getFloat(index, this.f53185P);
                            break;
                        case 39:
                            this.f53187R = typedArrayObtainStyledAttributes.getInt(index, this.f53187R);
                            break;
                        case 40:
                            this.f53188S = typedArrayObtainStyledAttributes.getInt(index, this.f53188S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f53189T = typedArrayObtainStyledAttributes.getInt(index, this.f53189T);
                                    break;
                                case 55:
                                    this.f53190U = typedArrayObtainStyledAttributes.getInt(index, this.f53190U);
                                    break;
                                case 56:
                                    this.f53191V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53191V);
                                    break;
                                case 57:
                                    this.f53192W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53192W);
                                    break;
                                case 58:
                                    this.f53193X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53193X);
                                    break;
                                case 59:
                                    this.f53194Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53194Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f53229x = c.t(typedArrayObtainStyledAttributes, index, this.f53229x);
                                            break;
                                        case 62:
                                            this.f53230y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53230y);
                                            break;
                                        case 63:
                                            this.f53231z = typedArrayObtainStyledAttributes.getFloat(index, this.f53231z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f53195Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f53197a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    FS.log_e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f53199b0 = typedArrayObtainStyledAttributes.getInt(index, this.f53199b0);
                                                    break;
                                                case 73:
                                                    this.f53201c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53201c0);
                                                    break;
                                                case 74:
                                                    this.f53207f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f53215j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f53215j0);
                                                    break;
                                                case 76:
                                                    FS.log_w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f53169k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f53209g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    FS.log_w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f53169k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f53213i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f53213i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C1091c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f53232h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53233a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f53234b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f53235c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f53236d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f53237e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f53238f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f53239g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f53232h = sparseIntArray;
            sparseIntArray.append(f.f53326J4, 1);
            f53232h.append(f.f53338L4, 2);
            f53232h.append(f.f53344M4, 3);
            f53232h.append(f.f53320I4, 4);
            f53232h.append(f.f53313H4, 5);
            f53232h.append(f.f53332K4, 6);
        }

        public void a(C1091c c1091c) {
            this.f53233a = c1091c.f53233a;
            this.f53234b = c1091c.f53234b;
            this.f53235c = c1091c.f53235c;
            this.f53236d = c1091c.f53236d;
            this.f53237e = c1091c.f53237e;
            this.f53239g = c1091c.f53239g;
            this.f53238f = c1091c.f53238f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53306G4);
            this.f53233a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f53232h.get(index)) {
                    case 1:
                        this.f53239g = typedArrayObtainStyledAttributes.getFloat(index, this.f53239g);
                        break;
                    case 2:
                        this.f53236d = typedArrayObtainStyledAttributes.getInt(index, this.f53236d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f53235c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f53235c = S1.a.f33134c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f53237e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f53234b = c.t(typedArrayObtainStyledAttributes, index, this.f53234b);
                        break;
                    case 6:
                        this.f53238f = typedArrayObtainStyledAttributes.getFloat(index, this.f53238f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f53240a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f53241b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f53242c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f53243d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f53244e = Float.NaN;

        public void a(d dVar) {
            this.f53240a = dVar.f53240a;
            this.f53241b = dVar.f53241b;
            this.f53243d = dVar.f53243d;
            this.f53244e = dVar.f53244e;
            this.f53242c = dVar.f53242c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53398V4);
            this.f53240a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53410X4) {
                    this.f53243d = typedArrayObtainStyledAttributes.getFloat(index, this.f53243d);
                } else if (index == f.f53404W4) {
                    this.f53241b = typedArrayObtainStyledAttributes.getInt(index, this.f53241b);
                    this.f53241b = c.f53158d[this.f53241b];
                } else if (index == f.f53422Z4) {
                    this.f53242c = typedArrayObtainStyledAttributes.getInt(index, this.f53242c);
                } else if (index == f.f53416Y4) {
                    this.f53244e = typedArrayObtainStyledAttributes.getFloat(index, this.f53244e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f53245n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53246a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f53247b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f53248c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f53249d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f53250e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f53251f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f53252g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f53253h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f53254i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f53255j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f53256k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f53257l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f53258m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f53245n = sparseIntArray;
            sparseIntArray.append(f.f53562t5, 1);
            f53245n.append(f.f53569u5, 2);
            f53245n.append(f.f53576v5, 3);
            f53245n.append(f.f53548r5, 4);
            f53245n.append(f.f53555s5, 5);
            f53245n.append(f.f53520n5, 6);
            f53245n.append(f.f53527o5, 7);
            f53245n.append(f.f53534p5, 8);
            f53245n.append(f.f53541q5, 9);
            f53245n.append(f.f53583w5, 10);
            f53245n.append(f.f53590x5, 11);
        }

        public void a(e eVar) {
            this.f53246a = eVar.f53246a;
            this.f53247b = eVar.f53247b;
            this.f53248c = eVar.f53248c;
            this.f53249d = eVar.f53249d;
            this.f53250e = eVar.f53250e;
            this.f53251f = eVar.f53251f;
            this.f53252g = eVar.f53252g;
            this.f53253h = eVar.f53253h;
            this.f53254i = eVar.f53254i;
            this.f53255j = eVar.f53255j;
            this.f53256k = eVar.f53256k;
            this.f53257l = eVar.f53257l;
            this.f53258m = eVar.f53258m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53513m5);
            this.f53246a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f53245n.get(index)) {
                    case 1:
                        this.f53247b = typedArrayObtainStyledAttributes.getFloat(index, this.f53247b);
                        break;
                    case 2:
                        this.f53248c = typedArrayObtainStyledAttributes.getFloat(index, this.f53248c);
                        break;
                    case 3:
                        this.f53249d = typedArrayObtainStyledAttributes.getFloat(index, this.f53249d);
                        break;
                    case 4:
                        this.f53250e = typedArrayObtainStyledAttributes.getFloat(index, this.f53250e);
                        break;
                    case 5:
                        this.f53251f = typedArrayObtainStyledAttributes.getFloat(index, this.f53251f);
                        break;
                    case 6:
                        this.f53252g = typedArrayObtainStyledAttributes.getDimension(index, this.f53252g);
                        break;
                    case 7:
                        this.f53253h = typedArrayObtainStyledAttributes.getDimension(index, this.f53253h);
                        break;
                    case 8:
                        this.f53254i = typedArrayObtainStyledAttributes.getDimension(index, this.f53254i);
                        break;
                    case 9:
                        this.f53255j = typedArrayObtainStyledAttributes.getDimension(index, this.f53255j);
                        break;
                    case 10:
                        this.f53256k = typedArrayObtainStyledAttributes.getDimension(index, this.f53256k);
                        break;
                    case 11:
                        this.f53257l = true;
                        this.f53258m = typedArrayObtainStyledAttributes.getDimension(index, this.f53258m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53159e = sparseIntArray;
        sparseIntArray.append(f.f53564u0, 25);
        f53159e.append(f.f53571v0, 26);
        f53159e.append(f.f53585x0, 29);
        f53159e.append(f.f53592y0, 30);
        f53159e.append(f.f53288E0, 36);
        f53159e.append(f.f53281D0, 35);
        f53159e.append(f.f53438c0, 4);
        f53159e.append(f.f53431b0, 3);
        f53159e.append(f.f53417Z, 1);
        f53159e.append(f.f53340M0, 6);
        f53159e.append(f.f53346N0, 7);
        f53159e.append(f.f53487j0, 17);
        f53159e.append(f.f53494k0, 18);
        f53159e.append(f.f53501l0, 19);
        f53159e.append(f.f53549s, 27);
        f53159e.append(f.f53599z0, 32);
        f53159e.append(f.f53260A0, 33);
        f53159e.append(f.f53480i0, 10);
        f53159e.append(f.f53473h0, 9);
        f53159e.append(f.f53364Q0, 13);
        f53159e.append(f.f53382T0, 16);
        f53159e.append(f.f53370R0, 14);
        f53159e.append(f.f53352O0, 11);
        f53159e.append(f.f53376S0, 15);
        f53159e.append(f.f53358P0, 12);
        f53159e.append(f.f53309H0, 40);
        f53159e.append(f.f53550s0, 39);
        f53159e.append(f.f53543r0, 41);
        f53159e.append(f.f53302G0, 42);
        f53159e.append(f.f53536q0, 20);
        f53159e.append(f.f53295F0, 37);
        f53159e.append(f.f53466g0, 5);
        f53159e.append(f.f53557t0, 82);
        f53159e.append(f.f53274C0, 82);
        f53159e.append(f.f53578w0, 82);
        f53159e.append(f.f53424a0, 82);
        f53159e.append(f.f53411Y, 82);
        f53159e.append(f.f53584x, 24);
        f53159e.append(f.f53598z, 28);
        f53159e.append(f.f53333L, 31);
        f53159e.append(f.f53339M, 8);
        f53159e.append(f.f53591y, 34);
        f53159e.append(f.f53259A, 2);
        f53159e.append(f.f53570v, 23);
        f53159e.append(f.f53577w, 21);
        f53159e.append(f.f53563u, 22);
        f53159e.append(f.f53266B, 43);
        f53159e.append(f.f53351O, 44);
        f53159e.append(f.f53321J, 45);
        f53159e.append(f.f53327K, 46);
        f53159e.append(f.f53315I, 60);
        f53159e.append(f.f53301G, 47);
        f53159e.append(f.f53308H, 48);
        f53159e.append(f.f53273C, 49);
        f53159e.append(f.f53280D, 50);
        f53159e.append(f.f53287E, 51);
        f53159e.append(f.f53294F, 52);
        f53159e.append(f.f53345N, 53);
        f53159e.append(f.f53316I0, 54);
        f53159e.append(f.f53508m0, 55);
        f53159e.append(f.f53322J0, 56);
        f53159e.append(f.f53515n0, 57);
        f53159e.append(f.f53328K0, 58);
        f53159e.append(f.f53522o0, 59);
        f53159e.append(f.f53445d0, 61);
        f53159e.append(f.f53459f0, 62);
        f53159e.append(f.f53452e0, 63);
        f53159e.append(f.f53357P, 64);
        f53159e.append(f.f53406X0, 65);
        f53159e.append(f.f53393V, 66);
        f53159e.append(f.f53412Y0, 67);
        f53159e.append(f.f53394V0, 79);
        f53159e.append(f.f53556t, 38);
        f53159e.append(f.f53388U0, 68);
        f53159e.append(f.f53334L0, 69);
        f53159e.append(f.f53529p0, 70);
        f53159e.append(f.f53381T, 71);
        f53159e.append(f.f53369R, 72);
        f53159e.append(f.f53375S, 73);
        f53159e.append(f.f53387U, 74);
        f53159e.append(f.f53363Q, 75);
        f53159e.append(f.f53400W0, 76);
        f53159e.append(f.f53267B0, 77);
        f53159e.append(f.f53418Z0, 78);
        f53159e.append(f.f53405X, 80);
        f53159e.append(f.f53399W, 81);
    }

    public void c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    private int[] o(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objN;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = androidx.constraintlayout.widget.e.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, PreferencesHelper.PREF_ID, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objN = ((ConstraintLayout) view.getParent()).n(0, strTrim)) != null && (objN instanceof Integer)) {
                iIntValue = ((Integer) objN).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a p(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53542r);
        u(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a q(int i10) {
        if (!this.f53162c.containsKey(Integer.valueOf(i10))) {
            this.f53162c.put(Integer.valueOf(i10), new a());
        }
        return this.f53162c.get(Integer.valueOf(i10));
    }

    public void e(int i10, int i11) {
        if (this.f53162c.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f53162c.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f53166d;
                    bVar.f53212i = -1;
                    bVar.f53210h = -1;
                    bVar.f53173D = -1;
                    bVar.f53179J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f53166d;
                    bVar2.f53216k = -1;
                    bVar2.f53214j = -1;
                    bVar2.f53174E = -1;
                    bVar2.f53181L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f53166d;
                    bVar3.f53218m = -1;
                    bVar3.f53217l = -1;
                    bVar3.f53175F = -1;
                    bVar3.f53180K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f53166d;
                    bVar4.f53219n = -1;
                    bVar4.f53220o = -1;
                    bVar4.f53176G = -1;
                    bVar4.f53182M = -1;
                    return;
                case 5:
                    aVar.f53166d.f53221p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f53166d;
                    bVar5.f53222q = -1;
                    bVar5.f53223r = -1;
                    bVar5.f53178I = -1;
                    bVar5.f53184O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f53166d;
                    bVar6.f53224s = -1;
                    bVar6.f53225t = -1;
                    bVar6.f53177H = -1;
                    bVar6.f53183N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f53162c.containsKey(Integer.valueOf(i10))) {
            this.f53162c.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f53162c.get(Integer.valueOf(i10));
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f53166d;
                    bVar.f53210h = i12;
                    bVar.f53212i = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + w(i13) + " undefined");
                    }
                    b bVar2 = aVar.f53166d;
                    bVar2.f53212i = i12;
                    bVar2.f53210h = -1;
                }
                aVar.f53166d.f53173D = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f53166d;
                    bVar3.f53214j = i12;
                    bVar3.f53216k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar4 = aVar.f53166d;
                    bVar4.f53216k = i12;
                    bVar4.f53214j = -1;
                }
                aVar.f53166d.f53174E = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f53166d;
                    bVar5.f53217l = i12;
                    bVar5.f53218m = -1;
                    bVar5.f53221p = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar6 = aVar.f53166d;
                    bVar6.f53218m = i12;
                    bVar6.f53217l = -1;
                    bVar6.f53221p = -1;
                }
                aVar.f53166d.f53175F = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f53166d;
                    bVar7.f53220o = i12;
                    bVar7.f53219n = -1;
                    bVar7.f53221p = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar8 = aVar.f53166d;
                    bVar8.f53219n = i12;
                    bVar8.f53220o = -1;
                    bVar8.f53221p = -1;
                }
                aVar.f53166d.f53176G = i14;
                return;
            case 5:
                if (i13 != 5) {
                    throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                }
                b bVar9 = aVar.f53166d;
                bVar9.f53221p = i12;
                bVar9.f53220o = -1;
                bVar9.f53219n = -1;
                bVar9.f53217l = -1;
                bVar9.f53218m = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar10 = aVar.f53166d;
                    bVar10.f53223r = i12;
                    bVar10.f53222q = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar11 = aVar.f53166d;
                    bVar11.f53222q = i12;
                    bVar11.f53223r = -1;
                }
                aVar.f53166d.f53178I = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar12 = aVar.f53166d;
                    bVar12.f53225t = i12;
                    bVar12.f53224s = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar13 = aVar.f53166d;
                    bVar13.f53224s = i12;
                    bVar13.f53225t = -1;
                }
                aVar.f53166d.f53177H = i14;
                return;
            default:
                throw new IllegalArgumentException(w(i11) + " to " + w(i13) + " unknown");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int t(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    private void u(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != f.f53556t && f.f53333L != index && f.f53339M != index) {
                aVar.f53165c.f53233a = true;
                aVar.f53166d.f53198b = true;
                aVar.f53164b.f53240a = true;
                aVar.f53167e.f53246a = true;
            }
            switch (f53159e.get(index)) {
                case 1:
                    b bVar = aVar.f53166d;
                    bVar.f53221p = t(typedArray, index, bVar.f53221p);
                    break;
                case 2:
                    b bVar2 = aVar.f53166d;
                    bVar2.f53176G = typedArray.getDimensionPixelSize(index, bVar2.f53176G);
                    break;
                case 3:
                    b bVar3 = aVar.f53166d;
                    bVar3.f53220o = t(typedArray, index, bVar3.f53220o);
                    break;
                case 4:
                    b bVar4 = aVar.f53166d;
                    bVar4.f53219n = t(typedArray, index, bVar4.f53219n);
                    break;
                case 5:
                    aVar.f53166d.f53228w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f53166d;
                    bVar5.f53170A = typedArray.getDimensionPixelOffset(index, bVar5.f53170A);
                    break;
                case 7:
                    b bVar6 = aVar.f53166d;
                    bVar6.f53171B = typedArray.getDimensionPixelOffset(index, bVar6.f53171B);
                    break;
                case 8:
                    b bVar7 = aVar.f53166d;
                    bVar7.f53177H = typedArray.getDimensionPixelSize(index, bVar7.f53177H);
                    break;
                case 9:
                    b bVar8 = aVar.f53166d;
                    bVar8.f53225t = t(typedArray, index, bVar8.f53225t);
                    break;
                case 10:
                    b bVar9 = aVar.f53166d;
                    bVar9.f53224s = t(typedArray, index, bVar9.f53224s);
                    break;
                case 11:
                    b bVar10 = aVar.f53166d;
                    bVar10.f53182M = typedArray.getDimensionPixelSize(index, bVar10.f53182M);
                    break;
                case 12:
                    b bVar11 = aVar.f53166d;
                    bVar11.f53183N = typedArray.getDimensionPixelSize(index, bVar11.f53183N);
                    break;
                case 13:
                    b bVar12 = aVar.f53166d;
                    bVar12.f53179J = typedArray.getDimensionPixelSize(index, bVar12.f53179J);
                    break;
                case 14:
                    b bVar13 = aVar.f53166d;
                    bVar13.f53181L = typedArray.getDimensionPixelSize(index, bVar13.f53181L);
                    break;
                case 15:
                    b bVar14 = aVar.f53166d;
                    bVar14.f53184O = typedArray.getDimensionPixelSize(index, bVar14.f53184O);
                    break;
                case 16:
                    b bVar15 = aVar.f53166d;
                    bVar15.f53180K = typedArray.getDimensionPixelSize(index, bVar15.f53180K);
                    break;
                case 17:
                    b bVar16 = aVar.f53166d;
                    bVar16.f53204e = typedArray.getDimensionPixelOffset(index, bVar16.f53204e);
                    break;
                case 18:
                    b bVar17 = aVar.f53166d;
                    bVar17.f53206f = typedArray.getDimensionPixelOffset(index, bVar17.f53206f);
                    break;
                case 19:
                    b bVar18 = aVar.f53166d;
                    bVar18.f53208g = typedArray.getFloat(index, bVar18.f53208g);
                    break;
                case 20:
                    b bVar19 = aVar.f53166d;
                    bVar19.f53226u = typedArray.getFloat(index, bVar19.f53226u);
                    break;
                case 21:
                    b bVar20 = aVar.f53166d;
                    bVar20.f53202d = typedArray.getLayoutDimension(index, bVar20.f53202d);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    d dVar = aVar.f53164b;
                    dVar.f53241b = typedArray.getInt(index, dVar.f53241b);
                    d dVar2 = aVar.f53164b;
                    dVar2.f53241b = f53158d[dVar2.f53241b];
                    break;
                case 23:
                    b bVar21 = aVar.f53166d;
                    bVar21.f53200c = typedArray.getLayoutDimension(index, bVar21.f53200c);
                    break;
                case 24:
                    b bVar22 = aVar.f53166d;
                    bVar22.f53173D = typedArray.getDimensionPixelSize(index, bVar22.f53173D);
                    break;
                case 25:
                    b bVar23 = aVar.f53166d;
                    bVar23.f53210h = t(typedArray, index, bVar23.f53210h);
                    break;
                case 26:
                    b bVar24 = aVar.f53166d;
                    bVar24.f53212i = t(typedArray, index, bVar24.f53212i);
                    break;
                case 27:
                    b bVar25 = aVar.f53166d;
                    bVar25.f53172C = typedArray.getInt(index, bVar25.f53172C);
                    break;
                case 28:
                    b bVar26 = aVar.f53166d;
                    bVar26.f53174E = typedArray.getDimensionPixelSize(index, bVar26.f53174E);
                    break;
                case 29:
                    b bVar27 = aVar.f53166d;
                    bVar27.f53214j = t(typedArray, index, bVar27.f53214j);
                    break;
                case 30:
                    b bVar28 = aVar.f53166d;
                    bVar28.f53216k = t(typedArray, index, bVar28.f53216k);
                    break;
                case 31:
                    b bVar29 = aVar.f53166d;
                    bVar29.f53178I = typedArray.getDimensionPixelSize(index, bVar29.f53178I);
                    break;
                case l3.f92486e /* 32 */:
                    b bVar30 = aVar.f53166d;
                    bVar30.f53222q = t(typedArray, index, bVar30.f53222q);
                    break;
                case 33:
                    b bVar31 = aVar.f53166d;
                    bVar31.f53223r = t(typedArray, index, bVar31.f53223r);
                    break;
                case 34:
                    b bVar32 = aVar.f53166d;
                    bVar32.f53175F = typedArray.getDimensionPixelSize(index, bVar32.f53175F);
                    break;
                case 35:
                    b bVar33 = aVar.f53166d;
                    bVar33.f53218m = t(typedArray, index, bVar33.f53218m);
                    break;
                case 36:
                    b bVar34 = aVar.f53166d;
                    bVar34.f53217l = t(typedArray, index, bVar34.f53217l);
                    break;
                case 37:
                    b bVar35 = aVar.f53166d;
                    bVar35.f53227v = typedArray.getFloat(index, bVar35.f53227v);
                    break;
                case 38:
                    aVar.f53163a = typedArray.getResourceId(index, aVar.f53163a);
                    break;
                case 39:
                    b bVar36 = aVar.f53166d;
                    bVar36.f53186Q = typedArray.getFloat(index, bVar36.f53186Q);
                    break;
                case 40:
                    b bVar37 = aVar.f53166d;
                    bVar37.f53185P = typedArray.getFloat(index, bVar37.f53185P);
                    break;
                case 41:
                    b bVar38 = aVar.f53166d;
                    bVar38.f53187R = typedArray.getInt(index, bVar38.f53187R);
                    break;
                case 42:
                    b bVar39 = aVar.f53166d;
                    bVar39.f53188S = typedArray.getInt(index, bVar39.f53188S);
                    break;
                case 43:
                    d dVar3 = aVar.f53164b;
                    dVar3.f53243d = typedArray.getFloat(index, dVar3.f53243d);
                    break;
                case 44:
                    e eVar = aVar.f53167e;
                    eVar.f53257l = true;
                    eVar.f53258m = typedArray.getDimension(index, eVar.f53258m);
                    break;
                case 45:
                    e eVar2 = aVar.f53167e;
                    eVar2.f53248c = typedArray.getFloat(index, eVar2.f53248c);
                    break;
                case 46:
                    e eVar3 = aVar.f53167e;
                    eVar3.f53249d = typedArray.getFloat(index, eVar3.f53249d);
                    break;
                case 47:
                    e eVar4 = aVar.f53167e;
                    eVar4.f53250e = typedArray.getFloat(index, eVar4.f53250e);
                    break;
                case 48:
                    e eVar5 = aVar.f53167e;
                    eVar5.f53251f = typedArray.getFloat(index, eVar5.f53251f);
                    break;
                case 49:
                    e eVar6 = aVar.f53167e;
                    eVar6.f53252g = typedArray.getDimension(index, eVar6.f53252g);
                    break;
                case 50:
                    e eVar7 = aVar.f53167e;
                    eVar7.f53253h = typedArray.getDimension(index, eVar7.f53253h);
                    break;
                case 51:
                    e eVar8 = aVar.f53167e;
                    eVar8.f53254i = typedArray.getDimension(index, eVar8.f53254i);
                    break;
                case 52:
                    e eVar9 = aVar.f53167e;
                    eVar9.f53255j = typedArray.getDimension(index, eVar9.f53255j);
                    break;
                case 53:
                    e eVar10 = aVar.f53167e;
                    eVar10.f53256k = typedArray.getDimension(index, eVar10.f53256k);
                    break;
                case 54:
                    b bVar40 = aVar.f53166d;
                    bVar40.f53189T = typedArray.getInt(index, bVar40.f53189T);
                    break;
                case 55:
                    b bVar41 = aVar.f53166d;
                    bVar41.f53190U = typedArray.getInt(index, bVar41.f53190U);
                    break;
                case 56:
                    b bVar42 = aVar.f53166d;
                    bVar42.f53191V = typedArray.getDimensionPixelSize(index, bVar42.f53191V);
                    break;
                case 57:
                    b bVar43 = aVar.f53166d;
                    bVar43.f53192W = typedArray.getDimensionPixelSize(index, bVar43.f53192W);
                    break;
                case 58:
                    b bVar44 = aVar.f53166d;
                    bVar44.f53193X = typedArray.getDimensionPixelSize(index, bVar44.f53193X);
                    break;
                case 59:
                    b bVar45 = aVar.f53166d;
                    bVar45.f53194Y = typedArray.getDimensionPixelSize(index, bVar45.f53194Y);
                    break;
                case 60:
                    e eVar11 = aVar.f53167e;
                    eVar11.f53247b = typedArray.getFloat(index, eVar11.f53247b);
                    break;
                case 61:
                    b bVar46 = aVar.f53166d;
                    bVar46.f53229x = t(typedArray, index, bVar46.f53229x);
                    break;
                case 62:
                    b bVar47 = aVar.f53166d;
                    bVar47.f53230y = typedArray.getDimensionPixelSize(index, bVar47.f53230y);
                    break;
                case 63:
                    b bVar48 = aVar.f53166d;
                    bVar48.f53231z = typedArray.getFloat(index, bVar48.f53231z);
                    break;
                case 64:
                    C1091c c1091c = aVar.f53165c;
                    c1091c.f53234b = t(typedArray, index, c1091c.f53234b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f53165c.f53235c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f53165c.f53235c = S1.a.f33134c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f53165c.f53237e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C1091c c1091c2 = aVar.f53165c;
                    c1091c2.f53239g = typedArray.getFloat(index, c1091c2.f53239g);
                    break;
                case 68:
                    d dVar4 = aVar.f53164b;
                    dVar4.f53244e = typedArray.getFloat(index, dVar4.f53244e);
                    break;
                case 69:
                    aVar.f53166d.f53195Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f53166d.f53197a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    FS.log_e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f53166d;
                    bVar49.f53199b0 = typedArray.getInt(index, bVar49.f53199b0);
                    break;
                case 73:
                    b bVar50 = aVar.f53166d;
                    bVar50.f53201c0 = typedArray.getDimensionPixelSize(index, bVar50.f53201c0);
                    break;
                case 74:
                    aVar.f53166d.f53207f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f53166d;
                    bVar51.f53215j0 = typedArray.getBoolean(index, bVar51.f53215j0);
                    break;
                case 76:
                    C1091c c1091c3 = aVar.f53165c;
                    c1091c3.f53236d = typedArray.getInt(index, c1091c3.f53236d);
                    break;
                case 77:
                    aVar.f53166d.f53209g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f53164b;
                    dVar5.f53242c = typedArray.getInt(index, dVar5.f53242c);
                    break;
                case 79:
                    C1091c c1091c4 = aVar.f53165c;
                    c1091c4.f53238f = typedArray.getFloat(index, c1091c4.f53238f);
                    break;
                case BinsView.LABEL_WIDTH_DP /* 80 */:
                    b bVar52 = aVar.f53166d;
                    bVar52.f53211h0 = typedArray.getBoolean(index, bVar52.f53211h0);
                    break;
                case 81:
                    b bVar53 = aVar.f53166d;
                    bVar53.f53213i0 = typedArray.getBoolean(index, bVar53.f53213i0);
                    break;
                case 82:
                    FS.log_w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f53159e.get(index));
                    break;
                default:
                    FS.log_w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f53159e.get(index));
                    break;
            }
        }
    }

    private String w(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    void d(ConstraintLayout constraintLayout, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f53162c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f53162c.containsKey(Integer.valueOf(id2))) {
                FS.log_w("ConstraintSet", "id unknown " + T1.a.a(childAt));
            } else {
                if (this.f53161b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f53162c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f53162c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            aVar.f53166d.f53203d0 = 1;
                        }
                        int i11 = aVar.f53166d.f53203d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f53166d.f53199b0);
                            barrier.setMargin(aVar.f53166d.f53201c0);
                            barrier.setAllowsGoneWidget(aVar.f53166d.f53215j0);
                            b bVar = aVar.f53166d;
                            int[] iArr = bVar.f53205e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f53207f0;
                                if (str != null) {
                                    bVar.f53205e0 = o(barrier, str);
                                    barrier.setReferencedIds(aVar.f53166d.f53205e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f53168f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f53164b;
                        if (dVar.f53242c == 0) {
                            childAt.setVisibility(dVar.f53241b);
                        }
                        childAt.setAlpha(aVar.f53164b.f53243d);
                        childAt.setRotation(aVar.f53167e.f53247b);
                        childAt.setRotationX(aVar.f53167e.f53248c);
                        childAt.setRotationY(aVar.f53167e.f53249d);
                        childAt.setScaleX(aVar.f53167e.f53250e);
                        childAt.setScaleY(aVar.f53167e.f53251f);
                        if (!Float.isNaN(aVar.f53167e.f53252g)) {
                            childAt.setPivotX(aVar.f53167e.f53252g);
                        }
                        if (!Float.isNaN(aVar.f53167e.f53253h)) {
                            childAt.setPivotY(aVar.f53167e.f53253h);
                        }
                        childAt.setTranslationX(aVar.f53167e.f53254i);
                        childAt.setTranslationY(aVar.f53167e.f53255j);
                        childAt.setTranslationZ(aVar.f53167e.f53256k);
                        e eVar = aVar.f53167e;
                        if (eVar.f53257l) {
                            childAt.setElevation(eVar.f53258m);
                        }
                    } else {
                        FS.log_v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f53162c.get(num);
            int i12 = aVar2.f53166d.f53203d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f53166d;
                int[] iArr2 = bVar3.f53205e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f53207f0;
                    if (str2 != null) {
                        bVar3.f53205e0 = o(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f53166d.f53205e0);
                    }
                }
                barrier2.setType(aVar2.f53166d.f53199b0);
                barrier2.setMargin(aVar2.f53166d.f53201c0);
                ConstraintLayout.b bVarL = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                aVar2.d(bVarL);
                constraintLayout.addView(barrier2, bVarL);
            }
            if (aVar2.f53166d.f53196a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarL2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(bVarL2);
                constraintLayout.addView(guideline, bVarL2);
            }
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f53162c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f53161b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f53162c.containsKey(Integer.valueOf(id2))) {
                this.f53162c.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f53162c.get(Integer.valueOf(id2));
            aVar.f53168f = androidx.constraintlayout.widget.a.a(this.f53160a, childAt);
            aVar.f(id2, bVar);
            aVar.f53164b.f53241b = childAt.getVisibility();
            aVar.f53164b.f53243d = childAt.getAlpha();
            aVar.f53167e.f53247b = childAt.getRotation();
            aVar.f53167e.f53248c = childAt.getRotationX();
            aVar.f53167e.f53249d = childAt.getRotationY();
            aVar.f53167e.f53250e = childAt.getScaleX();
            aVar.f53167e.f53251f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f53167e;
                eVar.f53252g = pivotX;
                eVar.f53253h = pivotY;
            }
            aVar.f53167e.f53254i = childAt.getTranslationX();
            aVar.f53167e.f53255j = childAt.getTranslationY();
            aVar.f53167e.f53256k = childAt.getTranslationZ();
            e eVar2 = aVar.f53167e;
            if (eVar2.f53257l) {
                eVar2.f53258m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f53166d.f53215j0 = barrier.n();
                aVar.f53166d.f53205e0 = barrier.getReferencedIds();
                aVar.f53166d.f53199b0 = barrier.getType();
                aVar.f53166d.f53201c0 = barrier.getMargin();
            }
        }
    }

    public void h(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f53162c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraints.getChildAt(i10);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f53161b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f53162c.containsKey(Integer.valueOf(id2))) {
                this.f53162c.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f53162c.get(Integer.valueOf(id2));
            if (childAt instanceof ConstraintHelper) {
                aVar2.h((ConstraintHelper) childAt, id2, aVar);
            }
            aVar2.g(id2, aVar);
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = q(i10).f53166d;
        bVar.f53229x = i11;
        bVar.f53230y = i12;
        bVar.f53231z = f10;
    }

    public void k(int i10, int i11) {
        q(i10).f53166d.f53190U = i11;
    }

    public void l(int i10, int i11) {
        q(i10).f53166d.f53189T = i11;
    }

    public void m(int i10, int i11) {
        q(i10).f53166d.f53202d = i11;
    }

    public void n(int i10, int i11) {
        q(i10).f53166d.f53200c = i11;
    }

    public void r(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        a aVarP = p(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            aVarP.f53166d.f53196a = true;
                        }
                        this.f53162c.put(Integer.valueOf(aVarP.f53163a), aVarP);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.s(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void v(int i10, String str) {
        q(i10).f53166d.f53228w = str;
    }
}

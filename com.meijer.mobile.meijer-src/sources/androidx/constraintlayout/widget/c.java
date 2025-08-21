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
    private static final int[] f53382d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    private static SparseIntArray f53383e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f53384a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f53385b = true;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<Integer, a> f53386c = new HashMap<>();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f53387a;

        /* renamed from: b, reason: collision with root package name */
        public final d f53388b = new d();

        /* renamed from: c, reason: collision with root package name */
        public final C1104c f53389c = new C1104c();

        /* renamed from: d, reason: collision with root package name */
        public final b f53390d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f53391e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f53392f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f53387a = i10;
            b bVar2 = this.f53390d;
            bVar2.f53434h = bVar.f53288d;
            bVar2.f53436i = bVar.f53290e;
            bVar2.f53438j = bVar.f53292f;
            bVar2.f53440k = bVar.f53294g;
            bVar2.f53441l = bVar.f53296h;
            bVar2.f53442m = bVar.f53298i;
            bVar2.f53443n = bVar.f53300j;
            bVar2.f53444o = bVar.f53302k;
            bVar2.f53445p = bVar.f53304l;
            bVar2.f53446q = bVar.f53312p;
            bVar2.f53447r = bVar.f53313q;
            bVar2.f53448s = bVar.f53314r;
            bVar2.f53449t = bVar.f53315s;
            bVar2.f53450u = bVar.f53322z;
            bVar2.f53451v = bVar.f53256A;
            bVar2.f53452w = bVar.f53257B;
            bVar2.f53453x = bVar.f53306m;
            bVar2.f53454y = bVar.f53308n;
            bVar2.f53455z = bVar.f53310o;
            bVar2.f53394A = bVar.f53272Q;
            bVar2.f53395B = bVar.f53273R;
            bVar2.f53396C = bVar.f53274S;
            bVar2.f53432g = bVar.f53286c;
            bVar2.f53428e = bVar.f53282a;
            bVar2.f53430f = bVar.f53284b;
            bVar2.f53424c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f53426d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f53397D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f53398E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f53399F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f53400G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f53409P = bVar.f53261F;
            bVar2.f53410Q = bVar.f53260E;
            bVar2.f53412S = bVar.f53263H;
            bVar2.f53411R = bVar.f53262G;
            bVar2.f53435h0 = bVar.f53275T;
            bVar2.f53437i0 = bVar.f53276U;
            bVar2.f53413T = bVar.f53264I;
            bVar2.f53414U = bVar.f53265J;
            bVar2.f53415V = bVar.f53268M;
            bVar2.f53416W = bVar.f53269N;
            bVar2.f53417X = bVar.f53266K;
            bVar2.f53418Y = bVar.f53267L;
            bVar2.f53419Z = bVar.f53270O;
            bVar2.f53421a0 = bVar.f53271P;
            bVar2.f53433g0 = bVar.f53277V;
            bVar2.f53404K = bVar.f53317u;
            bVar2.f53406M = bVar.f53319w;
            bVar2.f53403J = bVar.f53316t;
            bVar2.f53405L = bVar.f53318v;
            bVar2.f53408O = bVar.f53320x;
            bVar2.f53407N = bVar.f53321y;
            bVar2.f53401H = bVar.getMarginEnd();
            this.f53390d.f53402I = bVar.getMarginStart();
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f53390d;
            bVar.f53288d = bVar2.f53434h;
            bVar.f53290e = bVar2.f53436i;
            bVar.f53292f = bVar2.f53438j;
            bVar.f53294g = bVar2.f53440k;
            bVar.f53296h = bVar2.f53441l;
            bVar.f53298i = bVar2.f53442m;
            bVar.f53300j = bVar2.f53443n;
            bVar.f53302k = bVar2.f53444o;
            bVar.f53304l = bVar2.f53445p;
            bVar.f53312p = bVar2.f53446q;
            bVar.f53313q = bVar2.f53447r;
            bVar.f53314r = bVar2.f53448s;
            bVar.f53315s = bVar2.f53449t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f53397D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f53398E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f53399F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f53400G;
            bVar.f53320x = bVar2.f53408O;
            bVar.f53321y = bVar2.f53407N;
            bVar.f53317u = bVar2.f53404K;
            bVar.f53319w = bVar2.f53406M;
            bVar.f53322z = bVar2.f53450u;
            bVar.f53256A = bVar2.f53451v;
            bVar.f53306m = bVar2.f53453x;
            bVar.f53308n = bVar2.f53454y;
            bVar.f53310o = bVar2.f53455z;
            bVar.f53257B = bVar2.f53452w;
            bVar.f53272Q = bVar2.f53394A;
            bVar.f53273R = bVar2.f53395B;
            bVar.f53261F = bVar2.f53409P;
            bVar.f53260E = bVar2.f53410Q;
            bVar.f53263H = bVar2.f53412S;
            bVar.f53262G = bVar2.f53411R;
            bVar.f53275T = bVar2.f53435h0;
            bVar.f53276U = bVar2.f53437i0;
            bVar.f53264I = bVar2.f53413T;
            bVar.f53265J = bVar2.f53414U;
            bVar.f53268M = bVar2.f53415V;
            bVar.f53269N = bVar2.f53416W;
            bVar.f53266K = bVar2.f53417X;
            bVar.f53267L = bVar2.f53418Y;
            bVar.f53270O = bVar2.f53419Z;
            bVar.f53271P = bVar2.f53421a0;
            bVar.f53274S = bVar2.f53396C;
            bVar.f53286c = bVar2.f53432g;
            bVar.f53282a = bVar2.f53428e;
            bVar.f53284b = bVar2.f53430f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f53424c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f53426d;
            String str = bVar2.f53433g0;
            if (str != null) {
                bVar.f53277V = str;
            }
            bVar.setMarginStart(bVar2.f53402I);
            bVar.setMarginEnd(this.f53390d.f53401H);
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f53390d.a(this.f53390d);
            aVar.f53389c.a(this.f53389c);
            aVar.f53388b.a(this.f53388b);
            aVar.f53391e.a(this.f53391e);
            aVar.f53387a = this.f53387a;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, Constraints.a aVar) {
            f(i10, aVar);
            this.f53388b.f53467d = aVar.f53335p0;
            e eVar = this.f53391e;
            eVar.f53471b = aVar.f53338s0;
            eVar.f53472c = aVar.f53339t0;
            eVar.f53473d = aVar.f53340u0;
            eVar.f53474e = aVar.f53341v0;
            eVar.f53475f = aVar.f53342w0;
            eVar.f53476g = aVar.f53343x0;
            eVar.f53477h = aVar.f53344y0;
            eVar.f53478i = aVar.f53345z0;
            eVar.f53479j = aVar.f53333A0;
            eVar.f53480k = aVar.f53334B0;
            eVar.f53482m = aVar.f53337r0;
            eVar.f53481l = aVar.f53336q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(ConstraintHelper constraintHelper, int i10, Constraints.a aVar) {
            g(i10, aVar);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f53390d;
                bVar.f53427d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f53423b0 = barrier.getType();
                this.f53390d.f53429e0 = barrier.getReferencedIds();
                this.f53390d.f53425c0 = barrier.getMargin();
            }
        }
    }

    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f53393k0;

        /* renamed from: c, reason: collision with root package name */
        public int f53424c;

        /* renamed from: d, reason: collision with root package name */
        public int f53426d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f53429e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f53431f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f53433g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53420a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f53422b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f53428e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f53430f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f53432g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f53434h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f53436i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f53438j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f53440k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f53441l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f53442m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f53443n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f53444o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f53445p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f53446q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f53447r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f53448s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f53449t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f53450u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f53451v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f53452w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f53453x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f53454y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f53455z = 0.0f;

        /* renamed from: A, reason: collision with root package name */
        public int f53394A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f53395B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f53396C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f53397D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f53398E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f53399F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f53400G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f53401H = -1;

        /* renamed from: I, reason: collision with root package name */
        public int f53402I = -1;

        /* renamed from: J, reason: collision with root package name */
        public int f53403J = -1;

        /* renamed from: K, reason: collision with root package name */
        public int f53404K = -1;

        /* renamed from: L, reason: collision with root package name */
        public int f53405L = -1;

        /* renamed from: M, reason: collision with root package name */
        public int f53406M = -1;

        /* renamed from: N, reason: collision with root package name */
        public int f53407N = -1;

        /* renamed from: O, reason: collision with root package name */
        public int f53408O = -1;

        /* renamed from: P, reason: collision with root package name */
        public float f53409P = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public float f53410Q = -1.0f;

        /* renamed from: R, reason: collision with root package name */
        public int f53411R = 0;

        /* renamed from: S, reason: collision with root package name */
        public int f53412S = 0;

        /* renamed from: T, reason: collision with root package name */
        public int f53413T = 0;

        /* renamed from: U, reason: collision with root package name */
        public int f53414U = 0;

        /* renamed from: V, reason: collision with root package name */
        public int f53415V = -1;

        /* renamed from: W, reason: collision with root package name */
        public int f53416W = -1;

        /* renamed from: X, reason: collision with root package name */
        public int f53417X = -1;

        /* renamed from: Y, reason: collision with root package name */
        public int f53418Y = -1;

        /* renamed from: Z, reason: collision with root package name */
        public float f53419Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f53421a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f53423b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f53425c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f53427d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f53435h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f53437i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f53439j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f53393k0 = sparseIntArray;
            sparseIntArray.append(f.f53673d4, 24);
            f53393k0.append(f.f53680e4, 25);
            f53393k0.append(f.f53694g4, 28);
            f53393k0.append(f.f53701h4, 29);
            f53393k0.append(f.f53736m4, 35);
            f53393k0.append(f.f53729l4, 34);
            f53393k0.append(f.f53579O3, 4);
            f53393k0.append(f.f53573N3, 3);
            f53393k0.append(f.f53561L3, 1);
            f53393k0.append(f.f53771r4, 6);
            f53393k0.append(f.f53778s4, 7);
            f53393k0.append(f.f53621V3, 17);
            f53393k0.append(f.f53627W3, 18);
            f53393k0.append(f.f53633X3, 19);
            f53393k0.append(f.f53805w3, 26);
            f53393k0.append(f.f53708i4, 31);
            f53393k0.append(f.f53715j4, 32);
            f53393k0.append(f.f53615U3, 10);
            f53393k0.append(f.f53609T3, 9);
            f53393k0.append(f.f53799v4, 13);
            f53393k0.append(f.f53820y4, 16);
            f53393k0.append(f.f53806w4, 14);
            f53393k0.append(f.f53785t4, 11);
            f53393k0.append(f.f53813x4, 15);
            f53393k0.append(f.f53792u4, 12);
            f53393k0.append(f.f53757p4, 38);
            f53393k0.append(f.f53659b4, 37);
            f53393k0.append(f.f53652a4, 39);
            f53393k0.append(f.f53750o4, 40);
            f53393k0.append(f.f53645Z3, 20);
            f53393k0.append(f.f53743n4, 36);
            f53393k0.append(f.f53603S3, 5);
            f53393k0.append(f.f53666c4, 76);
            f53393k0.append(f.f53722k4, 76);
            f53393k0.append(f.f53687f4, 76);
            f53393k0.append(f.f53567M3, 76);
            f53393k0.append(f.f53555K3, 76);
            f53393k0.append(f.f53826z3, 23);
            f53393k0.append(f.f53494B3, 27);
            f53393k0.append(f.f53508D3, 30);
            f53393k0.append(f.f53515E3, 8);
            f53393k0.append(f.f53487A3, 33);
            f53393k0.append(f.f53501C3, 2);
            f53393k0.append(f.f53812x3, 22);
            f53393k0.append(f.f53819y3, 21);
            f53393k0.append(f.f53585P3, 61);
            f53393k0.append(f.f53597R3, 62);
            f53393k0.append(f.f53591Q3, 63);
            f53393k0.append(f.f53764q4, 69);
            f53393k0.append(f.f53639Y3, 70);
            f53393k0.append(f.f53543I3, 71);
            f53393k0.append(f.f53529G3, 72);
            f53393k0.append(f.f53536H3, 73);
            f53393k0.append(f.f53549J3, 74);
            f53393k0.append(f.f53522F3, 75);
        }

        public void a(b bVar) {
            this.f53420a = bVar.f53420a;
            this.f53424c = bVar.f53424c;
            this.f53422b = bVar.f53422b;
            this.f53426d = bVar.f53426d;
            this.f53428e = bVar.f53428e;
            this.f53430f = bVar.f53430f;
            this.f53432g = bVar.f53432g;
            this.f53434h = bVar.f53434h;
            this.f53436i = bVar.f53436i;
            this.f53438j = bVar.f53438j;
            this.f53440k = bVar.f53440k;
            this.f53441l = bVar.f53441l;
            this.f53442m = bVar.f53442m;
            this.f53443n = bVar.f53443n;
            this.f53444o = bVar.f53444o;
            this.f53445p = bVar.f53445p;
            this.f53446q = bVar.f53446q;
            this.f53447r = bVar.f53447r;
            this.f53448s = bVar.f53448s;
            this.f53449t = bVar.f53449t;
            this.f53450u = bVar.f53450u;
            this.f53451v = bVar.f53451v;
            this.f53452w = bVar.f53452w;
            this.f53453x = bVar.f53453x;
            this.f53454y = bVar.f53454y;
            this.f53455z = bVar.f53455z;
            this.f53394A = bVar.f53394A;
            this.f53395B = bVar.f53395B;
            this.f53396C = bVar.f53396C;
            this.f53397D = bVar.f53397D;
            this.f53398E = bVar.f53398E;
            this.f53399F = bVar.f53399F;
            this.f53400G = bVar.f53400G;
            this.f53401H = bVar.f53401H;
            this.f53402I = bVar.f53402I;
            this.f53403J = bVar.f53403J;
            this.f53404K = bVar.f53404K;
            this.f53405L = bVar.f53405L;
            this.f53406M = bVar.f53406M;
            this.f53407N = bVar.f53407N;
            this.f53408O = bVar.f53408O;
            this.f53409P = bVar.f53409P;
            this.f53410Q = bVar.f53410Q;
            this.f53411R = bVar.f53411R;
            this.f53412S = bVar.f53412S;
            this.f53413T = bVar.f53413T;
            this.f53414U = bVar.f53414U;
            this.f53415V = bVar.f53415V;
            this.f53416W = bVar.f53416W;
            this.f53417X = bVar.f53417X;
            this.f53418Y = bVar.f53418Y;
            this.f53419Z = bVar.f53419Z;
            this.f53421a0 = bVar.f53421a0;
            this.f53423b0 = bVar.f53423b0;
            this.f53425c0 = bVar.f53425c0;
            this.f53427d0 = bVar.f53427d0;
            this.f53433g0 = bVar.f53433g0;
            int[] iArr = bVar.f53429e0;
            if (iArr != null) {
                this.f53429e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f53429e0 = null;
            }
            this.f53431f0 = bVar.f53431f0;
            this.f53435h0 = bVar.f53435h0;
            this.f53437i0 = bVar.f53437i0;
            this.f53439j0 = bVar.f53439j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53798v3);
            this.f53422b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f53393k0.get(index);
                if (i11 == 80) {
                    this.f53435h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f53435h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f53445p = c.t(typedArrayObtainStyledAttributes, index, this.f53445p);
                            break;
                        case 2:
                            this.f53400G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53400G);
                            break;
                        case 3:
                            this.f53444o = c.t(typedArrayObtainStyledAttributes, index, this.f53444o);
                            break;
                        case 4:
                            this.f53443n = c.t(typedArrayObtainStyledAttributes, index, this.f53443n);
                            break;
                        case 5:
                            this.f53452w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f53394A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53394A);
                            break;
                        case 7:
                            this.f53395B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53395B);
                            break;
                        case 8:
                            this.f53401H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53401H);
                            break;
                        case 9:
                            this.f53449t = c.t(typedArrayObtainStyledAttributes, index, this.f53449t);
                            break;
                        case 10:
                            this.f53448s = c.t(typedArrayObtainStyledAttributes, index, this.f53448s);
                            break;
                        case 11:
                            this.f53406M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53406M);
                            break;
                        case 12:
                            this.f53407N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53407N);
                            break;
                        case 13:
                            this.f53403J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53403J);
                            break;
                        case 14:
                            this.f53405L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53405L);
                            break;
                        case 15:
                            this.f53408O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53408O);
                            break;
                        case 16:
                            this.f53404K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53404K);
                            break;
                        case 17:
                            this.f53428e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53428e);
                            break;
                        case 18:
                            this.f53430f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53430f);
                            break;
                        case 19:
                            this.f53432g = typedArrayObtainStyledAttributes.getFloat(index, this.f53432g);
                            break;
                        case 20:
                            this.f53450u = typedArrayObtainStyledAttributes.getFloat(index, this.f53450u);
                            break;
                        case 21:
                            this.f53426d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f53426d);
                            break;
                        case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                            this.f53424c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f53424c);
                            break;
                        case 23:
                            this.f53397D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53397D);
                            break;
                        case 24:
                            this.f53434h = c.t(typedArrayObtainStyledAttributes, index, this.f53434h);
                            break;
                        case 25:
                            this.f53436i = c.t(typedArrayObtainStyledAttributes, index, this.f53436i);
                            break;
                        case 26:
                            this.f53396C = typedArrayObtainStyledAttributes.getInt(index, this.f53396C);
                            break;
                        case 27:
                            this.f53398E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53398E);
                            break;
                        case 28:
                            this.f53438j = c.t(typedArrayObtainStyledAttributes, index, this.f53438j);
                            break;
                        case 29:
                            this.f53440k = c.t(typedArrayObtainStyledAttributes, index, this.f53440k);
                            break;
                        case 30:
                            this.f53402I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53402I);
                            break;
                        case 31:
                            this.f53446q = c.t(typedArrayObtainStyledAttributes, index, this.f53446q);
                            break;
                        case l3.f93325e /* 32 */:
                            this.f53447r = c.t(typedArrayObtainStyledAttributes, index, this.f53447r);
                            break;
                        case 33:
                            this.f53399F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53399F);
                            break;
                        case 34:
                            this.f53442m = c.t(typedArrayObtainStyledAttributes, index, this.f53442m);
                            break;
                        case 35:
                            this.f53441l = c.t(typedArrayObtainStyledAttributes, index, this.f53441l);
                            break;
                        case 36:
                            this.f53451v = typedArrayObtainStyledAttributes.getFloat(index, this.f53451v);
                            break;
                        case 37:
                            this.f53410Q = typedArrayObtainStyledAttributes.getFloat(index, this.f53410Q);
                            break;
                        case 38:
                            this.f53409P = typedArrayObtainStyledAttributes.getFloat(index, this.f53409P);
                            break;
                        case 39:
                            this.f53411R = typedArrayObtainStyledAttributes.getInt(index, this.f53411R);
                            break;
                        case 40:
                            this.f53412S = typedArrayObtainStyledAttributes.getInt(index, this.f53412S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f53413T = typedArrayObtainStyledAttributes.getInt(index, this.f53413T);
                                    break;
                                case 55:
                                    this.f53414U = typedArrayObtainStyledAttributes.getInt(index, this.f53414U);
                                    break;
                                case 56:
                                    this.f53415V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53415V);
                                    break;
                                case 57:
                                    this.f53416W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53416W);
                                    break;
                                case 58:
                                    this.f53417X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53417X);
                                    break;
                                case 59:
                                    this.f53418Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53418Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f53453x = c.t(typedArrayObtainStyledAttributes, index, this.f53453x);
                                            break;
                                        case 62:
                                            this.f53454y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53454y);
                                            break;
                                        case 63:
                                            this.f53455z = typedArrayObtainStyledAttributes.getFloat(index, this.f53455z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f53419Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f53421a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    FS.log_e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f53423b0 = typedArrayObtainStyledAttributes.getInt(index, this.f53423b0);
                                                    break;
                                                case 73:
                                                    this.f53425c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53425c0);
                                                    break;
                                                case 74:
                                                    this.f53431f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f53439j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f53439j0);
                                                    break;
                                                case 76:
                                                    FS.log_w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f53393k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f53433g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    FS.log_w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f53393k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f53437i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f53437i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C1104c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f53456h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53457a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f53458b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f53459c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f53460d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f53461e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f53462f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f53463g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f53456h = sparseIntArray;
            sparseIntArray.append(f.f53550J4, 1);
            f53456h.append(f.f53562L4, 2);
            f53456h.append(f.f53568M4, 3);
            f53456h.append(f.f53544I4, 4);
            f53456h.append(f.f53537H4, 5);
            f53456h.append(f.f53556K4, 6);
        }

        public void a(C1104c c1104c) {
            this.f53457a = c1104c.f53457a;
            this.f53458b = c1104c.f53458b;
            this.f53459c = c1104c.f53459c;
            this.f53460d = c1104c.f53460d;
            this.f53461e = c1104c.f53461e;
            this.f53463g = c1104c.f53463g;
            this.f53462f = c1104c.f53462f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53530G4);
            this.f53457a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f53456h.get(index)) {
                    case 1:
                        this.f53463g = typedArrayObtainStyledAttributes.getFloat(index, this.f53463g);
                        break;
                    case 2:
                        this.f53460d = typedArrayObtainStyledAttributes.getInt(index, this.f53460d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f53459c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f53459c = S1.a.f34313c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f53461e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f53458b = c.t(typedArrayObtainStyledAttributes, index, this.f53458b);
                        break;
                    case 6:
                        this.f53462f = typedArrayObtainStyledAttributes.getFloat(index, this.f53462f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f53464a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f53465b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f53466c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f53467d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f53468e = Float.NaN;

        public void a(d dVar) {
            this.f53464a = dVar.f53464a;
            this.f53465b = dVar.f53465b;
            this.f53467d = dVar.f53467d;
            this.f53468e = dVar.f53468e;
            this.f53466c = dVar.f53466c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53622V4);
            this.f53464a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f53634X4) {
                    this.f53467d = typedArrayObtainStyledAttributes.getFloat(index, this.f53467d);
                } else if (index == f.f53628W4) {
                    this.f53465b = typedArrayObtainStyledAttributes.getInt(index, this.f53465b);
                    this.f53465b = c.f53382d[this.f53465b];
                } else if (index == f.f53646Z4) {
                    this.f53466c = typedArrayObtainStyledAttributes.getInt(index, this.f53466c);
                } else if (index == f.f53640Y4) {
                    this.f53468e = typedArrayObtainStyledAttributes.getFloat(index, this.f53468e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f53469n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f53470a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f53471b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f53472c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f53473d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f53474e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f53475f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f53476g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f53477h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f53478i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f53479j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f53480k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f53481l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f53482m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f53469n = sparseIntArray;
            sparseIntArray.append(f.f53786t5, 1);
            f53469n.append(f.f53793u5, 2);
            f53469n.append(f.f53800v5, 3);
            f53469n.append(f.f53772r5, 4);
            f53469n.append(f.f53779s5, 5);
            f53469n.append(f.f53744n5, 6);
            f53469n.append(f.f53751o5, 7);
            f53469n.append(f.f53758p5, 8);
            f53469n.append(f.f53765q5, 9);
            f53469n.append(f.f53807w5, 10);
            f53469n.append(f.f53814x5, 11);
        }

        public void a(e eVar) {
            this.f53470a = eVar.f53470a;
            this.f53471b = eVar.f53471b;
            this.f53472c = eVar.f53472c;
            this.f53473d = eVar.f53473d;
            this.f53474e = eVar.f53474e;
            this.f53475f = eVar.f53475f;
            this.f53476g = eVar.f53476g;
            this.f53477h = eVar.f53477h;
            this.f53478i = eVar.f53478i;
            this.f53479j = eVar.f53479j;
            this.f53480k = eVar.f53480k;
            this.f53481l = eVar.f53481l;
            this.f53482m = eVar.f53482m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53737m5);
            this.f53470a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f53469n.get(index)) {
                    case 1:
                        this.f53471b = typedArrayObtainStyledAttributes.getFloat(index, this.f53471b);
                        break;
                    case 2:
                        this.f53472c = typedArrayObtainStyledAttributes.getFloat(index, this.f53472c);
                        break;
                    case 3:
                        this.f53473d = typedArrayObtainStyledAttributes.getFloat(index, this.f53473d);
                        break;
                    case 4:
                        this.f53474e = typedArrayObtainStyledAttributes.getFloat(index, this.f53474e);
                        break;
                    case 5:
                        this.f53475f = typedArrayObtainStyledAttributes.getFloat(index, this.f53475f);
                        break;
                    case 6:
                        this.f53476g = typedArrayObtainStyledAttributes.getDimension(index, this.f53476g);
                        break;
                    case 7:
                        this.f53477h = typedArrayObtainStyledAttributes.getDimension(index, this.f53477h);
                        break;
                    case 8:
                        this.f53478i = typedArrayObtainStyledAttributes.getDimension(index, this.f53478i);
                        break;
                    case 9:
                        this.f53479j = typedArrayObtainStyledAttributes.getDimension(index, this.f53479j);
                        break;
                    case 10:
                        this.f53480k = typedArrayObtainStyledAttributes.getDimension(index, this.f53480k);
                        break;
                    case 11:
                        this.f53481l = true;
                        this.f53482m = typedArrayObtainStyledAttributes.getDimension(index, this.f53482m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53383e = sparseIntArray;
        sparseIntArray.append(f.f53788u0, 25);
        f53383e.append(f.f53795v0, 26);
        f53383e.append(f.f53809x0, 29);
        f53383e.append(f.f53816y0, 30);
        f53383e.append(f.f53512E0, 36);
        f53383e.append(f.f53505D0, 35);
        f53383e.append(f.f53662c0, 4);
        f53383e.append(f.f53655b0, 3);
        f53383e.append(f.f53641Z, 1);
        f53383e.append(f.f53564M0, 6);
        f53383e.append(f.f53570N0, 7);
        f53383e.append(f.f53711j0, 17);
        f53383e.append(f.f53718k0, 18);
        f53383e.append(f.f53725l0, 19);
        f53383e.append(f.f53773s, 27);
        f53383e.append(f.f53823z0, 32);
        f53383e.append(f.f53484A0, 33);
        f53383e.append(f.f53704i0, 10);
        f53383e.append(f.f53697h0, 9);
        f53383e.append(f.f53588Q0, 13);
        f53383e.append(f.f53606T0, 16);
        f53383e.append(f.f53594R0, 14);
        f53383e.append(f.f53576O0, 11);
        f53383e.append(f.f53600S0, 15);
        f53383e.append(f.f53582P0, 12);
        f53383e.append(f.f53533H0, 40);
        f53383e.append(f.f53774s0, 39);
        f53383e.append(f.f53767r0, 41);
        f53383e.append(f.f53526G0, 42);
        f53383e.append(f.f53760q0, 20);
        f53383e.append(f.f53519F0, 37);
        f53383e.append(f.f53690g0, 5);
        f53383e.append(f.f53781t0, 82);
        f53383e.append(f.f53498C0, 82);
        f53383e.append(f.f53802w0, 82);
        f53383e.append(f.f53648a0, 82);
        f53383e.append(f.f53635Y, 82);
        f53383e.append(f.f53808x, 24);
        f53383e.append(f.f53822z, 28);
        f53383e.append(f.f53557L, 31);
        f53383e.append(f.f53563M, 8);
        f53383e.append(f.f53815y, 34);
        f53383e.append(f.f53483A, 2);
        f53383e.append(f.f53794v, 23);
        f53383e.append(f.f53801w, 21);
        f53383e.append(f.f53787u, 22);
        f53383e.append(f.f53490B, 43);
        f53383e.append(f.f53575O, 44);
        f53383e.append(f.f53545J, 45);
        f53383e.append(f.f53551K, 46);
        f53383e.append(f.f53539I, 60);
        f53383e.append(f.f53525G, 47);
        f53383e.append(f.f53532H, 48);
        f53383e.append(f.f53497C, 49);
        f53383e.append(f.f53504D, 50);
        f53383e.append(f.f53511E, 51);
        f53383e.append(f.f53518F, 52);
        f53383e.append(f.f53569N, 53);
        f53383e.append(f.f53540I0, 54);
        f53383e.append(f.f53732m0, 55);
        f53383e.append(f.f53546J0, 56);
        f53383e.append(f.f53739n0, 57);
        f53383e.append(f.f53552K0, 58);
        f53383e.append(f.f53746o0, 59);
        f53383e.append(f.f53669d0, 61);
        f53383e.append(f.f53683f0, 62);
        f53383e.append(f.f53676e0, 63);
        f53383e.append(f.f53581P, 64);
        f53383e.append(f.f53630X0, 65);
        f53383e.append(f.f53617V, 66);
        f53383e.append(f.f53636Y0, 67);
        f53383e.append(f.f53618V0, 79);
        f53383e.append(f.f53780t, 38);
        f53383e.append(f.f53612U0, 68);
        f53383e.append(f.f53558L0, 69);
        f53383e.append(f.f53753p0, 70);
        f53383e.append(f.f53605T, 71);
        f53383e.append(f.f53593R, 72);
        f53383e.append(f.f53599S, 73);
        f53383e.append(f.f53611U, 74);
        f53383e.append(f.f53587Q, 75);
        f53383e.append(f.f53624W0, 76);
        f53383e.append(f.f53491B0, 77);
        f53383e.append(f.f53642Z0, 78);
        f53383e.append(f.f53629X, 80);
        f53383e.append(f.f53623W, 81);
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53766r);
        u(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a q(int i10) {
        if (!this.f53386c.containsKey(Integer.valueOf(i10))) {
            this.f53386c.put(Integer.valueOf(i10), new a());
        }
        return this.f53386c.get(Integer.valueOf(i10));
    }

    public void e(int i10, int i11) {
        if (this.f53386c.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f53386c.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f53390d;
                    bVar.f53436i = -1;
                    bVar.f53434h = -1;
                    bVar.f53397D = -1;
                    bVar.f53403J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f53390d;
                    bVar2.f53440k = -1;
                    bVar2.f53438j = -1;
                    bVar2.f53398E = -1;
                    bVar2.f53405L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f53390d;
                    bVar3.f53442m = -1;
                    bVar3.f53441l = -1;
                    bVar3.f53399F = -1;
                    bVar3.f53404K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f53390d;
                    bVar4.f53443n = -1;
                    bVar4.f53444o = -1;
                    bVar4.f53400G = -1;
                    bVar4.f53406M = -1;
                    return;
                case 5:
                    aVar.f53390d.f53445p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f53390d;
                    bVar5.f53446q = -1;
                    bVar5.f53447r = -1;
                    bVar5.f53402I = -1;
                    bVar5.f53408O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f53390d;
                    bVar6.f53448s = -1;
                    bVar6.f53449t = -1;
                    bVar6.f53401H = -1;
                    bVar6.f53407N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void i(int i10, int i11, int i12, int i13, int i14) {
        if (!this.f53386c.containsKey(Integer.valueOf(i10))) {
            this.f53386c.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f53386c.get(Integer.valueOf(i10));
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar = aVar.f53390d;
                    bVar.f53434h = i12;
                    bVar.f53436i = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + w(i13) + " undefined");
                    }
                    b bVar2 = aVar.f53390d;
                    bVar2.f53436i = i12;
                    bVar2.f53434h = -1;
                }
                aVar.f53390d.f53397D = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar3 = aVar.f53390d;
                    bVar3.f53438j = i12;
                    bVar3.f53440k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar4 = aVar.f53390d;
                    bVar4.f53440k = i12;
                    bVar4.f53438j = -1;
                }
                aVar.f53390d.f53398E = i14;
                return;
            case 3:
                if (i13 == 3) {
                    b bVar5 = aVar.f53390d;
                    bVar5.f53441l = i12;
                    bVar5.f53442m = -1;
                    bVar5.f53445p = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar6 = aVar.f53390d;
                    bVar6.f53442m = i12;
                    bVar6.f53441l = -1;
                    bVar6.f53445p = -1;
                }
                aVar.f53390d.f53399F = i14;
                return;
            case 4:
                if (i13 == 4) {
                    b bVar7 = aVar.f53390d;
                    bVar7.f53444o = i12;
                    bVar7.f53443n = -1;
                    bVar7.f53445p = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar8 = aVar.f53390d;
                    bVar8.f53443n = i12;
                    bVar8.f53444o = -1;
                    bVar8.f53445p = -1;
                }
                aVar.f53390d.f53400G = i14;
                return;
            case 5:
                if (i13 != 5) {
                    throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                }
                b bVar9 = aVar.f53390d;
                bVar9.f53445p = i12;
                bVar9.f53444o = -1;
                bVar9.f53443n = -1;
                bVar9.f53441l = -1;
                bVar9.f53442m = -1;
                return;
            case 6:
                if (i13 == 6) {
                    b bVar10 = aVar.f53390d;
                    bVar10.f53447r = i12;
                    bVar10.f53446q = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar11 = aVar.f53390d;
                    bVar11.f53446q = i12;
                    bVar11.f53447r = -1;
                }
                aVar.f53390d.f53402I = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar12 = aVar.f53390d;
                    bVar12.f53449t = i12;
                    bVar12.f53448s = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + w(i13) + " undefined");
                    }
                    b bVar13 = aVar.f53390d;
                    bVar13.f53448s = i12;
                    bVar13.f53449t = -1;
                }
                aVar.f53390d.f53401H = i14;
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
            if (index != f.f53780t && f.f53557L != index && f.f53563M != index) {
                aVar.f53389c.f53457a = true;
                aVar.f53390d.f53422b = true;
                aVar.f53388b.f53464a = true;
                aVar.f53391e.f53470a = true;
            }
            switch (f53383e.get(index)) {
                case 1:
                    b bVar = aVar.f53390d;
                    bVar.f53445p = t(typedArray, index, bVar.f53445p);
                    break;
                case 2:
                    b bVar2 = aVar.f53390d;
                    bVar2.f53400G = typedArray.getDimensionPixelSize(index, bVar2.f53400G);
                    break;
                case 3:
                    b bVar3 = aVar.f53390d;
                    bVar3.f53444o = t(typedArray, index, bVar3.f53444o);
                    break;
                case 4:
                    b bVar4 = aVar.f53390d;
                    bVar4.f53443n = t(typedArray, index, bVar4.f53443n);
                    break;
                case 5:
                    aVar.f53390d.f53452w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f53390d;
                    bVar5.f53394A = typedArray.getDimensionPixelOffset(index, bVar5.f53394A);
                    break;
                case 7:
                    b bVar6 = aVar.f53390d;
                    bVar6.f53395B = typedArray.getDimensionPixelOffset(index, bVar6.f53395B);
                    break;
                case 8:
                    b bVar7 = aVar.f53390d;
                    bVar7.f53401H = typedArray.getDimensionPixelSize(index, bVar7.f53401H);
                    break;
                case 9:
                    b bVar8 = aVar.f53390d;
                    bVar8.f53449t = t(typedArray, index, bVar8.f53449t);
                    break;
                case 10:
                    b bVar9 = aVar.f53390d;
                    bVar9.f53448s = t(typedArray, index, bVar9.f53448s);
                    break;
                case 11:
                    b bVar10 = aVar.f53390d;
                    bVar10.f53406M = typedArray.getDimensionPixelSize(index, bVar10.f53406M);
                    break;
                case 12:
                    b bVar11 = aVar.f53390d;
                    bVar11.f53407N = typedArray.getDimensionPixelSize(index, bVar11.f53407N);
                    break;
                case 13:
                    b bVar12 = aVar.f53390d;
                    bVar12.f53403J = typedArray.getDimensionPixelSize(index, bVar12.f53403J);
                    break;
                case 14:
                    b bVar13 = aVar.f53390d;
                    bVar13.f53405L = typedArray.getDimensionPixelSize(index, bVar13.f53405L);
                    break;
                case 15:
                    b bVar14 = aVar.f53390d;
                    bVar14.f53408O = typedArray.getDimensionPixelSize(index, bVar14.f53408O);
                    break;
                case 16:
                    b bVar15 = aVar.f53390d;
                    bVar15.f53404K = typedArray.getDimensionPixelSize(index, bVar15.f53404K);
                    break;
                case 17:
                    b bVar16 = aVar.f53390d;
                    bVar16.f53428e = typedArray.getDimensionPixelOffset(index, bVar16.f53428e);
                    break;
                case 18:
                    b bVar17 = aVar.f53390d;
                    bVar17.f53430f = typedArray.getDimensionPixelOffset(index, bVar17.f53430f);
                    break;
                case 19:
                    b bVar18 = aVar.f53390d;
                    bVar18.f53432g = typedArray.getFloat(index, bVar18.f53432g);
                    break;
                case 20:
                    b bVar19 = aVar.f53390d;
                    bVar19.f53450u = typedArray.getFloat(index, bVar19.f53450u);
                    break;
                case 21:
                    b bVar20 = aVar.f53390d;
                    bVar20.f53426d = typedArray.getLayoutDimension(index, bVar20.f53426d);
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    d dVar = aVar.f53388b;
                    dVar.f53465b = typedArray.getInt(index, dVar.f53465b);
                    d dVar2 = aVar.f53388b;
                    dVar2.f53465b = f53382d[dVar2.f53465b];
                    break;
                case 23:
                    b bVar21 = aVar.f53390d;
                    bVar21.f53424c = typedArray.getLayoutDimension(index, bVar21.f53424c);
                    break;
                case 24:
                    b bVar22 = aVar.f53390d;
                    bVar22.f53397D = typedArray.getDimensionPixelSize(index, bVar22.f53397D);
                    break;
                case 25:
                    b bVar23 = aVar.f53390d;
                    bVar23.f53434h = t(typedArray, index, bVar23.f53434h);
                    break;
                case 26:
                    b bVar24 = aVar.f53390d;
                    bVar24.f53436i = t(typedArray, index, bVar24.f53436i);
                    break;
                case 27:
                    b bVar25 = aVar.f53390d;
                    bVar25.f53396C = typedArray.getInt(index, bVar25.f53396C);
                    break;
                case 28:
                    b bVar26 = aVar.f53390d;
                    bVar26.f53398E = typedArray.getDimensionPixelSize(index, bVar26.f53398E);
                    break;
                case 29:
                    b bVar27 = aVar.f53390d;
                    bVar27.f53438j = t(typedArray, index, bVar27.f53438j);
                    break;
                case 30:
                    b bVar28 = aVar.f53390d;
                    bVar28.f53440k = t(typedArray, index, bVar28.f53440k);
                    break;
                case 31:
                    b bVar29 = aVar.f53390d;
                    bVar29.f53402I = typedArray.getDimensionPixelSize(index, bVar29.f53402I);
                    break;
                case l3.f93325e /* 32 */:
                    b bVar30 = aVar.f53390d;
                    bVar30.f53446q = t(typedArray, index, bVar30.f53446q);
                    break;
                case 33:
                    b bVar31 = aVar.f53390d;
                    bVar31.f53447r = t(typedArray, index, bVar31.f53447r);
                    break;
                case 34:
                    b bVar32 = aVar.f53390d;
                    bVar32.f53399F = typedArray.getDimensionPixelSize(index, bVar32.f53399F);
                    break;
                case 35:
                    b bVar33 = aVar.f53390d;
                    bVar33.f53442m = t(typedArray, index, bVar33.f53442m);
                    break;
                case 36:
                    b bVar34 = aVar.f53390d;
                    bVar34.f53441l = t(typedArray, index, bVar34.f53441l);
                    break;
                case 37:
                    b bVar35 = aVar.f53390d;
                    bVar35.f53451v = typedArray.getFloat(index, bVar35.f53451v);
                    break;
                case 38:
                    aVar.f53387a = typedArray.getResourceId(index, aVar.f53387a);
                    break;
                case 39:
                    b bVar36 = aVar.f53390d;
                    bVar36.f53410Q = typedArray.getFloat(index, bVar36.f53410Q);
                    break;
                case 40:
                    b bVar37 = aVar.f53390d;
                    bVar37.f53409P = typedArray.getFloat(index, bVar37.f53409P);
                    break;
                case 41:
                    b bVar38 = aVar.f53390d;
                    bVar38.f53411R = typedArray.getInt(index, bVar38.f53411R);
                    break;
                case 42:
                    b bVar39 = aVar.f53390d;
                    bVar39.f53412S = typedArray.getInt(index, bVar39.f53412S);
                    break;
                case 43:
                    d dVar3 = aVar.f53388b;
                    dVar3.f53467d = typedArray.getFloat(index, dVar3.f53467d);
                    break;
                case 44:
                    e eVar = aVar.f53391e;
                    eVar.f53481l = true;
                    eVar.f53482m = typedArray.getDimension(index, eVar.f53482m);
                    break;
                case 45:
                    e eVar2 = aVar.f53391e;
                    eVar2.f53472c = typedArray.getFloat(index, eVar2.f53472c);
                    break;
                case 46:
                    e eVar3 = aVar.f53391e;
                    eVar3.f53473d = typedArray.getFloat(index, eVar3.f53473d);
                    break;
                case 47:
                    e eVar4 = aVar.f53391e;
                    eVar4.f53474e = typedArray.getFloat(index, eVar4.f53474e);
                    break;
                case 48:
                    e eVar5 = aVar.f53391e;
                    eVar5.f53475f = typedArray.getFloat(index, eVar5.f53475f);
                    break;
                case 49:
                    e eVar6 = aVar.f53391e;
                    eVar6.f53476g = typedArray.getDimension(index, eVar6.f53476g);
                    break;
                case 50:
                    e eVar7 = aVar.f53391e;
                    eVar7.f53477h = typedArray.getDimension(index, eVar7.f53477h);
                    break;
                case 51:
                    e eVar8 = aVar.f53391e;
                    eVar8.f53478i = typedArray.getDimension(index, eVar8.f53478i);
                    break;
                case 52:
                    e eVar9 = aVar.f53391e;
                    eVar9.f53479j = typedArray.getDimension(index, eVar9.f53479j);
                    break;
                case 53:
                    e eVar10 = aVar.f53391e;
                    eVar10.f53480k = typedArray.getDimension(index, eVar10.f53480k);
                    break;
                case 54:
                    b bVar40 = aVar.f53390d;
                    bVar40.f53413T = typedArray.getInt(index, bVar40.f53413T);
                    break;
                case 55:
                    b bVar41 = aVar.f53390d;
                    bVar41.f53414U = typedArray.getInt(index, bVar41.f53414U);
                    break;
                case 56:
                    b bVar42 = aVar.f53390d;
                    bVar42.f53415V = typedArray.getDimensionPixelSize(index, bVar42.f53415V);
                    break;
                case 57:
                    b bVar43 = aVar.f53390d;
                    bVar43.f53416W = typedArray.getDimensionPixelSize(index, bVar43.f53416W);
                    break;
                case 58:
                    b bVar44 = aVar.f53390d;
                    bVar44.f53417X = typedArray.getDimensionPixelSize(index, bVar44.f53417X);
                    break;
                case 59:
                    b bVar45 = aVar.f53390d;
                    bVar45.f53418Y = typedArray.getDimensionPixelSize(index, bVar45.f53418Y);
                    break;
                case 60:
                    e eVar11 = aVar.f53391e;
                    eVar11.f53471b = typedArray.getFloat(index, eVar11.f53471b);
                    break;
                case 61:
                    b bVar46 = aVar.f53390d;
                    bVar46.f53453x = t(typedArray, index, bVar46.f53453x);
                    break;
                case 62:
                    b bVar47 = aVar.f53390d;
                    bVar47.f53454y = typedArray.getDimensionPixelSize(index, bVar47.f53454y);
                    break;
                case 63:
                    b bVar48 = aVar.f53390d;
                    bVar48.f53455z = typedArray.getFloat(index, bVar48.f53455z);
                    break;
                case 64:
                    C1104c c1104c = aVar.f53389c;
                    c1104c.f53458b = t(typedArray, index, c1104c.f53458b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f53389c.f53459c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f53389c.f53459c = S1.a.f34313c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f53389c.f53461e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C1104c c1104c2 = aVar.f53389c;
                    c1104c2.f53463g = typedArray.getFloat(index, c1104c2.f53463g);
                    break;
                case 68:
                    d dVar4 = aVar.f53388b;
                    dVar4.f53468e = typedArray.getFloat(index, dVar4.f53468e);
                    break;
                case 69:
                    aVar.f53390d.f53419Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f53390d.f53421a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    FS.log_e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f53390d;
                    bVar49.f53423b0 = typedArray.getInt(index, bVar49.f53423b0);
                    break;
                case 73:
                    b bVar50 = aVar.f53390d;
                    bVar50.f53425c0 = typedArray.getDimensionPixelSize(index, bVar50.f53425c0);
                    break;
                case 74:
                    aVar.f53390d.f53431f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f53390d;
                    bVar51.f53439j0 = typedArray.getBoolean(index, bVar51.f53439j0);
                    break;
                case 76:
                    C1104c c1104c3 = aVar.f53389c;
                    c1104c3.f53460d = typedArray.getInt(index, c1104c3.f53460d);
                    break;
                case 77:
                    aVar.f53390d.f53433g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f53388b;
                    dVar5.f53466c = typedArray.getInt(index, dVar5.f53466c);
                    break;
                case 79:
                    C1104c c1104c4 = aVar.f53389c;
                    c1104c4.f53462f = typedArray.getFloat(index, c1104c4.f53462f);
                    break;
                case BinsView.LABEL_WIDTH_DP /* 80 */:
                    b bVar52 = aVar.f53390d;
                    bVar52.f53435h0 = typedArray.getBoolean(index, bVar52.f53435h0);
                    break;
                case 81:
                    b bVar53 = aVar.f53390d;
                    bVar53.f53437i0 = typedArray.getBoolean(index, bVar53.f53437i0);
                    break;
                case 82:
                    FS.log_w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f53383e.get(index));
                    break;
                default:
                    FS.log_w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f53383e.get(index));
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
        HashSet hashSet = new HashSet(this.f53386c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f53386c.containsKey(Integer.valueOf(id2))) {
                FS.log_w("ConstraintSet", "id unknown " + T1.a.a(childAt));
            } else {
                if (this.f53385b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f53386c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f53386c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            aVar.f53390d.f53427d0 = 1;
                        }
                        int i11 = aVar.f53390d.f53427d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f53390d.f53423b0);
                            barrier.setMargin(aVar.f53390d.f53425c0);
                            barrier.setAllowsGoneWidget(aVar.f53390d.f53439j0);
                            b bVar = aVar.f53390d;
                            int[] iArr = bVar.f53429e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f53431f0;
                                if (str != null) {
                                    bVar.f53429e0 = o(barrier, str);
                                    barrier.setReferencedIds(aVar.f53390d.f53429e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f53392f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f53388b;
                        if (dVar.f53466c == 0) {
                            childAt.setVisibility(dVar.f53465b);
                        }
                        childAt.setAlpha(aVar.f53388b.f53467d);
                        childAt.setRotation(aVar.f53391e.f53471b);
                        childAt.setRotationX(aVar.f53391e.f53472c);
                        childAt.setRotationY(aVar.f53391e.f53473d);
                        childAt.setScaleX(aVar.f53391e.f53474e);
                        childAt.setScaleY(aVar.f53391e.f53475f);
                        if (!Float.isNaN(aVar.f53391e.f53476g)) {
                            childAt.setPivotX(aVar.f53391e.f53476g);
                        }
                        if (!Float.isNaN(aVar.f53391e.f53477h)) {
                            childAt.setPivotY(aVar.f53391e.f53477h);
                        }
                        childAt.setTranslationX(aVar.f53391e.f53478i);
                        childAt.setTranslationY(aVar.f53391e.f53479j);
                        childAt.setTranslationZ(aVar.f53391e.f53480k);
                        e eVar = aVar.f53391e;
                        if (eVar.f53481l) {
                            childAt.setElevation(eVar.f53482m);
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
            a aVar2 = this.f53386c.get(num);
            int i12 = aVar2.f53390d.f53427d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f53390d;
                int[] iArr2 = bVar3.f53429e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f53431f0;
                    if (str2 != null) {
                        bVar3.f53429e0 = o(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f53390d.f53429e0);
                    }
                }
                barrier2.setType(aVar2.f53390d.f53423b0);
                barrier2.setMargin(aVar2.f53390d.f53425c0);
                ConstraintLayout.b bVarL = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                aVar2.d(bVarL);
                constraintLayout.addView(barrier2, bVarL);
            }
            if (aVar2.f53390d.f53420a) {
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
        this.f53386c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f53385b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f53386c.containsKey(Integer.valueOf(id2))) {
                this.f53386c.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f53386c.get(Integer.valueOf(id2));
            aVar.f53392f = androidx.constraintlayout.widget.a.a(this.f53384a, childAt);
            aVar.f(id2, bVar);
            aVar.f53388b.f53465b = childAt.getVisibility();
            aVar.f53388b.f53467d = childAt.getAlpha();
            aVar.f53391e.f53471b = childAt.getRotation();
            aVar.f53391e.f53472c = childAt.getRotationX();
            aVar.f53391e.f53473d = childAt.getRotationY();
            aVar.f53391e.f53474e = childAt.getScaleX();
            aVar.f53391e.f53475f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f53391e;
                eVar.f53476g = pivotX;
                eVar.f53477h = pivotY;
            }
            aVar.f53391e.f53478i = childAt.getTranslationX();
            aVar.f53391e.f53479j = childAt.getTranslationY();
            aVar.f53391e.f53480k = childAt.getTranslationZ();
            e eVar2 = aVar.f53391e;
            if (eVar2.f53481l) {
                eVar2.f53482m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f53390d.f53439j0 = barrier.n();
                aVar.f53390d.f53429e0 = barrier.getReferencedIds();
                aVar.f53390d.f53423b0 = barrier.getType();
                aVar.f53390d.f53425c0 = barrier.getMargin();
            }
        }
    }

    public void h(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f53386c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraints.getChildAt(i10);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f53385b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f53386c.containsKey(Integer.valueOf(id2))) {
                this.f53386c.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f53386c.get(Integer.valueOf(id2));
            if (childAt instanceof ConstraintHelper) {
                aVar2.h((ConstraintHelper) childAt, id2, aVar);
            }
            aVar2.g(id2, aVar);
        }
    }

    public void j(int i10, int i11, int i12, float f10) {
        b bVar = q(i10).f53390d;
        bVar.f53453x = i11;
        bVar.f53454y = i12;
        bVar.f53455z = f10;
    }

    public void k(int i10, int i11) {
        q(i10).f53390d.f53414U = i11;
    }

    public void l(int i10, int i11) {
        q(i10).f53390d.f53413T = i11;
    }

    public void m(int i10, int i11) {
        q(i10).f53390d.f53426d = i11;
    }

    public void n(int i10, int i11) {
        q(i10).f53390d.f53424c = i11;
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
                            aVarP.f53390d.f53420a = true;
                        }
                        this.f53386c.put(Integer.valueOf(aVarP.f53387a), aVarP);
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
        q(i10).f53390d.f53452w = str;
    }
}

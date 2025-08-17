package androidx.constraintlayout.widget;

import V1.e;
import V1.h;
import W1.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup implements FSDispatchDraw {

    /* renamed from: a, reason: collision with root package name */
    SparseArray<View> f53008a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<ConstraintHelper> f53009b;

    /* renamed from: c, reason: collision with root package name */
    protected V1.f f53010c;

    /* renamed from: d, reason: collision with root package name */
    private int f53011d;

    /* renamed from: e, reason: collision with root package name */
    private int f53012e;

    /* renamed from: f, reason: collision with root package name */
    private int f53013f;

    /* renamed from: g, reason: collision with root package name */
    private int f53014g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f53015h;

    /* renamed from: i, reason: collision with root package name */
    private int f53016i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.constraintlayout.widget.c f53017j;

    /* renamed from: k, reason: collision with root package name */
    protected androidx.constraintlayout.widget.b f53018k;

    /* renamed from: l, reason: collision with root package name */
    private int f53019l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap<String, Integer> f53020m;

    /* renamed from: n, reason: collision with root package name */
    private int f53021n;

    /* renamed from: o, reason: collision with root package name */
    private int f53022o;

    /* renamed from: p, reason: collision with root package name */
    int f53023p;

    /* renamed from: q, reason: collision with root package name */
    int f53024q;

    /* renamed from: r, reason: collision with root package name */
    int f53025r;

    /* renamed from: s, reason: collision with root package name */
    int f53026s;

    /* renamed from: t, reason: collision with root package name */
    private SparseArray<V1.e> f53027t;

    /* renamed from: u, reason: collision with root package name */
    c f53028u;

    /* renamed from: v, reason: collision with root package name */
    private int f53029v;

    /* renamed from: w, reason: collision with root package name */
    private int f53030w;

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public float f53032A;

        /* renamed from: B, reason: collision with root package name */
        public String f53033B;

        /* renamed from: C, reason: collision with root package name */
        float f53034C;

        /* renamed from: D, reason: collision with root package name */
        int f53035D;

        /* renamed from: E, reason: collision with root package name */
        public float f53036E;

        /* renamed from: F, reason: collision with root package name */
        public float f53037F;

        /* renamed from: G, reason: collision with root package name */
        public int f53038G;

        /* renamed from: H, reason: collision with root package name */
        public int f53039H;

        /* renamed from: I, reason: collision with root package name */
        public int f53040I;

        /* renamed from: J, reason: collision with root package name */
        public int f53041J;

        /* renamed from: K, reason: collision with root package name */
        public int f53042K;

        /* renamed from: L, reason: collision with root package name */
        public int f53043L;

        /* renamed from: M, reason: collision with root package name */
        public int f53044M;

        /* renamed from: N, reason: collision with root package name */
        public int f53045N;

        /* renamed from: O, reason: collision with root package name */
        public float f53046O;

        /* renamed from: P, reason: collision with root package name */
        public float f53047P;

        /* renamed from: Q, reason: collision with root package name */
        public int f53048Q;

        /* renamed from: R, reason: collision with root package name */
        public int f53049R;

        /* renamed from: S, reason: collision with root package name */
        public int f53050S;

        /* renamed from: T, reason: collision with root package name */
        public boolean f53051T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f53052U;

        /* renamed from: V, reason: collision with root package name */
        public String f53053V;

        /* renamed from: W, reason: collision with root package name */
        boolean f53054W;

        /* renamed from: X, reason: collision with root package name */
        boolean f53055X;

        /* renamed from: Y, reason: collision with root package name */
        boolean f53056Y;

        /* renamed from: Z, reason: collision with root package name */
        boolean f53057Z;

        /* renamed from: a, reason: collision with root package name */
        public int f53058a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f53059a0;

        /* renamed from: b, reason: collision with root package name */
        public int f53060b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f53061b0;

        /* renamed from: c, reason: collision with root package name */
        public float f53062c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f53063c0;

        /* renamed from: d, reason: collision with root package name */
        public int f53064d;

        /* renamed from: d0, reason: collision with root package name */
        int f53065d0;

        /* renamed from: e, reason: collision with root package name */
        public int f53066e;

        /* renamed from: e0, reason: collision with root package name */
        int f53067e0;

        /* renamed from: f, reason: collision with root package name */
        public int f53068f;

        /* renamed from: f0, reason: collision with root package name */
        int f53069f0;

        /* renamed from: g, reason: collision with root package name */
        public int f53070g;

        /* renamed from: g0, reason: collision with root package name */
        int f53071g0;

        /* renamed from: h, reason: collision with root package name */
        public int f53072h;

        /* renamed from: h0, reason: collision with root package name */
        int f53073h0;

        /* renamed from: i, reason: collision with root package name */
        public int f53074i;

        /* renamed from: i0, reason: collision with root package name */
        int f53075i0;

        /* renamed from: j, reason: collision with root package name */
        public int f53076j;

        /* renamed from: j0, reason: collision with root package name */
        float f53077j0;

        /* renamed from: k, reason: collision with root package name */
        public int f53078k;

        /* renamed from: k0, reason: collision with root package name */
        int f53079k0;

        /* renamed from: l, reason: collision with root package name */
        public int f53080l;

        /* renamed from: l0, reason: collision with root package name */
        int f53081l0;

        /* renamed from: m, reason: collision with root package name */
        public int f53082m;

        /* renamed from: m0, reason: collision with root package name */
        float f53083m0;

        /* renamed from: n, reason: collision with root package name */
        public int f53084n;

        /* renamed from: n0, reason: collision with root package name */
        V1.e f53085n0;

        /* renamed from: o, reason: collision with root package name */
        public float f53086o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f53087o0;

        /* renamed from: p, reason: collision with root package name */
        public int f53088p;

        /* renamed from: q, reason: collision with root package name */
        public int f53089q;

        /* renamed from: r, reason: collision with root package name */
        public int f53090r;

        /* renamed from: s, reason: collision with root package name */
        public int f53091s;

        /* renamed from: t, reason: collision with root package name */
        public int f53092t;

        /* renamed from: u, reason: collision with root package name */
        public int f53093u;

        /* renamed from: v, reason: collision with root package name */
        public int f53094v;

        /* renamed from: w, reason: collision with root package name */
        public int f53095w;

        /* renamed from: x, reason: collision with root package name */
        public int f53096x;

        /* renamed from: y, reason: collision with root package name */
        public int f53097y;

        /* renamed from: z, reason: collision with root package name */
        public float f53098z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f53099a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f53099a = sparseIntArray;
                sparseIntArray.append(f.f53503l2, 8);
                sparseIntArray.append(f.f53510m2, 9);
                sparseIntArray.append(f.f53524o2, 10);
                sparseIntArray.append(f.f53531p2, 11);
                sparseIntArray.append(f.f53573v2, 12);
                sparseIntArray.append(f.f53566u2, 13);
                sparseIntArray.append(f.f53383T1, 14);
                sparseIntArray.append(f.f53377S1, 15);
                sparseIntArray.append(f.f53365Q1, 16);
                sparseIntArray.append(f.f53389U1, 2);
                sparseIntArray.append(f.f53401W1, 3);
                sparseIntArray.append(f.f53395V1, 4);
                sparseIntArray.append(f.f53283D2, 49);
                sparseIntArray.append(f.f53290E2, 50);
                sparseIntArray.append(f.f53426a2, 5);
                sparseIntArray.append(f.f53433b2, 6);
                sparseIntArray.append(f.f53440c2, 7);
                sparseIntArray.append(f.f53432b1, 1);
                sparseIntArray.append(f.f53538q2, 17);
                sparseIntArray.append(f.f53545r2, 18);
                sparseIntArray.append(f.f53419Z1, 19);
                sparseIntArray.append(f.f53413Y1, 20);
                sparseIntArray.append(f.f53311H2, 21);
                sparseIntArray.append(f.f53330K2, 22);
                sparseIntArray.append(f.f53318I2, 23);
                sparseIntArray.append(f.f53297F2, 24);
                sparseIntArray.append(f.f53324J2, 25);
                sparseIntArray.append(f.f53304G2, 26);
                sparseIntArray.append(f.f53475h2, 29);
                sparseIntArray.append(f.f53580w2, 30);
                sparseIntArray.append(f.f53407X1, 44);
                sparseIntArray.append(f.f53489j2, 45);
                sparseIntArray.append(f.f53594y2, 46);
                sparseIntArray.append(f.f53482i2, 47);
                sparseIntArray.append(f.f53587x2, 48);
                sparseIntArray.append(f.f53353O1, 27);
                sparseIntArray.append(f.f53347N1, 28);
                sparseIntArray.append(f.f53601z2, 31);
                sparseIntArray.append(f.f53447d2, 32);
                sparseIntArray.append(f.f53269B2, 33);
                sparseIntArray.append(f.f53262A2, 34);
                sparseIntArray.append(f.f53276C2, 35);
                sparseIntArray.append(f.f53461f2, 36);
                sparseIntArray.append(f.f53454e2, 37);
                sparseIntArray.append(f.f53468g2, 38);
                sparseIntArray.append(f.f53496k2, 39);
                sparseIntArray.append(f.f53559t2, 40);
                sparseIntArray.append(f.f53517n2, 41);
                sparseIntArray.append(f.f53371R1, 42);
                sparseIntArray.append(f.f53359P1, 43);
                sparseIntArray.append(f.f53552s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            int i10;
            super(context, attributeSet);
            this.f53058a = -1;
            this.f53060b = -1;
            this.f53062c = -1.0f;
            this.f53064d = -1;
            this.f53066e = -1;
            this.f53068f = -1;
            this.f53070g = -1;
            this.f53072h = -1;
            this.f53074i = -1;
            this.f53076j = -1;
            this.f53078k = -1;
            this.f53080l = -1;
            this.f53082m = -1;
            this.f53084n = 0;
            this.f53086o = 0.0f;
            this.f53088p = -1;
            this.f53089q = -1;
            this.f53090r = -1;
            this.f53091s = -1;
            this.f53092t = -1;
            this.f53093u = -1;
            this.f53094v = -1;
            this.f53095w = -1;
            this.f53096x = -1;
            this.f53097y = -1;
            this.f53098z = 0.5f;
            this.f53032A = 0.5f;
            this.f53033B = null;
            this.f53034C = 0.0f;
            this.f53035D = 1;
            this.f53036E = -1.0f;
            this.f53037F = -1.0f;
            this.f53038G = 0;
            this.f53039H = 0;
            this.f53040I = 0;
            this.f53041J = 0;
            this.f53042K = 0;
            this.f53043L = 0;
            this.f53044M = 0;
            this.f53045N = 0;
            this.f53046O = 1.0f;
            this.f53047P = 1.0f;
            this.f53048Q = -1;
            this.f53049R = -1;
            this.f53050S = -1;
            this.f53051T = false;
            this.f53052U = false;
            this.f53053V = null;
            this.f53054W = true;
            this.f53055X = true;
            this.f53056Y = false;
            this.f53057Z = false;
            this.f53059a0 = false;
            this.f53061b0 = false;
            this.f53063c0 = false;
            this.f53065d0 = -1;
            this.f53067e0 = -1;
            this.f53069f0 = -1;
            this.f53071g0 = -1;
            this.f53073h0 = -1;
            this.f53075i0 = -1;
            this.f53077j0 = 0.5f;
            this.f53085n0 = new V1.e();
            this.f53087o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f53425a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f53099a.get(index);
                switch (i12) {
                    case 1:
                        this.f53050S = typedArrayObtainStyledAttributes.getInt(index, this.f53050S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f53082m);
                        this.f53082m = resourceId;
                        if (resourceId == -1) {
                            this.f53082m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f53084n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53084n);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f53086o) % 360.0f;
                        this.f53086o = f10;
                        if (f10 < 0.0f) {
                            this.f53086o = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f53058a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53058a);
                        break;
                    case 6:
                        this.f53060b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53060b);
                        break;
                    case 7:
                        this.f53062c = typedArrayObtainStyledAttributes.getFloat(index, this.f53062c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53064d);
                        this.f53064d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f53064d = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53066e);
                        this.f53066e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f53066e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53068f);
                        this.f53068f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f53068f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53070g);
                        this.f53070g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f53070g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53072h);
                        this.f53072h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f53072h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53074i);
                        this.f53074i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f53074i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53076j);
                        this.f53076j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f53076j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53078k);
                        this.f53078k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f53078k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53080l);
                        this.f53080l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f53080l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53088p);
                        this.f53088p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f53088p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53089q);
                        this.f53089q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f53089q = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53090r);
                        this.f53090r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f53090r = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f53091s);
                        this.f53091s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f53091s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f53092t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53092t);
                        break;
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        this.f53093u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53093u);
                        break;
                    case 23:
                        this.f53094v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53094v);
                        break;
                    case 24:
                        this.f53095w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53095w);
                        break;
                    case 25:
                        this.f53096x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53096x);
                        break;
                    case 26:
                        this.f53097y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53097y);
                        break;
                    case 27:
                        this.f53051T = typedArrayObtainStyledAttributes.getBoolean(index, this.f53051T);
                        break;
                    case 28:
                        this.f53052U = typedArrayObtainStyledAttributes.getBoolean(index, this.f53052U);
                        break;
                    case 29:
                        this.f53098z = typedArrayObtainStyledAttributes.getFloat(index, this.f53098z);
                        break;
                    case 30:
                        this.f53032A = typedArrayObtainStyledAttributes.getFloat(index, this.f53032A);
                        break;
                    case 31:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f53040I = i13;
                        if (i13 == 1) {
                            FS.log_e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case l3.f92486e /* 32 */:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f53041J = i14;
                        if (i14 == 1) {
                            FS.log_e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f53042K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53042K);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f53042K) == -2) {
                                this.f53042K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f53044M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53044M);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f53044M) == -2) {
                                this.f53044M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f53046O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f53046O));
                        this.f53040I = 2;
                        break;
                    case 36:
                        try {
                            this.f53043L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53043L);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f53043L) == -2) {
                                this.f53043L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f53045N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f53045N);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f53045N) == -2) {
                                this.f53045N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f53047P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f53047P));
                        this.f53041J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f53033B = string;
                                this.f53034C = Float.NaN;
                                this.f53035D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f53033B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String strSubstring = this.f53033B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f53035D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f53035D = 1;
                                        }
                                        i10 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f53033B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f53033B.substring(i10);
                                        if (strSubstring2.length() > 0) {
                                            this.f53034C = Float.parseFloat(strSubstring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.f53033B.substring(i10, iIndexOf2);
                                        String strSubstring4 = this.f53033B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f11 = Float.parseFloat(strSubstring3);
                                                float f12 = Float.parseFloat(strSubstring4);
                                                if (f11 <= 0.0f || f12 <= 0.0f) {
                                                    break;
                                                } else if (this.f53035D == 1) {
                                                    this.f53034C = Math.abs(f12 / f11);
                                                    break;
                                                } else {
                                                    this.f53034C = Math.abs(f11 / f12);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f53036E = typedArrayObtainStyledAttributes.getFloat(index, this.f53036E);
                                break;
                            case 46:
                                this.f53037F = typedArrayObtainStyledAttributes.getFloat(index, this.f53037F);
                                break;
                            case 47:
                                this.f53038G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f53039H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f53048Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53048Q);
                                break;
                            case 50:
                                this.f53049R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53049R);
                                break;
                            case 51:
                                this.f53053V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f53057Z = false;
            this.f53054W = true;
            this.f53055X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f53051T) {
                this.f53054W = false;
                if (this.f53040I == 0) {
                    this.f53040I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f53052U) {
                this.f53055X = false;
                if (this.f53041J == 0) {
                    this.f53041J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f53054W = false;
                if (i10 == 0 && this.f53040I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f53051T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f53055X = false;
                if (i11 == 0 && this.f53041J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f53052U = true;
                }
            }
            if (this.f53062c == -1.0f && this.f53058a == -1 && this.f53060b == -1) {
                return;
            }
            this.f53057Z = true;
            this.f53054W = true;
            this.f53055X = true;
            if (!(this.f53085n0 instanceof h)) {
                this.f53085n0 = new h();
            }
            ((h) this.f53085n0).R0(this.f53050S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f53058a = -1;
            this.f53060b = -1;
            this.f53062c = -1.0f;
            this.f53064d = -1;
            this.f53066e = -1;
            this.f53068f = -1;
            this.f53070g = -1;
            this.f53072h = -1;
            this.f53074i = -1;
            this.f53076j = -1;
            this.f53078k = -1;
            this.f53080l = -1;
            this.f53082m = -1;
            this.f53084n = 0;
            this.f53086o = 0.0f;
            this.f53088p = -1;
            this.f53089q = -1;
            this.f53090r = -1;
            this.f53091s = -1;
            this.f53092t = -1;
            this.f53093u = -1;
            this.f53094v = -1;
            this.f53095w = -1;
            this.f53096x = -1;
            this.f53097y = -1;
            this.f53098z = 0.5f;
            this.f53032A = 0.5f;
            this.f53033B = null;
            this.f53034C = 0.0f;
            this.f53035D = 1;
            this.f53036E = -1.0f;
            this.f53037F = -1.0f;
            this.f53038G = 0;
            this.f53039H = 0;
            this.f53040I = 0;
            this.f53041J = 0;
            this.f53042K = 0;
            this.f53043L = 0;
            this.f53044M = 0;
            this.f53045N = 0;
            this.f53046O = 1.0f;
            this.f53047P = 1.0f;
            this.f53048Q = -1;
            this.f53049R = -1;
            this.f53050S = -1;
            this.f53051T = false;
            this.f53052U = false;
            this.f53053V = null;
            this.f53054W = true;
            this.f53055X = true;
            this.f53056Y = false;
            this.f53057Z = false;
            this.f53059a0 = false;
            this.f53061b0 = false;
            this.f53063c0 = false;
            this.f53065d0 = -1;
            this.f53067e0 = -1;
            this.f53069f0 = -1;
            this.f53071g0 = -1;
            this.f53073h0 = -1;
            this.f53075i0 = -1;
            this.f53077j0 = 0.5f;
            this.f53085n0 = new V1.e();
            this.f53087o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f53058a = -1;
            this.f53060b = -1;
            this.f53062c = -1.0f;
            this.f53064d = -1;
            this.f53066e = -1;
            this.f53068f = -1;
            this.f53070g = -1;
            this.f53072h = -1;
            this.f53074i = -1;
            this.f53076j = -1;
            this.f53078k = -1;
            this.f53080l = -1;
            this.f53082m = -1;
            this.f53084n = 0;
            this.f53086o = 0.0f;
            this.f53088p = -1;
            this.f53089q = -1;
            this.f53090r = -1;
            this.f53091s = -1;
            this.f53092t = -1;
            this.f53093u = -1;
            this.f53094v = -1;
            this.f53095w = -1;
            this.f53096x = -1;
            this.f53097y = -1;
            this.f53098z = 0.5f;
            this.f53032A = 0.5f;
            this.f53033B = null;
            this.f53034C = 0.0f;
            this.f53035D = 1;
            this.f53036E = -1.0f;
            this.f53037F = -1.0f;
            this.f53038G = 0;
            this.f53039H = 0;
            this.f53040I = 0;
            this.f53041J = 0;
            this.f53042K = 0;
            this.f53043L = 0;
            this.f53044M = 0;
            this.f53045N = 0;
            this.f53046O = 1.0f;
            this.f53047P = 1.0f;
            this.f53048Q = -1;
            this.f53049R = -1;
            this.f53050S = -1;
            this.f53051T = false;
            this.f53052U = false;
            this.f53053V = null;
            this.f53054W = true;
            this.f53055X = true;
            this.f53056Y = false;
            this.f53057Z = false;
            this.f53059a0 = false;
            this.f53061b0 = false;
            this.f53063c0 = false;
            this.f53065d0 = -1;
            this.f53067e0 = -1;
            this.f53069f0 = -1;
            this.f53071g0 = -1;
            this.f53073h0 = -1;
            this.f53075i0 = -1;
            this.f53077j0 = 0.5f;
            this.f53085n0 = new V1.e();
            this.f53087o0 = false;
        }
    }

    class c implements b.InterfaceC0823b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f53100a;

        /* renamed from: b, reason: collision with root package name */
        int f53101b;

        /* renamed from: c, reason: collision with root package name */
        int f53102c;

        /* renamed from: d, reason: collision with root package name */
        int f53103d;

        /* renamed from: e, reason: collision with root package name */
        int f53104e;

        /* renamed from: f, reason: collision with root package name */
        int f53105f;

        /* renamed from: g, reason: collision with root package name */
        int f53106g;

        public c(ConstraintLayout constraintLayout) {
            this.f53100a = constraintLayout;
        }

        @Override // W1.b.InterfaceC0823b
        public final void a() {
            int childCount = this.f53100a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f53100a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).a(this.f53100a);
                }
            }
            int size = this.f53100a.f53009b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((ConstraintHelper) this.f53100a.f53009b.get(i11)).j(this.f53100a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0188 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01d5  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01e9  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01f6  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0244  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x016c  */
        @Override // W1.b.InterfaceC0823b
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(V1.e r21, W1.b.a r22) {
            /*
                Method dump skipped, instructions count: 622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(V1.e, W1.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f53101b = i12;
            this.f53102c = i13;
            this.f53103d = i14;
            this.f53104e = i15;
            this.f53105f = i10;
            this.f53106g = i11;
        }
    }

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException {
        super(context);
        this.f53008a = new SparseArray<>();
        this.f53009b = new ArrayList<>(4);
        this.f53010c = new V1.f();
        this.f53011d = 0;
        this.f53012e = 0;
        this.f53013f = a.e.API_PRIORITY_OTHER;
        this.f53014g = a.e.API_PRIORITY_OTHER;
        this.f53015h = true;
        this.f53016i = 263;
        this.f53017j = null;
        this.f53018k = null;
        this.f53019l = -1;
        this.f53020m = new HashMap<>();
        this.f53021n = -1;
        this.f53022o = -1;
        this.f53023p = -1;
        this.f53024q = -1;
        this.f53025r = 0;
        this.f53026s = 0;
        this.f53027t = new SparseArray<>();
        this.f53028u = new c(this);
        this.f53029v = 0;
        this.f53030w = 0;
        r(null, 0, 0);
    }

    private void t() {
        this.f53015h = true;
        this.f53021n = -1;
        this.f53022o = -1;
        this.f53023p = -1;
        this.f53024q = -1;
        this.f53025r = 0;
        this.f53026s = 0;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_ab19b2055450747a0a5e34d8e991603c(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_ab19b2055450747a0a5e34d8e991603c(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_ab19b2055450747a0a5e34d8e991603c(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53031a;

        static {
            int[] iArr = new int[e.b.values().length];
            f53031a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53031a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53031a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53031a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private final V1.e o(int i10) {
        if (i10 == 0) {
            return this.f53010c;
        }
        View viewFindViewById = this.f53008a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f53010c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f53085n0;
    }

    private void r(AttributeSet attributeSet, int i10, int i11) throws XmlPullParserException, IOException {
        this.f53010c.c0(this);
        this.f53010c.f1(this.f53028u);
        this.f53008a.put(getId(), this);
        this.f53017j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f53425a1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == f.f53495k1) {
                    this.f53011d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53011d);
                } else if (index == f.f53502l1) {
                    this.f53012e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53012e);
                } else if (index == f.f53481i1) {
                    this.f53013f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53013f);
                } else if (index == f.f53488j1) {
                    this.f53014g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f53014g);
                } else if (index == f.f53336L2) {
                    this.f53016i = typedArrayObtainStyledAttributes.getInt(index, this.f53016i);
                } else if (index == f.f53341M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            u(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f53018k = null;
                        }
                    }
                } else if (index == f.f53551s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f53017j = cVar;
                        cVar.r(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f53017j = null;
                    }
                    this.f53019l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f53010c.g1(this.f53016i);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f53009b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f53009b.get(i10).k(this);
            }
        }
        fsSuperDispatchDraw_ab19b2055450747a0a5e34d8e991603c(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f53014g;
    }

    public int getMaxWidth() {
        return this.f53013f;
    }

    public int getMinHeight() {
        return this.f53012e;
    }

    public int getMinWidth() {
        return this.f53011d;
    }

    public int getOptimizationLevel() {
        return this.f53010c.V0();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void k(boolean r17, android.view.View r18, V1.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray<V1.e> r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(boolean, android.view.View, V1.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object n(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f53020m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f53020m.get(str);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f53029v = i10;
        this.f53030w = i11;
        this.f53010c.h1(s());
        if (this.f53015h) {
            this.f53015h = false;
            if (A()) {
                this.f53010c.j1();
            }
        }
        w(this.f53010c, this.f53016i, i10, i11);
        v(i10, i11, this.f53010c.P(), this.f53010c.v(), this.f53010c.b1(), this.f53010c.Z0());
    }

    public View p(int i10) {
        return this.f53008a.get(i10);
    }

    public final V1.e q(View view) {
        if (view == this) {
            return this.f53010c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f53085n0;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f53017j = cVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f53008a.remove(getId());
        super.setId(i10);
        this.f53008a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f53014g) {
            return;
        }
        this.f53014g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f53013f) {
            return;
        }
        this.f53013f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f53012e) {
            return;
        }
        this.f53012e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f53011d) {
            return;
        }
        this.f53011d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(d dVar) {
        androidx.constraintlayout.widget.b bVar = this.f53018k;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f53016i = i10;
        this.f53010c.g1(i10);
    }

    protected void u(int i10) {
        this.f53018k = new androidx.constraintlayout.widget.b(getContext(), this, i10);
    }

    protected void v(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f53028u;
        int i14 = cVar.f53104e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f53103d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f53013f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f53014g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f53021n = iMin;
        this.f53022o = iMin2;
    }

    public void y(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f53020m == null) {
                this.f53020m = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf(q2.f92724c);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f53020m.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 V1.e$b) = (r2v3 V1.e$b), (r2v0 V1.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void z(V1.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f53028u
            int r1 = r0.f53104e
            int r0 = r0.f53103d
            V1.e$b r2 = V1.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r5
            goto L38
        L1a:
            int r9 = r7.f53013f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            V1.e$b r9 = V1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f53011d
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            V1.e$b r9 = V1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f53011d
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r5
            goto L5d
        L40:
            int r11 = r7.f53014g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            V1.e$b r2 = V1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f53012e
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            V1.e$b r2 = V1.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f53012e
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.P()
            if (r10 != r11) goto L69
            int r11 = r8.v()
            if (r12 == r11) goto L6c
        L69:
            r8.Y0()
        L6c:
            r8.F0(r5)
            r8.G0(r5)
            int r11 = r7.f53013f
            int r11 = r11 - r0
            r8.s0(r11)
            int r11 = r7.f53014g
            int r11 = r11 - r1
            r8.r0(r11)
            r8.u0(r5)
            r8.t0(r5)
            r8.l0(r9)
            r8.E0(r10)
            r8.A0(r2)
            r8.h0(r12)
            int r9 = r7.f53011d
            int r9 = r9 - r0
            r8.u0(r9)
            int r9 = r7.f53012e
            int r9 = r9 - r1
            r8.t0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.z(V1.f, int, int, int, int):void");
    }

    private boolean A() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            x();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (iMax2 > 0) {
            return iMax2;
        }
        return iMax;
    }

    private void x() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            V1.e eVarQ = q(getChildAt(i10));
            if (eVarQ != null) {
                eVarQ.Y();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    y(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    o(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f53019l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f53019l && (childAt2 instanceof Constraints)) {
                    this.f53017j = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f53017j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f53010c.M0();
        int size = this.f53009b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f53009b.get(i13).l(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).b(this);
            }
        }
        this.f53027t.clear();
        this.f53027t.put(0, this.f53010c);
        this.f53027t.put(getId(), this.f53010c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f53027t.put(childAt4.getId(), q(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            V1.e eVarQ2 = q(childAt5);
            if (eVarQ2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f53010c.b(eVarQ2);
                k(zIsInEditMode, childAt5, eVarQ2, bVar, this.f53027t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.View
    public void forceLayout() {
        t();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            V1.e eVar = bVar.f53085n0;
            if ((childAt.getVisibility() != 8 || bVar.f53057Z || bVar.f53059a0 || bVar.f53063c0 || zIsInEditMode) && !bVar.f53061b0) {
                int iQ = eVar.Q();
                int iR = eVar.R();
                int iP = eVar.P() + iQ;
                int iV = eVar.v() + iR;
                childAt.layout(iQ, iR, iP, iV);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iQ, iR, iP, iV);
                }
            }
        }
        int size = this.f53009b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f53009b.get(i15).i(this);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        V1.e eVarQ = q(view);
        if ((view instanceof Guideline) && !(eVarQ instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f53085n0 = hVar;
            bVar.f53057Z = true;
            hVar.R0(bVar.f53050S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m();
            ((b) view.getLayoutParams()).f53059a0 = true;
            if (!this.f53009b.contains(constraintHelper)) {
                this.f53009b.add(constraintHelper);
            }
        }
        this.f53008a.put(view.getId(), view);
        this.f53015h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f53008a.remove(view.getId());
        this.f53010c.L0(q(view));
        this.f53009b.remove(view);
        this.f53015h = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        t();
        super.requestLayout();
    }

    protected boolean s() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    protected void w(V1.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f53028u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 <= 0 && iMax4 <= 0) {
            iMax3 = Math.max(0, getPaddingLeft());
        } else {
            if (s()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            z(fVar, mode, i15, mode2, i16);
            fVar.c1(i10, mode, i15, mode2, i16, this.f53021n, this.f53022o, i13, iMax);
        }
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        z(fVar, mode, i152, mode2, i162);
        fVar.c1(i10, mode, i152, mode2, i162, this.f53021n, this.f53022o, i13, iMax);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f53008a = new SparseArray<>();
        this.f53009b = new ArrayList<>(4);
        this.f53010c = new V1.f();
        this.f53011d = 0;
        this.f53012e = 0;
        this.f53013f = a.e.API_PRIORITY_OTHER;
        this.f53014g = a.e.API_PRIORITY_OTHER;
        this.f53015h = true;
        this.f53016i = 263;
        this.f53017j = null;
        this.f53018k = null;
        this.f53019l = -1;
        this.f53020m = new HashMap<>();
        this.f53021n = -1;
        this.f53022o = -1;
        this.f53023p = -1;
        this.f53024q = -1;
        this.f53025r = 0;
        this.f53026s = 0;
        this.f53027t = new SparseArray<>();
        this.f53028u = new c(this);
        this.f53029v = 0;
        this.f53030w = 0;
        r(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        super(context, attributeSet, i10);
        this.f53008a = new SparseArray<>();
        this.f53009b = new ArrayList<>(4);
        this.f53010c = new V1.f();
        this.f53011d = 0;
        this.f53012e = 0;
        this.f53013f = a.e.API_PRIORITY_OTHER;
        this.f53014g = a.e.API_PRIORITY_OTHER;
        this.f53015h = true;
        this.f53016i = 263;
        this.f53017j = null;
        this.f53018k = null;
        this.f53019l = -1;
        this.f53020m = new HashMap<>();
        this.f53021n = -1;
        this.f53022o = -1;
        this.f53023p = -1;
        this.f53024q = -1;
        this.f53025r = 0;
        this.f53026s = 0;
        this.f53027t = new SparseArray<>();
        this.f53028u = new c(this);
        this.f53029v = 0;
        this.f53030w = 0;
        r(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10, int i11) throws XmlPullParserException, IOException {
        super(context, attributeSet, i10, i11);
        this.f53008a = new SparseArray<>();
        this.f53009b = new ArrayList<>(4);
        this.f53010c = new V1.f();
        this.f53011d = 0;
        this.f53012e = 0;
        this.f53013f = a.e.API_PRIORITY_OTHER;
        this.f53014g = a.e.API_PRIORITY_OTHER;
        this.f53015h = true;
        this.f53016i = 263;
        this.f53017j = null;
        this.f53018k = null;
        this.f53019l = -1;
        this.f53020m = new HashMap<>();
        this.f53021n = -1;
        this.f53022o = -1;
        this.f53023p = -1;
        this.f53024q = -1;
        this.f53025r = 0;
        this.f53026s = 0;
        this.f53027t = new SparseArray<>();
        this.f53028u = new c(this);
        this.f53029v = 0;
        this.f53030w = 0;
        r(attributeSet, i10, i11);
    }
}

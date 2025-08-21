package r6;

import Z.C;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import h6.C14478i;
import h6.D;
import j6.C14952d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k6.AbstractC15093a;
import k6.C15096d;
import k6.o;
import o6.b;
import p6.C16406a;
import p6.C16407b;
import p6.C16409d;
import p6.k;
import p6.l;
import p6.m;
import q6.u;
import v6.C17643d;
import v6.q;
import w6.C17847c;

/* renamed from: r6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16867i extends AbstractC16860b {

    /* renamed from: E, reason: collision with root package name */
    private final StringBuilder f159369E;

    /* renamed from: F, reason: collision with root package name */
    private final RectF f159370F;

    /* renamed from: G, reason: collision with root package name */
    private final Matrix f159371G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f159372H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f159373I;

    /* renamed from: J, reason: collision with root package name */
    private final Map<o6.d, List<C14952d>> f159374J;

    /* renamed from: K, reason: collision with root package name */
    private final C<String> f159375K;

    /* renamed from: L, reason: collision with root package name */
    private final List<d> f159376L;

    /* renamed from: M, reason: collision with root package name */
    private final o f159377M;

    /* renamed from: N, reason: collision with root package name */
    private final com.airbnb.lottie.o f159378N;

    /* renamed from: O, reason: collision with root package name */
    private final C14478i f159379O;

    /* renamed from: P, reason: collision with root package name */
    private u f159380P;

    /* renamed from: Q, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159381Q;

    /* renamed from: R, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159382R;

    /* renamed from: S, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159383S;

    /* renamed from: T, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159384T;

    /* renamed from: U, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f159385U;

    /* renamed from: V, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f159386V;

    /* renamed from: W, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f159387W;

    /* renamed from: X, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f159388X;

    /* renamed from: Y, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159389Y;

    /* renamed from: Z, reason: collision with root package name */
    private AbstractC15093a<Float, Float> f159390Z;

    /* renamed from: a0, reason: collision with root package name */
    private AbstractC15093a<Typeface, Typeface> f159391a0;

    /* renamed from: b0, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159392b0;

    /* renamed from: c0, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159393c0;

    /* renamed from: d0, reason: collision with root package name */
    private AbstractC15093a<Integer, Integer> f159394d0;

    /* renamed from: r6.i$a */
    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: r6.i$b */
    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: r6.i$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f159398a;

        /* renamed from: b, reason: collision with root package name */
        private float f159399b;

        private d() {
            this.f159398a = "";
            this.f159399b = 0.0f;
        }

        void c(String str, float f10) {
            this.f159398a = str;
            this.f159399b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private void U(String str, o6.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            o6.b bVar2 = bVar;
            Canvas canvas2 = canvas;
            T(strP, bVar2, canvas2, i10 + length, i11);
            canvas2.translate(this.f159372H.measureText(strP) + f10, 0.0f);
            length += strP.length();
            bVar = bVar2;
            canvas = canvas2;
        }
    }

    private void W(String str, o6.b bVar, o6.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        o6.b bVar2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            o6.d dVarE = this.f159379O.c().e(o6.d.c(str.charAt(i12), cVar.a(), cVar.c()));
            if (dVarE == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f13 = f11;
                i11 = i10;
                S(dVarE, f13, bVar2, canvas2, i12, i11);
                canvas2.translate((((float) dVarE.b()) * f13 * q.e()) + f12, 0.0f);
            }
            i12++;
            f11 = f13;
            bVar = bVar2;
            canvas = canvas2;
            i10 = i11;
        }
    }

    /* renamed from: r6.i$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f159397a;

        static {
            int[] iArr = new int[b.a.values().length];
            f159397a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159397a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f159397a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void Q(o6.b bVar, int i10, int i11) {
        AbstractC15093a<Integer, Integer> abstractC15093a = this.f159382R;
        if (abstractC15093a != null) {
            this.f159372H.setColor(abstractC15093a.h().intValue());
        } else if (this.f159381Q == null || !d0(i11)) {
            this.f159372H.setColor(bVar.f153627h);
        } else {
            this.f159372H.setColor(this.f159381Q.h().intValue());
        }
        AbstractC15093a<Integer, Integer> abstractC15093a2 = this.f159384T;
        if (abstractC15093a2 != null) {
            this.f159373I.setColor(abstractC15093a2.h().intValue());
        } else if (this.f159383S == null || !d0(i11)) {
            this.f159373I.setColor(bVar.f153628i);
        } else {
            this.f159373I.setColor(this.f159383S.h().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f159293x.h() == null ? 100 : this.f159293x.h().h().intValue();
        if (this.f159389Y != null && d0(i11)) {
            iIntValue = this.f159389Y.h().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i10) / 255.0f);
        this.f159372H.setAlpha(iRound);
        this.f159373I.setAlpha(iRound);
        AbstractC15093a<Float, Float> abstractC15093a3 = this.f159386V;
        if (abstractC15093a3 != null) {
            this.f159373I.setStrokeWidth(abstractC15093a3.h().floatValue());
        } else if (this.f159385U == null || !d0(i11)) {
            this.f159373I.setStrokeWidth(bVar.f153629j * q.e());
        } else {
            this.f159373I.setStrokeWidth(this.f159385U.h().floatValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(o6.b r18, o6.c r19, android.graphics.Canvas r20, int r21) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.C16867i.X(o6.b, o6.c, android.graphics.Canvas, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(o6.b r17, android.graphics.Matrix r18, o6.c r19, android.graphics.Canvas r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            k6.a<java.lang.Float, java.lang.Float> r1 = r0.f159390Z
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.f153622c
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = v6.q.g(r18)
            java.lang.String r1 = r7.f153620a
            java.util.List r9 = r0.b0(r1)
            int r10 = r9.size()
            int r1 = r7.f153624e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            k6.a<java.lang.Float, java.lang.Float> r2 = r0.f159388X
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            k6.a<java.lang.Float, java.lang.Float> r2 = r0.f159387W
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.h()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto Lb0
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.f153632m
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.g0(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto La6
            java.lang.Object r1 = r14.get(r15)
            r6.i$d r1 = (r6.C16867i.d) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = r6.C16867i.d.a(r1)
            r3 = r20
            boolean r2 = r0.f0(r3, r7, r12, r2)
            if (r2 == 0) goto L98
            java.lang.String r1 = r6.C16867i.d.b(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r8 = r21
            r0.W(r1, r2, r3, r4, r5, r6, r7, r8)
            r4 = r6
            goto L9a
        L98:
            r7 = r5
            r5 = r8
        L9a:
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r8 = r5
            r5 = r7
            r7 = r17
            goto L69
        La6:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.C16867i.Y(o6.b, android.graphics.Matrix, o6.c, android.graphics.Canvas, int):void");
    }

    private d Z(int i10) {
        for (int size = this.f159376L.size(); size < i10; size++) {
            this.f159376L.add(new d(null));
        }
        return this.f159376L.get(i10 - 1);
    }

    private List<C14952d> a0(o6.d dVar) {
        if (this.f159374J.containsKey(dVar)) {
            return this.f159374J.get(dVar);
        }
        List<q6.q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C14952d(this.f159378N, this, listA.get(i10), this.f159379O));
        }
        this.f159374J.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface c0(o6.c cVar) {
        Typeface typefaceH;
        AbstractC15093a<Typeface, Typeface> abstractC15093a = this.f159391a0;
        if (abstractC15093a != null && (typefaceH = abstractC15093a.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceB0 = this.f159378N.b0(cVar);
        return typefaceB0 != null ? typefaceB0 : cVar.d();
    }

    private boolean d0(int i10) {
        int length = this.f159377M.h().f153620a.length();
        AbstractC15093a<Integer, Integer> abstractC15093a = this.f159392b0;
        if (abstractC15093a == null || this.f159393c0 == null) {
            return true;
        }
        int iMin = Math.min(abstractC15093a.h().intValue(), this.f159393c0.h().intValue());
        int iMax = Math.max(this.f159392b0.h().intValue(), this.f159393c0.h().intValue());
        AbstractC15093a<Integer, Integer> abstractC15093a2 = this.f159394d0;
        if (abstractC15093a2 != null) {
            int iIntValue = abstractC15093a2.h().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f159380P == u.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    private boolean f0(Canvas canvas, o6.b bVar, int i10, float f10) {
        PointF pointF = bVar.f153631l;
        PointF pointF2 = bVar.f153632m;
        float fE = q.e();
        float f11 = (i10 * bVar.f153625f * fE) + (pointF == null ? 0.0f : (bVar.f153625f * fE) + pointF.y);
        if (this.f159378N.H() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f153622c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f159397a[bVar.f153623d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    private List<d> g0(String str, float f10, o6.c cVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                o6.d dVarE = this.f159379O.c().e(o6.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVarE != null) {
                    fMeasureText = ((float) dVarE.b()) * f11 * q.e();
                }
            } else {
                fMeasureText = this.f159372H.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                d dVarZ = Z(i10);
                if (i12 == i11) {
                    dVarZ.c(str.substring(i11, i13).trim(), (f13 - f16) - ((r9.length() - r7.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    dVarZ.c(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Z(i10).c(str.substring(i11), f13);
        }
        return this.f159376L.subList(0, i10);
    }

    @Override // r6.AbstractC16860b
    void u(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        Canvas canvas2;
        o6.b bVarH = this.f159377M.h();
        o6.c cVar = this.f159379O.g().get(bVarH.f153621b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVarH, i10, 0);
        if (this.f159378N.V0()) {
            canvas2 = canvas;
            Y(bVarH, matrix, cVar, canvas2, i10);
        } else {
            canvas2 = canvas;
            X(bVarH, cVar, canvas2, i10);
        }
        canvas2.restore();
    }

    C16867i(com.airbnb.lottie.o oVar, C16863e c16863e) {
        l lVar;
        l lVar2;
        C16409d c16409d;
        l lVar3;
        C16409d c16409d2;
        l lVar4;
        C16409d c16409d3;
        m mVar;
        C16409d c16409d4;
        m mVar2;
        C16407b c16407b;
        m mVar3;
        C16407b c16407b2;
        m mVar4;
        C16406a c16406a;
        m mVar5;
        C16406a c16406a2;
        super(oVar, c16863e);
        this.f159369E = new StringBuilder(2);
        this.f159370F = new RectF();
        this.f159371G = new Matrix();
        this.f159372H = new a(1);
        this.f159373I = new b(1);
        this.f159374J = new HashMap();
        this.f159375K = new C<>();
        this.f159376L = new ArrayList();
        this.f159380P = u.INDEX;
        this.f159378N = oVar;
        this.f159379O = c16863e.c();
        o oVarA = c16863e.t().a();
        this.f159377M = oVarA;
        oVarA.a(this);
        j(oVarA);
        k kVarU = c16863e.u();
        if (kVarU != null && (mVar5 = kVarU.f156165a) != null && (c16406a2 = mVar5.f156171a) != null) {
            AbstractC15093a<Integer, Integer> abstractC15093aA = c16406a2.a();
            this.f159381Q = abstractC15093aA;
            abstractC15093aA.a(this);
            j(this.f159381Q);
        }
        if (kVarU != null && (mVar4 = kVarU.f156165a) != null && (c16406a = mVar4.f156172b) != null) {
            AbstractC15093a<Integer, Integer> abstractC15093aA2 = c16406a.a();
            this.f159383S = abstractC15093aA2;
            abstractC15093aA2.a(this);
            j(this.f159383S);
        }
        if (kVarU != null && (mVar3 = kVarU.f156165a) != null && (c16407b2 = mVar3.f156173c) != null) {
            C15096d c15096dA = c16407b2.a();
            this.f159385U = c15096dA;
            c15096dA.a(this);
            j(this.f159385U);
        }
        if (kVarU != null && (mVar2 = kVarU.f156165a) != null && (c16407b = mVar2.f156174d) != null) {
            C15096d c15096dA2 = c16407b.a();
            this.f159387W = c15096dA2;
            c15096dA2.a(this);
            j(this.f159387W);
        }
        if (kVarU != null && (mVar = kVarU.f156165a) != null && (c16409d4 = mVar.f156175e) != null) {
            AbstractC15093a<Integer, Integer> abstractC15093aA3 = c16409d4.a();
            this.f159389Y = abstractC15093aA3;
            abstractC15093aA3.a(this);
            j(this.f159389Y);
        }
        if (kVarU != null && (lVar4 = kVarU.f156166b) != null && (c16409d3 = lVar4.f156167a) != null) {
            AbstractC15093a<Integer, Integer> abstractC15093aA4 = c16409d3.a();
            this.f159392b0 = abstractC15093aA4;
            abstractC15093aA4.a(this);
            j(this.f159392b0);
        }
        if (kVarU != null && (lVar3 = kVarU.f156166b) != null && (c16409d2 = lVar3.f156168b) != null) {
            AbstractC15093a<Integer, Integer> abstractC15093aA5 = c16409d2.a();
            this.f159393c0 = abstractC15093aA5;
            abstractC15093aA5.a(this);
            j(this.f159393c0);
        }
        if (kVarU != null && (lVar2 = kVarU.f156166b) != null && (c16409d = lVar2.f156169c) != null) {
            AbstractC15093a<Integer, Integer> abstractC15093aA6 = c16409d.a();
            this.f159394d0 = abstractC15093aA6;
            abstractC15093aA6.a(this);
            j(this.f159394d0);
        }
        if (kVarU != null && (lVar = kVarU.f156166b) != null) {
            this.f159380P = lVar.f156170d;
        }
    }

    private String P(String str, int i10) {
        int iCodePointAt = str.codePointAt(i10);
        int iCharCount = Character.charCount(iCodePointAt) + i10;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!e0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j10 = iCodePointAt;
        if (this.f159375K.c(j10)) {
            return this.f159375K.d(j10);
        }
        this.f159369E.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.f159369E.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.f159369E.toString();
        this.f159375K.i(j10, string);
        return string;
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private void S(o6.d dVar, float f10, o6.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        List<C14952d> listA0 = a0(dVar);
        for (int i12 = 0; i12 < listA0.size(); i12++) {
            Path path = listA0.get(i12).getPath();
            path.computeBounds(this.f159370F, false);
            this.f159371G.reset();
            this.f159371G.preTranslate(0.0f, (-bVar.f153626g) * q.e());
            this.f159371G.preScale(f10, f10);
            path.transform(this.f159371G);
            if (bVar.f153630k) {
                V(path, this.f159372H, canvas);
                V(path, this.f159373I, canvas);
            } else {
                V(path, this.f159373I, canvas);
                V(path, this.f159372H, canvas);
            }
        }
    }

    private void T(String str, o6.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        if (bVar.f153630k) {
            R(str, this.f159372H, canvas);
            R(str, this.f159373I, canvas);
        } else {
            R(str, this.f159373I, canvas);
            R(str, this.f159372H, canvas);
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private boolean e0(int i10) {
        if (Character.getType(i10) != 16 && Character.getType(i10) != 27 && Character.getType(i10) != 6 && Character.getType(i10) != 28 && Character.getType(i10) != 8 && Character.getType(i10) != 19) {
            return false;
        }
        return true;
    }

    @Override // r6.AbstractC16860b, o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        super.f(t10, c17847c);
        if (t10 == D.f135023a) {
            AbstractC15093a<Integer, Integer> abstractC15093a = this.f159382R;
            if (abstractC15093a != null) {
                H(abstractC15093a);
            }
            if (c17847c == null) {
                this.f159382R = null;
                return;
            }
            k6.q qVar = new k6.q(c17847c);
            this.f159382R = qVar;
            qVar.a(this);
            j(this.f159382R);
            return;
        }
        if (t10 == D.f135024b) {
            AbstractC15093a<Integer, Integer> abstractC15093a2 = this.f159384T;
            if (abstractC15093a2 != null) {
                H(abstractC15093a2);
            }
            if (c17847c == null) {
                this.f159384T = null;
                return;
            }
            k6.q qVar2 = new k6.q(c17847c);
            this.f159384T = qVar2;
            qVar2.a(this);
            j(this.f159384T);
            return;
        }
        if (t10 == D.f135041s) {
            AbstractC15093a<Float, Float> abstractC15093a3 = this.f159386V;
            if (abstractC15093a3 != null) {
                H(abstractC15093a3);
            }
            if (c17847c == null) {
                this.f159386V = null;
                return;
            }
            k6.q qVar3 = new k6.q(c17847c);
            this.f159386V = qVar3;
            qVar3.a(this);
            j(this.f159386V);
            return;
        }
        if (t10 == D.f135042t) {
            AbstractC15093a<Float, Float> abstractC15093a4 = this.f159388X;
            if (abstractC15093a4 != null) {
                H(abstractC15093a4);
            }
            if (c17847c == null) {
                this.f159388X = null;
                return;
            }
            k6.q qVar4 = new k6.q(c17847c);
            this.f159388X = qVar4;
            qVar4.a(this);
            j(this.f159388X);
            return;
        }
        if (t10 == D.f135012F) {
            AbstractC15093a<Float, Float> abstractC15093a5 = this.f159390Z;
            if (abstractC15093a5 != null) {
                H(abstractC15093a5);
            }
            if (c17847c == null) {
                this.f159390Z = null;
                return;
            }
            k6.q qVar5 = new k6.q(c17847c);
            this.f159390Z = qVar5;
            qVar5.a(this);
            j(this.f159390Z);
            return;
        }
        if (t10 == D.f135019M) {
            AbstractC15093a<Typeface, Typeface> abstractC15093a6 = this.f159391a0;
            if (abstractC15093a6 != null) {
                H(abstractC15093a6);
            }
            if (c17847c == null) {
                this.f159391a0 = null;
                return;
            }
            k6.q qVar6 = new k6.q(c17847c);
            this.f159391a0 = qVar6;
            qVar6.a(this);
            j(this.f159391a0);
            return;
        }
        if (t10 == D.f135021O) {
            this.f159377M.s(c17847c);
        }
    }

    @Override // r6.AbstractC16860b, j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        super.h(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f159379O.b().width(), this.f159379O.b().height());
    }
}

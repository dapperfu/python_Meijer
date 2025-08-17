package q6;

import Z.C;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import g6.C14209i;
import g6.D;
import i6.C14693d;
import j6.AbstractC14861a;
import j6.C14864d;
import j6.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n6.b;
import o6.C15997a;
import o6.C15998b;
import o6.C16000d;
import o6.k;
import o6.l;
import o6.m;
import p6.u;
import u6.C17230d;
import u6.q;
import v6.C17514c;

/* renamed from: q6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16479i extends AbstractC16472b {

    /* renamed from: E, reason: collision with root package name */
    private final StringBuilder f156921E;

    /* renamed from: F, reason: collision with root package name */
    private final RectF f156922F;

    /* renamed from: G, reason: collision with root package name */
    private final Matrix f156923G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f156924H;

    /* renamed from: I, reason: collision with root package name */
    private final Paint f156925I;

    /* renamed from: J, reason: collision with root package name */
    private final Map<n6.d, List<C14693d>> f156926J;

    /* renamed from: K, reason: collision with root package name */
    private final C<String> f156927K;

    /* renamed from: L, reason: collision with root package name */
    private final List<d> f156928L;

    /* renamed from: M, reason: collision with root package name */
    private final o f156929M;

    /* renamed from: N, reason: collision with root package name */
    private final com.airbnb.lottie.o f156930N;

    /* renamed from: O, reason: collision with root package name */
    private final C14209i f156931O;

    /* renamed from: P, reason: collision with root package name */
    private u f156932P;

    /* renamed from: Q, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156933Q;

    /* renamed from: R, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156934R;

    /* renamed from: S, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156935S;

    /* renamed from: T, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156936T;

    /* renamed from: U, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f156937U;

    /* renamed from: V, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f156938V;

    /* renamed from: W, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f156939W;

    /* renamed from: X, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f156940X;

    /* renamed from: Y, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156941Y;

    /* renamed from: Z, reason: collision with root package name */
    private AbstractC14861a<Float, Float> f156942Z;

    /* renamed from: a0, reason: collision with root package name */
    private AbstractC14861a<Typeface, Typeface> f156943a0;

    /* renamed from: b0, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156944b0;

    /* renamed from: c0, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156945c0;

    /* renamed from: d0, reason: collision with root package name */
    private AbstractC14861a<Integer, Integer> f156946d0;

    /* renamed from: q6.i$a */
    class a extends Paint {
        a(int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: q6.i$b */
    class b extends Paint {
        b(int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: q6.i$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f156950a;

        /* renamed from: b, reason: collision with root package name */
        private float f156951b;

        private d() {
            this.f156950a = "";
            this.f156951b = 0.0f;
        }

        void c(String str, float f10) {
            this.f156950a = str;
            this.f156951b = f10;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private void U(String str, n6.b bVar, Canvas canvas, float f10, int i10, int i11) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            n6.b bVar2 = bVar;
            Canvas canvas2 = canvas;
            T(strP, bVar2, canvas2, i10 + length, i11);
            canvas2.translate(this.f156924H.measureText(strP) + f10, 0.0f);
            length += strP.length();
            bVar = bVar2;
            canvas = canvas2;
        }
    }

    private void W(String str, n6.b bVar, n6.c cVar, Canvas canvas, float f10, float f11, float f12, int i10) {
        n6.b bVar2;
        Canvas canvas2;
        float f13;
        int i11;
        int i12 = 0;
        while (i12 < str.length()) {
            n6.d dVarE = this.f156931O.c().e(n6.d.c(str.charAt(i12), cVar.a(), cVar.c()));
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

    /* renamed from: q6.i$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156949a;

        static {
            int[] iArr = new int[b.a.values().length];
            f156949a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156949a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f156949a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void Q(n6.b bVar, int i10, int i11) {
        AbstractC14861a<Integer, Integer> abstractC14861a = this.f156934R;
        if (abstractC14861a != null) {
            this.f156924H.setColor(abstractC14861a.h().intValue());
        } else if (this.f156933Q == null || !d0(i11)) {
            this.f156924H.setColor(bVar.f151025h);
        } else {
            this.f156924H.setColor(this.f156933Q.h().intValue());
        }
        AbstractC14861a<Integer, Integer> abstractC14861a2 = this.f156936T;
        if (abstractC14861a2 != null) {
            this.f156925I.setColor(abstractC14861a2.h().intValue());
        } else if (this.f156935S == null || !d0(i11)) {
            this.f156925I.setColor(bVar.f151026i);
        } else {
            this.f156925I.setColor(this.f156935S.h().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f156845x.h() == null ? 100 : this.f156845x.h().h().intValue();
        if (this.f156941Y != null && d0(i11)) {
            iIntValue = this.f156941Y.h().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i10) / 255.0f);
        this.f156924H.setAlpha(iRound);
        this.f156925I.setAlpha(iRound);
        AbstractC14861a<Float, Float> abstractC14861a3 = this.f156938V;
        if (abstractC14861a3 != null) {
            this.f156925I.setStrokeWidth(abstractC14861a3.h().floatValue());
        } else if (this.f156937U == null || !d0(i11)) {
            this.f156925I.setStrokeWidth(bVar.f151027j * q.e());
        } else {
            this.f156925I.setStrokeWidth(this.f156937U.h().floatValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(n6.b r18, n6.c r19, android.graphics.Canvas r20, int r21) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C16479i.X(n6.b, n6.c, android.graphics.Canvas, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(n6.b r17, android.graphics.Matrix r18, n6.c r19, android.graphics.Canvas r20, int r21) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            j6.a<java.lang.Float, java.lang.Float> r1 = r0.f156942Z
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.f151020c
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = u6.q.g(r18)
            java.lang.String r1 = r7.f151018a
            java.util.List r9 = r0.b0(r1)
            int r10 = r9.size()
            int r1 = r7.f151022e
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            j6.a<java.lang.Float, java.lang.Float> r2 = r0.f156940X
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
            j6.a<java.lang.Float, java.lang.Float> r2 = r0.f156939W
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
            android.graphics.PointF r2 = r7.f151030m
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
            q6.i$d r1 = (q6.C16479i.d) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = q6.C16479i.d.a(r1)
            r3 = r20
            boolean r2 = r0.f0(r3, r7, r12, r2)
            if (r2 == 0) goto L98
            java.lang.String r1 = q6.C16479i.d.b(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: q6.C16479i.Y(n6.b, android.graphics.Matrix, n6.c, android.graphics.Canvas, int):void");
    }

    private d Z(int i10) {
        for (int size = this.f156928L.size(); size < i10; size++) {
            this.f156928L.add(new d(null));
        }
        return this.f156928L.get(i10 - 1);
    }

    private List<C14693d> a0(n6.d dVar) {
        if (this.f156926J.containsKey(dVar)) {
            return this.f156926J.get(dVar);
        }
        List<p6.q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new C14693d(this.f156930N, this, listA.get(i10), this.f156931O));
        }
        this.f156926J.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface c0(n6.c cVar) {
        Typeface typefaceH;
        AbstractC14861a<Typeface, Typeface> abstractC14861a = this.f156943a0;
        if (abstractC14861a != null && (typefaceH = abstractC14861a.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceB0 = this.f156930N.b0(cVar);
        return typefaceB0 != null ? typefaceB0 : cVar.d();
    }

    private boolean d0(int i10) {
        int length = this.f156929M.h().f151018a.length();
        AbstractC14861a<Integer, Integer> abstractC14861a = this.f156944b0;
        if (abstractC14861a == null || this.f156945c0 == null) {
            return true;
        }
        int iMin = Math.min(abstractC14861a.h().intValue(), this.f156945c0.h().intValue());
        int iMax = Math.max(this.f156944b0.h().intValue(), this.f156945c0.h().intValue());
        AbstractC14861a<Integer, Integer> abstractC14861a2 = this.f156946d0;
        if (abstractC14861a2 != null) {
            int iIntValue = abstractC14861a2.h().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f156932P == u.INDEX) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    private boolean f0(Canvas canvas, n6.b bVar, int i10, float f10) {
        PointF pointF = bVar.f151029l;
        PointF pointF2 = bVar.f151030m;
        float fE = q.e();
        float f11 = (i10 * bVar.f151023f * fE) + (pointF == null ? 0.0f : (bVar.f151023f * fE) + pointF.y);
        if (this.f156930N.H() && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + bVar.f151020c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = c.f156949a[bVar.f151021d.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 == 3) {
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
        return true;
    }

    private List<d> g0(String str, float f10, n6.c cVar, float f11, float f12, boolean z10) {
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
                n6.d dVarE = this.f156931O.c().e(n6.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVarE != null) {
                    fMeasureText = ((float) dVarE.b()) * f11 * q.e();
                }
            } else {
                fMeasureText = this.f156924H.measureText(str.substring(i13, i13 + 1));
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
        return this.f156928L.subList(0, i10);
    }

    @Override // q6.AbstractC16472b
    void u(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        Canvas canvas2;
        n6.b bVarH = this.f156929M.h();
        n6.c cVar = this.f156931O.g().get(bVarH.f151019b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVarH, i10, 0);
        if (this.f156930N.V0()) {
            canvas2 = canvas;
            Y(bVarH, matrix, cVar, canvas2, i10);
        } else {
            canvas2 = canvas;
            X(bVarH, cVar, canvas2, i10);
        }
        canvas2.restore();
    }

    C16479i(com.airbnb.lottie.o oVar, C16475e c16475e) {
        l lVar;
        l lVar2;
        C16000d c16000d;
        l lVar3;
        C16000d c16000d2;
        l lVar4;
        C16000d c16000d3;
        m mVar;
        C16000d c16000d4;
        m mVar2;
        C15998b c15998b;
        m mVar3;
        C15998b c15998b2;
        m mVar4;
        C15997a c15997a;
        m mVar5;
        C15997a c15997a2;
        super(oVar, c16475e);
        this.f156921E = new StringBuilder(2);
        this.f156922F = new RectF();
        this.f156923G = new Matrix();
        this.f156924H = new a(1);
        this.f156925I = new b(1);
        this.f156926J = new HashMap();
        this.f156927K = new C<>();
        this.f156928L = new ArrayList();
        this.f156932P = u.INDEX;
        this.f156930N = oVar;
        this.f156931O = c16475e.c();
        o oVarA = c16475e.t().a();
        this.f156929M = oVarA;
        oVarA.a(this);
        j(oVarA);
        k kVarU = c16475e.u();
        if (kVarU != null && (mVar5 = kVarU.f153173a) != null && (c15997a2 = mVar5.f153179a) != null) {
            AbstractC14861a<Integer, Integer> abstractC14861aA = c15997a2.a();
            this.f156933Q = abstractC14861aA;
            abstractC14861aA.a(this);
            j(this.f156933Q);
        }
        if (kVarU != null && (mVar4 = kVarU.f153173a) != null && (c15997a = mVar4.f153180b) != null) {
            AbstractC14861a<Integer, Integer> abstractC14861aA2 = c15997a.a();
            this.f156935S = abstractC14861aA2;
            abstractC14861aA2.a(this);
            j(this.f156935S);
        }
        if (kVarU != null && (mVar3 = kVarU.f153173a) != null && (c15998b2 = mVar3.f153181c) != null) {
            C14864d c14864dA = c15998b2.a();
            this.f156937U = c14864dA;
            c14864dA.a(this);
            j(this.f156937U);
        }
        if (kVarU != null && (mVar2 = kVarU.f153173a) != null && (c15998b = mVar2.f153182d) != null) {
            C14864d c14864dA2 = c15998b.a();
            this.f156939W = c14864dA2;
            c14864dA2.a(this);
            j(this.f156939W);
        }
        if (kVarU != null && (mVar = kVarU.f153173a) != null && (c16000d4 = mVar.f153183e) != null) {
            AbstractC14861a<Integer, Integer> abstractC14861aA3 = c16000d4.a();
            this.f156941Y = abstractC14861aA3;
            abstractC14861aA3.a(this);
            j(this.f156941Y);
        }
        if (kVarU != null && (lVar4 = kVarU.f153174b) != null && (c16000d3 = lVar4.f153175a) != null) {
            AbstractC14861a<Integer, Integer> abstractC14861aA4 = c16000d3.a();
            this.f156944b0 = abstractC14861aA4;
            abstractC14861aA4.a(this);
            j(this.f156944b0);
        }
        if (kVarU != null && (lVar3 = kVarU.f153174b) != null && (c16000d2 = lVar3.f153176b) != null) {
            AbstractC14861a<Integer, Integer> abstractC14861aA5 = c16000d2.a();
            this.f156945c0 = abstractC14861aA5;
            abstractC14861aA5.a(this);
            j(this.f156945c0);
        }
        if (kVarU != null && (lVar2 = kVarU.f153174b) != null && (c16000d = lVar2.f153177c) != null) {
            AbstractC14861a<Integer, Integer> abstractC14861aA6 = c16000d.a();
            this.f156946d0 = abstractC14861aA6;
            abstractC14861aA6.a(this);
            j(this.f156946d0);
        }
        if (kVarU != null && (lVar = kVarU.f153174b) != null) {
            this.f156932P = lVar.f153178d;
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
        if (this.f156927K.c(j10)) {
            return this.f156927K.d(j10);
        }
        this.f156921E.setLength(0);
        while (i10 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i10);
            this.f156921E.appendCodePoint(iCodePointAt3);
            i10 += Character.charCount(iCodePointAt3);
        }
        String string = this.f156921E.toString();
        this.f156927K.i(j10, string);
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

    private void S(n6.d dVar, float f10, n6.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        List<C14693d> listA0 = a0(dVar);
        for (int i12 = 0; i12 < listA0.size(); i12++) {
            Path path = listA0.get(i12).getPath();
            path.computeBounds(this.f156922F, false);
            this.f156923G.reset();
            this.f156923G.preTranslate(0.0f, (-bVar.f151024g) * q.e());
            this.f156923G.preScale(f10, f10);
            path.transform(this.f156923G);
            if (bVar.f151028k) {
                V(path, this.f156924H, canvas);
                V(path, this.f156925I, canvas);
            } else {
                V(path, this.f156925I, canvas);
                V(path, this.f156924H, canvas);
            }
        }
    }

    private void T(String str, n6.b bVar, Canvas canvas, int i10, int i11) {
        Q(bVar, i11, i10);
        if (bVar.f151028k) {
            R(str, this.f156924H, canvas);
            R(str, this.f156925I, canvas);
        } else {
            R(str, this.f156925I, canvas);
            R(str, this.f156924H, canvas);
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

    @Override // q6.AbstractC16472b, n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        super.d(t10, c17514c);
        if (t10 == D.f132847a) {
            AbstractC14861a<Integer, Integer> abstractC14861a = this.f156934R;
            if (abstractC14861a != null) {
                H(abstractC14861a);
            }
            if (c17514c == null) {
                this.f156934R = null;
                return;
            }
            j6.q qVar = new j6.q(c17514c);
            this.f156934R = qVar;
            qVar.a(this);
            j(this.f156934R);
            return;
        }
        if (t10 == D.f132848b) {
            AbstractC14861a<Integer, Integer> abstractC14861a2 = this.f156936T;
            if (abstractC14861a2 != null) {
                H(abstractC14861a2);
            }
            if (c17514c == null) {
                this.f156936T = null;
                return;
            }
            j6.q qVar2 = new j6.q(c17514c);
            this.f156936T = qVar2;
            qVar2.a(this);
            j(this.f156936T);
            return;
        }
        if (t10 == D.f132865s) {
            AbstractC14861a<Float, Float> abstractC14861a3 = this.f156938V;
            if (abstractC14861a3 != null) {
                H(abstractC14861a3);
            }
            if (c17514c == null) {
                this.f156938V = null;
                return;
            }
            j6.q qVar3 = new j6.q(c17514c);
            this.f156938V = qVar3;
            qVar3.a(this);
            j(this.f156938V);
            return;
        }
        if (t10 == D.f132866t) {
            AbstractC14861a<Float, Float> abstractC14861a4 = this.f156940X;
            if (abstractC14861a4 != null) {
                H(abstractC14861a4);
            }
            if (c17514c == null) {
                this.f156940X = null;
                return;
            }
            j6.q qVar4 = new j6.q(c17514c);
            this.f156940X = qVar4;
            qVar4.a(this);
            j(this.f156940X);
            return;
        }
        if (t10 == D.f132836F) {
            AbstractC14861a<Float, Float> abstractC14861a5 = this.f156942Z;
            if (abstractC14861a5 != null) {
                H(abstractC14861a5);
            }
            if (c17514c == null) {
                this.f156942Z = null;
                return;
            }
            j6.q qVar5 = new j6.q(c17514c);
            this.f156942Z = qVar5;
            qVar5.a(this);
            j(this.f156942Z);
            return;
        }
        if (t10 == D.f132843M) {
            AbstractC14861a<Typeface, Typeface> abstractC14861a6 = this.f156943a0;
            if (abstractC14861a6 != null) {
                H(abstractC14861a6);
            }
            if (c17514c == null) {
                this.f156943a0 = null;
                return;
            }
            j6.q qVar6 = new j6.q(c17514c);
            this.f156943a0 = qVar6;
            qVar6.a(this);
            j(this.f156943a0);
            return;
        }
        if (t10 == D.f132845O) {
            this.f156929M.s(c17514c);
        }
    }

    @Override // q6.AbstractC16472b, i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        super.g(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.f156931O.b().width(), this.f156931O.b().height());
    }
}

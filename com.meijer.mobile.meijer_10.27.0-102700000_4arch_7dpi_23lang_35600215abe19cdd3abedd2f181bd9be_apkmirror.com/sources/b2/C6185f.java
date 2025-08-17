package b2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: b2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6185f {
    private static Shader.TileMode d(int i10) {
        return i10 != 1 ? i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        return aVar != null ? aVar : z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayQ = C6190k.q(resources, theme, attributeSet, Y1.g.f40025B);
        float fJ = C6190k.j(typedArrayQ, xmlPullParser, "startX", Y1.g.f40034K, 0.0f);
        float fJ2 = C6190k.j(typedArrayQ, xmlPullParser, "startY", Y1.g.f40035L, 0.0f);
        float fJ3 = C6190k.j(typedArrayQ, xmlPullParser, "endX", Y1.g.f40036M, 0.0f);
        float fJ4 = C6190k.j(typedArrayQ, xmlPullParser, "endY", Y1.g.f40037N, 0.0f);
        float fJ5 = C6190k.j(typedArrayQ, xmlPullParser, "centerX", Y1.g.f40029F, 0.0f);
        float fJ6 = C6190k.j(typedArrayQ, xmlPullParser, "centerY", Y1.g.f40030G, 0.0f);
        int iK = C6190k.k(typedArrayQ, xmlPullParser, "type", Y1.g.f40028E, 0);
        int iF = C6190k.f(typedArrayQ, xmlPullParser, "startColor", Y1.g.f40026C, 0);
        boolean zP = C6190k.p(xmlPullParser, "centerColor");
        int iF2 = C6190k.f(typedArrayQ, xmlPullParser, "centerColor", Y1.g.f40033J, 0);
        int iF3 = C6190k.f(typedArrayQ, xmlPullParser, "endColor", Y1.g.f40027D, 0);
        int iK2 = C6190k.k(typedArrayQ, xmlPullParser, "tileMode", Y1.g.f40032I, 0);
        float fJ7 = C6190k.j(typedArrayQ, xmlPullParser, "gradientRadius", Y1.g.f40031H, 0.0f);
        typedArrayQ.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iF, iF3, zP, iF2);
        if (iK != 1) {
            return iK != 2 ? new LinearGradient(fJ, fJ2, fJ3, fJ4, aVarA.f59720a, aVarA.f59721b, d(iK2)) : new SweepGradient(fJ5, fJ6, aVarA.f59720a, aVarA.f59721b);
        }
        if (fJ7 > 0.0f) {
            return new RadialGradient(fJ5, fJ6, fJ7, aVarA.f59720a, aVarA.f59721b, d(iK2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new b2.C6185f.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static b2.C6185f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = Y1.g.f40038O
            android.content.res.TypedArray r3 = b2.C6190k.q(r8, r11, r10, r3)
            int r5 = Y1.g.f40039P
            boolean r5 = r3.hasValue(r5)
            int r6 = Y1.g.f40040Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = Y1.g.f40039P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = Y1.g.f40040Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            b2.f$a r8 = new b2.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C6185f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b2.f$a");
    }

    /* renamed from: b2.f$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final int[] f59720a;

        /* renamed from: b, reason: collision with root package name */
        final float[] f59721b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f59720a = new int[size];
            this.f59721b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f59720a[i10] = list.get(i10).intValue();
                this.f59721b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f59720a = new int[]{i10, i11};
            this.f59721b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f59720a = new int[]{i10, i11, i12};
            this.f59721b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

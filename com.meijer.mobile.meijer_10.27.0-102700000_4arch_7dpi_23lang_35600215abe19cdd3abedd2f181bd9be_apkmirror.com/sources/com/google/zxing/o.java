package com.google.zxing;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final float f90858a;

    /* renamed from: b, reason: collision with root package name */
    private final float f90859b;

    public static void e(o[] oVarArr) {
        o oVar;
        o oVar2;
        o oVar3;
        float fB = b(oVarArr[0], oVarArr[1]);
        float fB2 = b(oVarArr[1], oVarArr[2]);
        float fB3 = b(oVarArr[0], oVarArr[2]);
        if (fB2 >= fB && fB2 >= fB3) {
            oVar = oVarArr[0];
            oVar2 = oVarArr[1];
            oVar3 = oVarArr[2];
        } else if (fB3 < fB2 || fB3 < fB) {
            oVar = oVarArr[2];
            oVar2 = oVarArr[0];
            oVar3 = oVarArr[1];
        } else {
            oVar = oVarArr[1];
            oVar2 = oVarArr[0];
            oVar3 = oVarArr[2];
        }
        if (a(oVar2, oVar, oVar3) < 0.0f) {
            o oVar4 = oVar3;
            oVar3 = oVar2;
            oVar2 = oVar4;
        }
        oVarArr[0] = oVar2;
        oVarArr[1] = oVar;
        oVarArr[2] = oVar3;
    }

    private static float a(o oVar, o oVar2, o oVar3) {
        float f10 = oVar2.f90858a;
        float f11 = oVar2.f90859b;
        return ((oVar3.f90858a - f10) * (oVar.f90859b - f11)) - ((oVar3.f90859b - f11) * (oVar.f90858a - f10));
    }

    public static float b(o oVar, o oVar2) {
        return Hg.a.a(oVar.f90858a, oVar.f90859b, oVar2.f90858a, oVar2.f90859b);
    }

    public final float c() {
        return this.f90858a;
    }

    public final float d() {
        return this.f90859b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f90858a == oVar.f90858a && this.f90859b == oVar.f90859b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f90858a) * 31) + Float.floatToIntBits(this.f90859b);
    }

    public final String toString() {
        return "(" + this.f90858a + ',' + this.f90859b + ')';
    }

    public o(float f10, float f11) {
        this.f90858a = f10;
        this.f90859b = f11;
    }
}

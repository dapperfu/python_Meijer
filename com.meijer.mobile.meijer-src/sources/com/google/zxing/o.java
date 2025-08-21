package com.google.zxing;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final float f91697a;

    /* renamed from: b, reason: collision with root package name */
    private final float f91698b;

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
        float f10 = oVar2.f91697a;
        float f11 = oVar2.f91698b;
        return ((oVar3.f91697a - f10) * (oVar.f91698b - f11)) - ((oVar3.f91698b - f11) * (oVar.f91697a - f10));
    }

    public static float b(o oVar, o oVar2) {
        return Jg.a.a(oVar.f91697a, oVar.f91698b, oVar2.f91697a, oVar2.f91698b);
    }

    public final float c() {
        return this.f91697a;
    }

    public final float d() {
        return this.f91698b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f91697a == oVar.f91697a && this.f91698b == oVar.f91698b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f91697a) * 31) + Float.floatToIntBits(this.f91698b);
    }

    public final String toString() {
        return "(" + this.f91697a + ',' + this.f91698b + ')';
    }

    public o(float f10, float f11) {
        this.f91697a = f10;
        this.f91698b = f11;
    }
}

package t6;

import android.graphics.PointF;
import java.io.IOException;
import o6.b;
import u6.AbstractC17353c;

/* renamed from: t6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17196i implements N<o6.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C17196i f162301a = new C17196i();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17353c.a f162302b = AbstractC17353c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // t6.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o6.b a(AbstractC17353c abstractC17353c, float f10) throws IOException {
        b.a aVar = b.a.CENTER;
        abstractC17353c.c();
        b.a aVar2 = aVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zNextBoolean = true;
        while (abstractC17353c.hasNext()) {
            switch (abstractC17353c.l(f162302b)) {
                case 0:
                    strNextString = abstractC17353c.nextString();
                    break;
                case 1:
                    strNextString2 = abstractC17353c.nextString();
                    break;
                case 2:
                    fNextDouble = (float) abstractC17353c.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = abstractC17353c.nextInt();
                    aVar2 = b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = b.a.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    iNextInt = abstractC17353c.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) abstractC17353c.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) abstractC17353c.nextDouble();
                    break;
                case 7:
                    iD = s.d(abstractC17353c);
                    break;
                case 8:
                    iD2 = s.d(abstractC17353c);
                    break;
                case 9:
                    fNextDouble4 = (float) abstractC17353c.nextDouble();
                    break;
                case 10:
                    zNextBoolean = abstractC17353c.nextBoolean();
                    break;
                case 11:
                    abstractC17353c.b();
                    PointF pointF3 = new PointF(((float) abstractC17353c.nextDouble()) * f10, ((float) abstractC17353c.nextDouble()) * f10);
                    abstractC17353c.d();
                    pointF = pointF3;
                    break;
                case 12:
                    abstractC17353c.b();
                    PointF pointF4 = new PointF(((float) abstractC17353c.nextDouble()) * f10, ((float) abstractC17353c.nextDouble()) * f10);
                    abstractC17353c.d();
                    pointF2 = pointF4;
                    break;
                default:
                    abstractC17353c.m();
                    abstractC17353c.skipValue();
                    break;
            }
        }
        abstractC17353c.g();
        return new o6.b(strNextString, strNextString2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }

    private C17196i() {
    }
}

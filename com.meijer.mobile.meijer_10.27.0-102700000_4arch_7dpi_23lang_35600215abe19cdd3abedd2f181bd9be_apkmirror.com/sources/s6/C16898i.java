package s6;

import android.graphics.PointF;
import java.io.IOException;
import n6.b;
import t6.AbstractC17067c;

/* renamed from: s6.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16898i implements InterfaceC16889N<n6.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final C16898i f160240a = new C16898i();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC17067c.a f160241b = AbstractC17067c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // s6.InterfaceC16889N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n6.b a(AbstractC17067c abstractC17067c, float f10) throws IOException {
        b.a aVar = b.a.CENTER;
        abstractC17067c.c();
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
        while (abstractC17067c.hasNext()) {
            switch (abstractC17067c.l(f160241b)) {
                case 0:
                    strNextString = abstractC17067c.nextString();
                    break;
                case 1:
                    strNextString2 = abstractC17067c.nextString();
                    break;
                case 2:
                    fNextDouble = (float) abstractC17067c.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = abstractC17067c.nextInt();
                    aVar2 = b.a.CENTER;
                    if (iNextInt2 <= aVar2.ordinal() && iNextInt2 >= 0) {
                        aVar2 = b.a.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case 4:
                    iNextInt = abstractC17067c.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) abstractC17067c.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) abstractC17067c.nextDouble();
                    break;
                case 7:
                    iD = C16908s.d(abstractC17067c);
                    break;
                case 8:
                    iD2 = C16908s.d(abstractC17067c);
                    break;
                case 9:
                    fNextDouble4 = (float) abstractC17067c.nextDouble();
                    break;
                case 10:
                    zNextBoolean = abstractC17067c.nextBoolean();
                    break;
                case 11:
                    abstractC17067c.b();
                    PointF pointF3 = new PointF(((float) abstractC17067c.nextDouble()) * f10, ((float) abstractC17067c.nextDouble()) * f10);
                    abstractC17067c.d();
                    pointF = pointF3;
                    break;
                case 12:
                    abstractC17067c.b();
                    PointF pointF4 = new PointF(((float) abstractC17067c.nextDouble()) * f10, ((float) abstractC17067c.nextDouble()) * f10);
                    abstractC17067c.d();
                    pointF2 = pointF4;
                    break;
                default:
                    abstractC17067c.m();
                    abstractC17067c.skipValue();
                    break;
            }
        }
        abstractC17067c.g();
        return new n6.b(strNextString, strNextString2, fNextDouble, aVar2, iNextInt, fNextDouble2, fNextDouble3, iD, iD2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }

    private C16898i() {
    }
}

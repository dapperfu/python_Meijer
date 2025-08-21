package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9043o1 implements InterfaceC8189g1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC8042eh0 f78118a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78119b;

    private C9043o1(int i10, AbstractC8042eh0 abstractC8042eh0) {
        this.f78119b = i10;
        this.f78118a = abstractC8042eh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8189g1
    public final int zza() {
        return this.f78119b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C9043o1 b(int i10, GQ gq2) {
        InterfaceC8189g1 c9150p1;
        String str;
        C7723bh0 c7723bh0 = new C7723bh0();
        int iU = gq2.u();
        int i11 = -2;
        while (gq2.r() > 8) {
            int iY = gq2.y();
            int iT = gq2.t() + gq2.y();
            gq2.k(iT);
            if (iY != 1414744396) {
                C9150p1 c9150p12 = null;
                switch (iY) {
                    case 1718776947:
                        if (i11 == 2) {
                            gq2.m(4);
                            int iY2 = gq2.y();
                            int iY3 = gq2.y();
                            gq2.m(4);
                            int iY4 = gq2.y();
                            switch (iY4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                C10042xL.f("StreamFormatChunk", "Ignoring track with unsupported compression " + iY4);
                            } else {
                                C9717uH0 c9717uH0 = new C9717uH0();
                                c9717uH0.G(iY2);
                                c9717uH0.k(iY3);
                                c9717uH0.B(str);
                                c9150p12 = new C9150p1(c9717uH0.H());
                            }
                        } else if (i11 == 1) {
                            int iA = gq2.A();
                            String str2 = iA != 1 ? iA != 85 ? iA != 255 ? iA != 8192 ? iA != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iA2 = gq2.A();
                                int iY5 = gq2.y();
                                gq2.m(6);
                                int iF = OV.F(gq2.A());
                                int iA3 = gq2.r() > 0 ? gq2.A() : 0;
                                byte[] bArr = new byte[iA3];
                                gq2.h(bArr, 0, iA3);
                                C9717uH0 c9717uH02 = new C9717uH0();
                                c9717uH02.B(str2);
                                c9717uH02.r0(iA2);
                                c9717uH02.C(iY5);
                                if ("audio/raw".equals(str2) && iF != 0) {
                                    c9717uH02.u(iF);
                                }
                                if ("audio/mp4a-latm".equals(str2) && iA3 > 0) {
                                    c9717uH02.n(AbstractC8042eh0.u(bArr));
                                }
                                c9150p1 = new C9150p1(c9717uH02.H());
                                break;
                            } else {
                                C10042xL.f("StreamFormatChunk", "Ignoring track with unsupported format tag " + iA);
                            }
                        } else {
                            C10042xL.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(OV.d(i11)));
                        }
                        c9150p1 = c9150p12;
                        break;
                    case 1751742049:
                        c9150p1 = C8722l1.a(gq2);
                        break;
                    case 1752331379:
                        c9150p1 = C8829m1.a(gq2);
                        break;
                    case 1852994675:
                        c9150p1 = C9257q1.a(gq2);
                        break;
                    default:
                        c9150p1 = c9150p12;
                        break;
                }
            } else {
                c9150p1 = b(gq2.y(), gq2);
            }
            if (c9150p1 != null) {
                if (c9150p1.zza() == 1752331379) {
                    int i12 = ((C8829m1) c9150p1).f77532a;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        C10042xL.f("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                c7723bh0.g(c9150p1);
            }
            gq2.l(iT);
            gq2.k(iU);
        }
        return new C9043o1(i10, c7723bh0.j());
    }

    public final InterfaceC8189g1 a(Class cls) {
        AbstractC8042eh0 abstractC8042eh0 = this.f78118a;
        int size = abstractC8042eh0.size();
        int i10 = 0;
        while (i10 < size) {
            InterfaceC8189g1 interfaceC8189g1 = (InterfaceC8189g1) abstractC8042eh0.get(i10);
            i10++;
            if (interfaceC8189g1.getClass() == cls) {
                return interfaceC8189g1;
            }
        }
        return null;
    }
}

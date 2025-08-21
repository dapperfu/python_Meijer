package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8613k0 implements InterfaceC9789v0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f76385c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: d, reason: collision with root package name */
    private static final C8506j0 f76386d = new C8506j0(new InterfaceC8401i0() { // from class: com.google.android.gms.internal.ads.g0
        @Override // com.google.android.gms.internal.ads.InterfaceC8401i0
        public final Constructor zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC9255q0.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private static final C8506j0 f76387e = new C8506j0(new InterfaceC8401i0() { // from class: com.google.android.gms.internal.ads.h0
        @Override // com.google.android.gms.internal.ads.InterfaceC8401i0
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC9255q0.class).getConstructor(null);
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private AbstractC8042eh0 f76388a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8835m4 f76389b = new C8302h4();

    private final void b(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C8730l5());
                break;
            case 1:
                list.add(new C8944n5());
                break;
            case 2:
                list.add(new C9158p5(0));
                break;
            case 3:
                list.add(new C8082f1(0));
                break;
            case 4:
                InterfaceC9255q0 interfaceC9255q0A = f76386d.a(0);
                if (interfaceC9255q0A == null) {
                    list.add(new C10005x1(0));
                    break;
                } else {
                    list.add(interfaceC9255q0A);
                    break;
                }
            case 5:
                list.add(new C10219z1());
                break;
            case 6:
                list.add(new T2(this.f76389b, 0));
                break;
            case 7:
                list.add(new Z2(0));
                break;
            case 8:
                list.add(new C10116y3(this.f76389b, 0, null, null, AbstractC8042eh0.t(), null));
                list.add(new D3(this.f76389b, 0));
                break;
            case 9:
                list.add(new U3());
                break;
            case 10:
                list.add(new V5());
                break;
            case 11:
                if (this.f76388a == null) {
                    this.f76388a = AbstractC8042eh0.t();
                }
                list.add(new C8092f6(1, 0, this.f76389b, new C8982nU(0L), new C9371r5(0, this.f76388a), 112800));
                break;
            case 12:
                list.add(new C9373r6());
                break;
            case 14:
                list.add(new F1(0));
                break;
            case 15:
                InterfaceC9255q0 interfaceC9255q0A2 = f76387e.a(new Object[0]);
                if (interfaceC9255q0A2 != null) {
                    list.add(interfaceC9255q0A2);
                    break;
                }
                break;
            case 16:
                list.add(new C8615k1(0, this.f76389b));
                break;
            case 17:
                list.add(new C8088f4());
                break;
            case 18:
                list.add(new C9908w6());
                break;
            case 19:
                list.add(new C9470s1());
                break;
            case 20:
                list.add(new D1());
                break;
            case 21:
                list.add(new C9363r1());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9789v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC9255q0[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8613k0.a(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.q0[]");
    }
}

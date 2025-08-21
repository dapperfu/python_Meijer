package R3;

import M3.c;
import a3.y;
import androidx.media3.common.ParserException;
import d3.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import x3.I;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class q {

    /* renamed from: d, reason: collision with root package name */
    private static final De.t f31808d = De.t.e(':');

    /* renamed from: e, reason: collision with root package name */
    private static final De.t f31809e = De.t.e('*');

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f31810a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f31811b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f31812c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31813a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31814b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31815c;

        public a(int i10, long j10, int i11) {
            this.f31813a = i10;
            this.f31814b = j10;
            this.f31815c = i11;
        }
    }

    private void a(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        D d10 = new D(8);
        interfaceC18078q.readFully(d10.e(), 0, 8);
        this.f31812c = d10.u() + 8;
        if (d10.q() != 1397048916) {
            i10.f170165a = 0L;
        } else {
            i10.f170165a = interfaceC18078q.getPosition() - (this.f31812c - 12);
            this.f31811b = 2;
        }
    }

    private static M3.c f(D d10, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listH = f31809e.h(d10.E(i10));
        for (int i11 = 0; i11 < listH.size(); i11++) {
            List<String> listH2 = f31808d.h(listH.get(i11));
            if (listH2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new c.a(Long.parseLong(listH2.get(0)), Long.parseLong(listH2.get(1)), 1 << (Integer.parseInt(listH2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.a(null, e10);
            }
        }
        return new M3.c(arrayList);
    }

    public int c(InterfaceC18078q interfaceC18078q, I i10, List<y.a> list) throws IOException {
        int i11 = this.f31811b;
        long j10 = 0;
        if (i11 == 0) {
            long length = interfaceC18078q.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f170165a = j10;
            this.f31811b = 1;
        } else if (i11 == 1) {
            a(interfaceC18078q, i10);
        } else if (i11 == 2) {
            d(interfaceC18078q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC18078q, list);
            i10.f170165a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f31810a.clear();
        this.f31811b = 0;
    }

    private static int b(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        long length = interfaceC18078q.getLength();
        int i11 = this.f31812c - 20;
        D d10 = new D(i11);
        interfaceC18078q.readFully(d10.e(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            d10.X(2);
            short sW = d10.w();
            if (sW != 2192 && sW != 2816 && sW != 2817 && sW != 2819 && sW != 2820) {
                d10.X(8);
            } else {
                this.f31810a.add(new a(sW, (length - this.f31812c) - d10.u(), d10.u()));
            }
        }
        if (this.f31810a.isEmpty()) {
            i10.f170165a = 0L;
        } else {
            this.f31811b = 3;
            i10.f170165a = this.f31810a.get(0).f31814b;
        }
    }

    private void e(InterfaceC18078q interfaceC18078q, List<y.a> list) throws IOException {
        long position = interfaceC18078q.getPosition();
        int length = (int) ((interfaceC18078q.getLength() - interfaceC18078q.getPosition()) - this.f31812c);
        D d10 = new D(length);
        interfaceC18078q.readFully(d10.e(), 0, length);
        for (int i10 = 0; i10 < this.f31810a.size(); i10++) {
            a aVar = this.f31810a.get(i10);
            d10.W((int) (aVar.f31814b - position));
            d10.X(4);
            int iU = d10.u();
            int iB = b(d10.E(iU));
            int i11 = aVar.f31815c - (iU + 8);
            if (iB != 2192) {
                if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                    throw new IllegalStateException();
                }
            } else {
                list.add(f(d10, i11));
            }
        }
    }
}

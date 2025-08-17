package R3;

import M3.c;
import a3.y;
import androidx.media3.common.ParserException;
import d3.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import x3.I;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class q {

    /* renamed from: d, reason: collision with root package name */
    private static final Be.t f31806d = Be.t.e(':');

    /* renamed from: e, reason: collision with root package name */
    private static final Be.t f31807e = Be.t.e('*');

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f31808a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f31809b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f31810c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31811a;

        /* renamed from: b, reason: collision with root package name */
        public final long f31812b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31813c;

        public a(int i10, long j10, int i11) {
            this.f31811a = i10;
            this.f31812b = j10;
            this.f31813c = i11;
        }
    }

    private void a(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        D d10 = new D(8);
        interfaceC18012q.readFully(d10.e(), 0, 8);
        this.f31810c = d10.u() + 8;
        if (d10.q() != 1397048916) {
            i10.f169077a = 0L;
        } else {
            i10.f169077a = interfaceC18012q.getPosition() - (this.f31810c - 12);
            this.f31809b = 2;
        }
    }

    private static M3.c f(D d10, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listH = f31807e.h(d10.E(i10));
        for (int i11 = 0; i11 < listH.size(); i11++) {
            List<String> listH2 = f31806d.h(listH.get(i11));
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

    public int c(InterfaceC18012q interfaceC18012q, I i10, List<y.a> list) throws IOException {
        int i11 = this.f31809b;
        long j10 = 0;
        if (i11 == 0) {
            long length = interfaceC18012q.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f169077a = j10;
            this.f31809b = 1;
        } else if (i11 == 1) {
            a(interfaceC18012q, i10);
        } else if (i11 == 2) {
            d(interfaceC18012q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC18012q, list);
            i10.f169077a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f31808a.clear();
        this.f31809b = 0;
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

    private void d(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        long length = interfaceC18012q.getLength();
        int i11 = this.f31810c - 20;
        D d10 = new D(i11);
        interfaceC18012q.readFully(d10.e(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            d10.X(2);
            short sW = d10.w();
            if (sW != 2192 && sW != 2816 && sW != 2817 && sW != 2819 && sW != 2820) {
                d10.X(8);
            } else {
                this.f31808a.add(new a(sW, (length - this.f31810c) - d10.u(), d10.u()));
            }
        }
        if (this.f31808a.isEmpty()) {
            i10.f169077a = 0L;
        } else {
            this.f31809b = 3;
            i10.f169077a = this.f31808a.get(0).f31812b;
        }
    }

    private void e(InterfaceC18012q interfaceC18012q, List<y.a> list) throws IOException {
        long position = interfaceC18012q.getPosition();
        int length = (int) ((interfaceC18012q.getLength() - interfaceC18012q.getPosition()) - this.f31810c);
        D d10 = new D(length);
        interfaceC18012q.readFully(d10.e(), 0, length);
        for (int i10 = 0; i10 < this.f31808a.size(); i10++) {
            a aVar = this.f31808a.get(i10);
            d10.W((int) (aVar.f31812b - position));
            d10.X(4);
            int iU = d10.u();
            int iB = b(d10.E(iU));
            int i11 = aVar.f31813c - (iU + 8);
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

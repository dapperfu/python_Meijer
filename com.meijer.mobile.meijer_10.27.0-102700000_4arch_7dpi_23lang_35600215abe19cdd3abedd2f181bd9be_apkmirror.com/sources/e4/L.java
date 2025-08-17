package e4;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.q2;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public interface L {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f128269a;

        /* renamed from: b, reason: collision with root package name */
        public final String f128270b;

        /* renamed from: c, reason: collision with root package name */
        public final int f128271c;

        /* renamed from: d, reason: collision with root package name */
        public final List<a> f128272d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f128273e;

        public int a() {
            int i10 = this.f128271c;
            return i10 != 2 ? i10 != 3 ? 0 : 512 : RecyclerView.m.FLAG_MOVED;
        }

        public b(int i10, String str, int i11, List<a> list, byte[] bArr) {
            List<a> listUnmodifiableList;
            this.f128269a = i10;
            this.f128270b = str;
            this.f128271c = i11;
            if (list == null) {
                listUnmodifiableList = Collections.EMPTY_LIST;
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.f128272d = listUnmodifiableList;
            this.f128273e = bArr;
        }
    }

    public interface c {
        L a(int i10, b bVar);

        SparseArray<L> b();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f128274a;

        /* renamed from: b, reason: collision with root package name */
        private final int f128275b;

        /* renamed from: c, reason: collision with root package name */
        private final int f128276c;

        /* renamed from: d, reason: collision with root package name */
        private int f128277d;

        /* renamed from: e, reason: collision with root package name */
        private String f128278e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + q2.f92724c;
            } else {
                str = "";
            }
            this.f128274a = str;
            this.f128275b = i11;
            this.f128276c = i12;
            this.f128277d = Integer.MIN_VALUE;
            this.f128278e = "";
        }

        private void d() {
            if (this.f128277d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f128277d;
            this.f128277d = i10 == Integer.MIN_VALUE ? this.f128275b : i10 + this.f128276c;
            this.f128278e = this.f128274a + this.f128277d;
        }

        public String b() {
            d();
            return this.f128278e;
        }

        public int c() {
            d();
            return this.f128277d;
        }
    }

    void a(d3.D d10, int i10) throws ParserException;

    void b(d3.J j10, x3.r rVar, d dVar);

    void c();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f128266a;

        /* renamed from: b, reason: collision with root package name */
        public final int f128267b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f128268c;

        public a(String str, int i10, byte[] bArr) {
            this.f128266a = str;
            this.f128267b = i10;
            this.f128268c = bArr;
        }
    }
}

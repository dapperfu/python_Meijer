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
        public final int f129605a;

        /* renamed from: b, reason: collision with root package name */
        public final String f129606b;

        /* renamed from: c, reason: collision with root package name */
        public final int f129607c;

        /* renamed from: d, reason: collision with root package name */
        public final List<a> f129608d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f129609e;

        public int a() {
            int i10 = this.f129607c;
            return i10 != 2 ? i10 != 3 ? 0 : 512 : RecyclerView.m.FLAG_MOVED;
        }

        public b(int i10, String str, int i11, List<a> list, byte[] bArr) {
            List<a> listUnmodifiableList;
            this.f129605a = i10;
            this.f129606b = str;
            this.f129607c = i11;
            if (list == null) {
                listUnmodifiableList = Collections.EMPTY_LIST;
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.f129608d = listUnmodifiableList;
            this.f129609e = bArr;
        }
    }

    public interface c {
        L a(int i10, b bVar);

        SparseArray<L> b();
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f129610a;

        /* renamed from: b, reason: collision with root package name */
        private final int f129611b;

        /* renamed from: c, reason: collision with root package name */
        private final int f129612c;

        /* renamed from: d, reason: collision with root package name */
        private int f129613d;

        /* renamed from: e, reason: collision with root package name */
        private String f129614e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + q2.f93563c;
            } else {
                str = "";
            }
            this.f129610a = str;
            this.f129611b = i11;
            this.f129612c = i12;
            this.f129613d = Integer.MIN_VALUE;
            this.f129614e = "";
        }

        private void d() {
            if (this.f129613d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f129613d;
            this.f129613d = i10 == Integer.MIN_VALUE ? this.f129611b : i10 + this.f129612c;
            this.f129614e = this.f129610a + this.f129613d;
        }

        public String b() {
            d();
            return this.f129614e;
        }

        public int c() {
            d();
            return this.f129613d;
        }
    }

    void a(d3.D d10, int i10) throws ParserException;

    void b(d3.J j10, x3.r rVar, d dVar);

    void c();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f129602a;

        /* renamed from: b, reason: collision with root package name */
        public final int f129603b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f129604c;

        public a(String str, int i10, byte[] bArr) {
            this.f129602a = str;
            this.f129603b = i10;
            this.f129604c = bArr;
        }
    }
}

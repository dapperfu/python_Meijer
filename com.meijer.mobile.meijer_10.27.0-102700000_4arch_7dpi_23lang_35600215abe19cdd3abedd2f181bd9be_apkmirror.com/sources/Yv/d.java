package Yv;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import com.medallia.digital.mobilesdk.q2;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15328e;
import kw.C15331h;
import kw.InterfaceC15330g;
import kw.J;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000e\u0010\b¨\u0006\u0015"}, d2 = {"LYv/d;", "", "<init>", "()V", "", "Lkw/h;", "", "d", "()Ljava/util/Map;", "name", "a", "(Lkw/h;)Lkw/h;", "", "LYv/c;", "b", "[LYv/c;", "c", "()[LYv/c;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f41841a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final c[] STATIC_HEADER_TABLE;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<C15331h, Integer> NAME_TO_FIRST_INDEX;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010\u000bJ\u001d\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u0010\u0003\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u00106R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00109\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/¨\u0006;"}, d2 = {"LYv/d$a;", "", "Lkw/J;", "source", "", "headerTableSizeSetting", "maxDynamicTableByteCount", "<init>", "(Lkw/J;II)V", "", "a", "()V", "b", "bytesToRecover", "d", "(I)I", "index", "l", "(I)V", "c", "p", "q", "nameIndex", "n", "o", "Lkw/h;", "f", "(I)Lkw/h;", "", "h", "(I)Z", "LYv/c;", "entry", "g", "(ILYv/c;)V", "i", "()I", "", "e", "()Ljava/util/List;", "k", "firstByte", "prefixMask", "m", "(II)I", "j", "()Lkw/h;", "I", "", "Ljava/util/List;", "headerList", "Lkw/g;", "Lkw/g;", "", "[LYv/c;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int headerTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int maxDynamicTableByteCount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> headerList;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15330g source;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public c[] dynamicTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int headerCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int dynamicTableByteCount;

        @JvmOverloads
        public a(J source, int i10, int i11) {
            Intrinsics.j(source, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = kw.w.d(source);
            this.dynamicTable = new c[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final int d(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    c cVar = this.dynamicTable[length];
                    Intrinsics.g(cVar);
                    int i12 = cVar.hpackSize;
                    bytesToRecover -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                c[] cVarArr = this.dynamicTable;
                System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        public final int m(int firstByte, int prefixMask) throws IOException {
            int i10 = firstByte & prefixMask;
            if (i10 < prefixMask) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) == 0) {
                    return prefixMask + (i12 << i11);
                }
                prefixMask += (i12 & l3.f92485d) << i11;
                i11 += 7;
            }
        }

        private final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            ArraysKt.F(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int c(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final void g(int index, c entry) {
            this.headerList.add(entry);
            int i10 = entry.hpackSize;
            if (index != -1) {
                c cVar = this.dynamicTable[c(index)];
                Intrinsics.g(cVar);
                i10 -= cVar.hpackSize;
            }
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            int iD = d((this.dynamicTableByteCount + i10) - i11);
            if (index == -1) {
                int i12 = this.headerCount + 1;
                c[] cVarArr = this.dynamicTable;
                if (i12 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = cVarArr2;
                }
                int i13 = this.nextHeaderIndex;
                this.nextHeaderIndex = i13 - 1;
                this.dynamicTable[i13] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + c(index) + iD] = entry;
            }
            this.dynamicTableByteCount += i10;
        }

        private final boolean h(int index) {
            return index >= 0 && index <= d.f41841a.c().length - 1;
        }

        private final int i() throws IOException {
            return Rv.h.b(this.source.readByte(), l3.f92484c);
        }

        private final void o() throws IOException {
            g(-1, new c(d.f41841a.a(j()), j()));
        }

        private final void q() throws IOException {
            this.headerList.add(new c(d.f41841a.a(j()), j()));
        }

        public final List<c> e() {
            List<c> listJ1 = CollectionsKt.j1(this.headerList);
            this.headerList.clear();
            return listJ1;
        }

        public final void k() throws IOException {
            while (!this.source.j2()) {
                int iB = Rv.h.b(this.source.readByte(), l3.f92484c);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    l(m(iB, l3.f92485d) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.maxDynamicTableByteCount = iM;
                    if (iM < 0 || iM > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        private final C15331h f(int index) throws IOException {
            if (h(index)) {
                return d.f41841a.c()[index].name;
            }
            int iC = c(index - d.f41841a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.dynamicTable;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    Intrinsics.g(cVar);
                    return cVar.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void l(int index) throws IOException {
            if (h(index)) {
                this.headerList.add(d.f41841a.c()[index]);
                return;
            }
            int iC = c(index - d.f41841a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.dynamicTable;
                if (iC < cVarArr.length) {
                    List<c> list = this.headerList;
                    c cVar = cVarArr[iC];
                    Intrinsics.g(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void n(int nameIndex) throws IOException {
            g(-1, new c(f(nameIndex), j()));
        }

        private final void p(int index) throws IOException {
            this.headerList.add(new c(f(index), j()));
        }

        public final C15331h j() throws IOException {
            boolean z10;
            int i10 = i();
            if ((i10 & 128) == 128) {
                z10 = true;
            } else {
                z10 = false;
            }
            long jM = m(i10, l3.f92485d);
            if (z10) {
                C15328e c15328e = new C15328e();
                w.f42001a.b(this.source, jM, c15328e);
                return c15328e.Q2();
            }
            return this.source.O1(jM);
        }

        public /* synthetic */ a(J j10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u001b\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010/\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00101\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010$¨\u00062"}, d2 = {"LYv/d$b;", "", "", "headerTableSizeSetting", "", "useCompression", "Lkw/e;", "out", "<init>", "(IZLkw/e;)V", "", "b", "()V", "bytesToRecover", "c", "(I)I", "LYv/c;", "entry", "d", "(LYv/c;)V", "a", "", "headerBlock", "g", "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "Lkw/h;", "data", "f", "(Lkw/h;)V", "e", "(I)V", "I", "Z", "Lkw/e;", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[LYv/c;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int headerTableSizeSetting;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean useCompression;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final C15328e out;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int smallestHeaderTableSizeSetting;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean emitDynamicTableSizeUpdate;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int maxDynamicTableByteCount;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public c[] dynamicTable;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int nextHeaderIndex;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int headerCount;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int dynamicTableByteCount;

        @JvmOverloads
        public b(int i10, boolean z10, C15328e out) {
            Intrinsics.j(out, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = out;
            this.smallestHeaderTableSizeSetting = a.e.API_PRIORITY_OTHER;
            this.maxDynamicTableByteCount = i10;
            this.dynamicTable = new c[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        private final int c(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    c cVar = this.dynamicTable[length];
                    Intrinsics.g(cVar);
                    bytesToRecover -= cVar.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    c cVar2 = this.dynamicTable[length];
                    Intrinsics.g(cVar2);
                    this.dynamicTableByteCount = i12 - cVar2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                c[] cVarArr = this.dynamicTable;
                System.arraycopy(cVarArr, i10 + 1, cVarArr, i10 + 1 + i11, this.headerCount);
                c[] cVarArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final void a() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            ArraysKt.F(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final void d(c entry) {
            int i10 = entry.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            c[] cVarArr = this.dynamicTable;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = cVarArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void e(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            a();
        }

        public final void f(C15331h data) throws IOException {
            Intrinsics.j(data, "data");
            if (this.useCompression) {
                w wVar = w.f42001a;
                if (wVar.d(data) < data.V()) {
                    C15328e c15328e = new C15328e();
                    wVar.c(data, c15328e);
                    C15331h c15331hQ2 = c15328e.Q2();
                    h(c15331hQ2.V(), l3.f92485d, 128);
                    this.out.Z2(c15331hQ2);
                    return;
                }
            }
            h(data.V(), l3.f92485d, 0);
            this.out.Z2(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(java.util.List<Yv.c> r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Yv.d.b.g(java.util.List):void");
        }

        public final void h(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i10 = value - prefixMask;
            while (i10 >= 128) {
                this.out.writeByte(128 | (i10 & l3.f92485d));
                i10 >>>= 7;
            }
            this.out.writeByte(i10);
        }

        public /* synthetic */ b(int i10, boolean z10, C15328e c15328e, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT : i10, (i11 & 2) != 0 ? true : z10, c15328e);
        }
    }

    static {
        d dVar = new d();
        f41841a = dVar;
        c cVar = new c(c.f41837j, "");
        C15331h c15331h = c.f41834g;
        c cVar2 = new c(c15331h, "GET");
        c cVar3 = new c(c15331h, "POST");
        C15331h c15331h2 = c.f41835h;
        c cVar4 = new c(c15331h2, q2.f92724c);
        c cVar5 = new c(c15331h2, "/index.html");
        C15331h c15331h3 = c.f41836i;
        c cVar6 = new c(c15331h3, "http");
        c cVar7 = new c(c15331h3, BuildConfig.SERVICE_SCHEME);
        C15331h c15331h4 = c.f41833f;
        STATIC_HEADER_TABLE = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(c15331h4, "200"), new c(c15331h4, "204"), new c(c15331h4, "206"), new c(c15331h4, "304"), new c(c15331h4, "400"), new c(c15331h4, "404"), new c(c15331h4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = dVar.d();
    }

    private final Map<C15331h, Integer> d() {
        c[] cVarArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length, 1.0f);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(cVarArr2[i10].name)) {
                linkedHashMap.put(cVarArr2[i10].name, Integer.valueOf(i10));
            }
        }
        Map<C15331h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.i(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final C15331h a(C15331h name) throws IOException {
        Intrinsics.j(name, "name");
        int iV = name.V();
        for (int i10 = 0; i10 < iV; i10++) {
            byte bU = name.u(i10);
            if (65 <= bU && bU < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.c0());
            }
        }
        return name;
    }

    public final Map<C15331h, Integer> b() {
        return NAME_TO_FIRST_INDEX;
    }

    public final c[] c() {
        return STATIC_HEADER_TABLE;
    }

    private d() {
    }
}

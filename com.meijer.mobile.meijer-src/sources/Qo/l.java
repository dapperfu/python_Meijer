package Qo;

import Co.ProductFullDetails;
import Po.Cursor;
import Qo.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 +2\u00020\u0001:\u000b\u001b+()\u00190!\u0017\u001f\u001d&Bw\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b!\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001b\u00102R\u0011\u00103\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0011\u00105\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0014\u00107\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u00106R\u0014\u00108\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u00106\u0082\u0001\t:;<=>?@AB¨\u0006C"}, d2 = {"LQo/l;", "Landroid/os/Parcelable;", "", "page", "perPage", "", "LCo/h;", "products", "", "continuationToken", "totalCount", "totalPages", "", "isPending", "nextPage", "LPo/a;", "cursor", "", "error", "<init>", "(IILjava/util/List;Ljava/lang/String;Ljava/lang/Integer;IZLjava/lang/Integer;LPo/a;Ljava/lang/Throwable;)V", "o", "(Z)LQo/l;", "a", "I", "e", "()I", "b", "getPerPage", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "d", "Ljava/lang/String;", "getContinuationToken", "()Ljava/lang/String;", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "i", "g", "Z", "k", "()Z", "LPo/a;", "getCursor", "()LPo/a;", "j", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "isError", "n", "isReload", "()LQo/l;", "reload", "empty", "next", "LQo/l$a;", "LQo/l$c;", "LQo/l$d;", "LQo/l$e;", "LQo/l$f;", "LQo/l$g;", "LQo/l$h;", "LQo/l$i;", "LQo/l$j;", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class l implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int page;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int perPage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<ProductFullDetails> products;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String continuationToken;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Integer totalCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int totalPages;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isPending;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Integer nextPage;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Cursor cursor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Throwable error;

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u0012\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%JW\u0010&\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142 \u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0005¢\u0006\u0004\b.\u0010/Jâ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b5\u0010/J\u001a\u00108\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010!\u001a\u0004\b?\u0010/R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010!\u001a\u0004\bA\u0010/R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010!\u001a\u0004\bK\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010R\u001a\u0004\bS\u0010TR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bV\u0010ER \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bX\u0010ER<\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b\u0018\u00010\u0016j\u0004\u0018\u0001`\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010C\u001a\u0004\bd\u0010ER\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR#\u0010n\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bS\u0010i\u0012\u0004\bl\u0010m\u001a\u0004\bj\u0010kR!\u0010q\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bo\u0010i\u0012\u0004\bp\u0010m\u001a\u0004\bo\u0010kR!\u0010t\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bj\u0010i\u0012\u0004\bs\u0010m\u001a\u0004\br\u0010k¨\u0006u"}, d2 = {"LQo/l$a;", "LQo/l;", "LQo/l$k;", "LCo/b;", "collection", "", "page", "perPage", "", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "LPo/a;", "cursor", "LQo/a;", "facets", "LQo/g;", "sorts", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "selectedSort", "LQo/e;", "groups", "", "error", "<init>", "(LCo/b;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLPo/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LQo/g;Ljava/util/List;Ljava/lang/Throwable;)V", "I", "(Z)LQo/l$a;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$a;", "L", "(Ljava/util/List;Ljava/util/List;LQo/g;Ljava/util/Map;)LQo/l$a;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(LCo/b;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLPo/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LQo/g;Ljava/util/List;Ljava/lang/Throwable;)LQo/l$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "LCo/b;", "y", "()LCo/b;", "m", "e", "n", "E", "o", "Ljava/util/List;", "f", "()Ljava/util/List;", "p", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "q", "i", "r", "d", "s", "Z", "k", "()Z", "LPo/a;", "A", "()LPo/a;", "u", "c1", "v", "u3", "w", "Ljava/util/Map;", "F3", "()Ljava/util/Map;", "n0", "(Ljava/util/Map;)V", "LQo/g;", "N1", "()LQo/g;", "q1", "(LQo/g;)V", "getGroups", "z", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lkotlin/Lazy;", "C", "()LQo/l$a;", "getNext$annotations", "()V", "next", "B", "getEmpty$annotations", "empty", "F", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$a, reason: from toString */
    public static final /* data */ class BrowseCollection extends l implements k {
        public static final Parcelable.Creator<BrowseCollection> CREATOR = new C0725a();

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Co.Department collection;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Cursor cursor;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterFacet> facets;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterSortOption> sorts;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private Map<FilterFacet, List<FilterFacetOption>> selectedFacets;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private FilterSortOption selectedSort;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterGroup> groups;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$a$a, reason: collision with other inner class name */
        public static final class C0725a implements Parcelable.Creator<BrowseCollection> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BrowseCollection createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.j(parcel, "parcel");
                Co.Department department = (Co.Department) parcel.readParcelable(BrowseCollection.class.getClassLoader());
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(BrowseCollection.class.getClassLoader()));
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int i14 = parcel.readInt();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z10 = parcel.readInt() != 0;
                Cursor cursorCreateFromParcel = parcel.readInt() == 0 ? null : Cursor.CREATOR.createFromParcel(parcel);
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(FilterFacet.CREATOR.createFromParcel(parcel));
                }
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(FilterSortOption.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i19 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i19);
                    int i20 = 0;
                    while (i20 != i19) {
                        FilterFacet filterFacetCreateFromParcel = FilterFacet.CREATOR.createFromParcel(parcel);
                        int i21 = i19;
                        int i22 = parcel.readInt();
                        Co.Department department2 = department;
                        ArrayList arrayList4 = new ArrayList(i22);
                        int i23 = i10;
                        int i24 = 0;
                        while (i24 != i22) {
                            arrayList4.add(FilterFacetOption.CREATOR.createFromParcel(parcel));
                            i24++;
                            i22 = i22;
                        }
                        linkedHashMap2.put(filterFacetCreateFromParcel, arrayList4);
                        i20++;
                        i19 = i21;
                        department = department2;
                        i10 = i23;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                Co.Department department3 = department;
                int i25 = i10;
                FilterSortOption filterSortOptionCreateFromParcel = parcel.readInt() == 0 ? null : FilterSortOption.CREATOR.createFromParcel(parcel);
                int i26 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i26);
                for (int i27 = 0; i27 != i26; i27++) {
                    arrayList5.add(FilterGroup.CREATOR.createFromParcel(parcel));
                }
                return new BrowseCollection(department3, i25, i11, arrayList, numValueOf, i14, numValueOf2, z10, cursorCreateFromParcel, arrayList2, arrayList3, linkedHashMap, filterSortOptionCreateFromParcel, arrayList5, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BrowseCollection[] newArray(int i10) {
                return new BrowseCollection[i10];
            }
        }

        public /* synthetic */ BrowseCollection(Co.Department department, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Cursor cursor, List list2, List list3, Map map, FilterSortOption filterSortOption, List list4, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(department, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 10 : i11, (i13 & 8) != 0 ? CollectionsKt.m() : list, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? null : num2, (i13 & 128) == 0 ? z10 : true, (i13 & 256) != 0 ? null : cursor, (i13 & 512) != 0 ? CollectionsKt.m() : list2, (i13 & 1024) != 0 ? CollectionsKt.m() : list3, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? null : map, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : filterSortOption, (i13 & 8192) != 0 ? CollectionsKt.m() : list4, (i13 & 16384) != 0 ? null : th2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BrowseCollection)) {
                return false;
            }
            BrowseCollection browseCollection = (BrowseCollection) other;
            return Intrinsics.e(this.collection, browseCollection.collection) && this.page == browseCollection.page && this.perPage == browseCollection.perPage && Intrinsics.e(this.products, browseCollection.products) && Intrinsics.e(this.totalCount, browseCollection.totalCount) && this.totalPages == browseCollection.totalPages && Intrinsics.e(this.nextPage, browseCollection.nextPage) && this.isPending == browseCollection.isPending && Intrinsics.e(this.cursor, browseCollection.cursor) && Intrinsics.e(this.facets, browseCollection.facets) && Intrinsics.e(this.sorts, browseCollection.sorts) && Intrinsics.e(this.selectedFacets, browseCollection.selectedFacets) && Intrinsics.e(this.selectedSort, browseCollection.selectedSort) && Intrinsics.e(this.groups, browseCollection.groups) && Intrinsics.e(this.error, browseCollection.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeParcelable(this.collection, flags);
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            Cursor cursor = this.cursor;
            if (cursor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cursor.writeToParcel(dest, flags);
            }
            List<FilterFacet> list2 = this.facets;
            dest.writeInt(list2.size());
            Iterator<FilterFacet> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            List<FilterSortOption> list3 = this.sorts;
            dest.writeInt(list3.size());
            Iterator<FilterSortOption> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            Map<FilterFacet, List<FilterFacetOption>> map = this.selectedFacets;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : map.entrySet()) {
                    entry.getKey().writeToParcel(dest, flags);
                    List<FilterFacetOption> value = entry.getValue();
                    dest.writeInt(value.size());
                    Iterator<FilterFacetOption> it4 = value.iterator();
                    while (it4.hasNext()) {
                        it4.next().writeToParcel(dest, flags);
                    }
                }
            }
            FilterSortOption filterSortOption = this.selectedSort;
            if (filterSortOption == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                filterSortOption.writeToParcel(dest, flags);
            }
            List<FilterGroup> list4 = this.groups;
            dest.writeInt(list4.size());
            Iterator<FilterGroup> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(dest, flags);
            }
            dest.writeSerializable(this.error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BrowseCollection J(BrowseCollection browseCollection) {
            Co.Department department = browseCollection.collection;
            int perPage = browseCollection.getPerPage();
            Map<FilterFacet, List<FilterFacetOption>> mapF3 = browseCollection.F3();
            FilterSortOption selectedSort = browseCollection.getSelectedSort();
            return new BrowseCollection(department, 0, perPage, null, null, 0, null, false, null, browseCollection.c1(), browseCollection.u3(), mapF3, selectedSort, null, null, 25082, null);
        }

        public static /* synthetic */ BrowseCollection v(BrowseCollection browseCollection, Co.Department department, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Cursor cursor, List list2, List list3, Map map, FilterSortOption filterSortOption, List list4, Throwable th2, int i13, Object obj) {
            return browseCollection.t((i13 & 1) != 0 ? browseCollection.collection : department, (i13 & 2) != 0 ? browseCollection.page : i10, (i13 & 4) != 0 ? browseCollection.perPage : i11, (i13 & 8) != 0 ? browseCollection.products : list, (i13 & 16) != 0 ? browseCollection.totalCount : num, (i13 & 32) != 0 ? browseCollection.totalPages : i12, (i13 & 64) != 0 ? browseCollection.nextPage : num2, (i13 & 128) != 0 ? browseCollection.isPending : z10, (i13 & 256) != 0 ? browseCollection.cursor : cursor, (i13 & 512) != 0 ? browseCollection.facets : list2, (i13 & 1024) != 0 ? browseCollection.sorts : list3, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? browseCollection.selectedFacets : map, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? browseCollection.selectedSort : filterSortOption, (i13 & 8192) != 0 ? browseCollection.groups : list4, (i13 & 16384) != 0 ? browseCollection.error : th2);
        }

        /* renamed from: A, reason: from getter */
        public Cursor getCursor() {
            return this.cursor;
        }

        @Override // Qo.l
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public BrowseCollection a() {
            return (BrowseCollection) this.empty.getValue();
        }

        @Override // Qo.l
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public BrowseCollection c() {
            return (BrowseCollection) this.next.getValue();
        }

        /* renamed from: E, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public BrowseCollection g() {
            return (BrowseCollection) this.reload.getValue();
        }

        @Override // Qo.l.k
        public Map<FilterFacet, List<FilterFacetOption>> F3() {
            return this.selectedFacets;
        }

        @Override // Qo.l
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public BrowseCollection o(boolean isPending) {
            return v(this, null, 0, 0, null, null, 0, null, isPending, null, null, null, null, null, null, null, 32639, null);
        }

        @Override // Qo.l.k
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public BrowseCollection x0(List<FilterSortOption> sorts, List<FilterFacet> facets, FilterSortOption selectedSort, Map<FilterFacet, List<FilterFacetOption>> selectedFacets) {
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(facets, "facets");
            return v(this, null, 0, 0, null, null, 0, null, false, null, facets, sorts, selectedFacets, selectedSort, null, null, 25087, null);
        }

        @Override // Qo.l.k
        /* renamed from: N1, reason: from getter */
        public FilterSortOption getSelectedSort() {
            return this.selectedSort;
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l.k
        public List<FilterFacet> c1() {
            return this.facets;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((((this.collection.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Cursor cursor = this.cursor;
            int iHashCode4 = (((((iHashCode3 + (cursor == null ? 0 : cursor.hashCode())) * 31) + this.facets.hashCode()) * 31) + this.sorts.hashCode()) * 31;
            Map<FilterFacet, List<FilterFacetOption>> map = this.selectedFacets;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            FilterSortOption filterSortOption = this.selectedSort;
            int iHashCode6 = (((iHashCode5 + (filterSortOption == null ? 0 : filterSortOption.hashCode())) * 31) + this.groups.hashCode()) * 31;
            Throwable th2 = this.error;
            return iHashCode6 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        @Override // Qo.l.k
        public void n0(Map<FilterFacet, List<FilterFacetOption>> map) {
            this.selectedFacets = map;
        }

        @Override // Qo.l.k
        public void q1(FilterSortOption filterSortOption) {
            this.selectedSort = filterSortOption;
        }

        public final BrowseCollection t(Co.Department collection, int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Cursor cursor, List<FilterFacet> facets, List<FilterSortOption> sorts, Map<FilterFacet, List<FilterFacetOption>> selectedFacets, FilterSortOption selectedSort, List<FilterGroup> groups, Throwable error) {
            Intrinsics.j(collection, "collection");
            Intrinsics.j(products, "products");
            Intrinsics.j(facets, "facets");
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(groups, "groups");
            return new BrowseCollection(collection, page, perPage, products, totalCount, totalPages, nextPage, isPending, cursor, facets, sorts, selectedFacets, selectedSort, groups, error);
        }

        public String toString() {
            return "BrowseCollection(collection=" + this.collection + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", cursor=" + this.cursor + ", facets=" + this.facets + ", sorts=" + this.sorts + ", selectedFacets=" + this.selectedFacets + ", selectedSort=" + this.selectedSort + ", groups=" + this.groups + ", error=" + this.error + ')';
        }

        @Override // Qo.l.k
        public List<FilterSortOption> u3() {
            return this.sorts;
        }

        public BrowseCollection x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, throwable, 16383, null);
        }

        /* renamed from: y, reason: from getter */
        public final Co.Department getCollection() {
            return this.collection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BrowseCollection G(BrowseCollection browseCollection) {
            Integer nextPage = browseCollection.getNextPage();
            if (nextPage != null) {
                return v(browseCollection, null, nextPage.intValue(), 0, null, null, 0, null, true, null, null, null, null, null, null, null, 32637, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BrowseCollection w(BrowseCollection browseCollection) {
            return v(browseCollection, null, 0, 0, CollectionsKt.m(), null, 0, null, false, null, null, null, null, null, null, null, 32759, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrowseCollection(Co.Department collection, int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, Cursor cursor, List<FilterFacet> facets, List<FilterSortOption> sorts, Map<FilterFacet, List<FilterFacetOption>> map, FilterSortOption filterSortOption, List<FilterGroup> groups, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(collection, "collection");
            Intrinsics.j(products, "products");
            Intrinsics.j(facets, "facets");
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(groups, "groups");
            this.collection = collection;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.cursor = cursor;
            this.facets = facets;
            this.sorts = sorts;
            this.selectedFacets = map;
            this.selectedSort = filterSortOption;
            this.groups = groups;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.BrowseCollection.G(this.f31091a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.BrowseCollection.w(this.f31092a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.BrowseCollection.J(this.f31093a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R#\u0010B\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R!\u0010F\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bC\u0010=\u0012\u0004\bE\u0010A\u001a\u0004\bD\u0010?R!\u0010I\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010=\u0012\u0004\bH\u0010A\u001a\u0004\bG\u0010?¨\u0006J"}, d2 = {"LQo/l$c;", "LQo/l;", "LPk/c;", "coupon", "", "page", "perPage", "", "LCo/h;", "products", "", "isPending", "", "error", "<init>", "(LPk/c;IILjava/util/List;ZLjava/lang/Throwable;)V", "F", "(Z)LQo/l$c;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$c;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(LPk/c;IILjava/util/List;ZLjava/lang/Throwable;)LQo/l$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "LPk/c;", "y", "()LPk/c;", "m", "I", "e", "n", "getPerPage", "o", "Ljava/util/List;", "f", "()Ljava/util/List;", "p", "Z", "k", "()Z", "q", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "r", "Lkotlin/Lazy;", "B", "()LQo/l$c;", "getNext$annotations", "()V", "next", "s", "A", "getEmpty$annotations", "empty", "C", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$c, reason: from toString */
    public static final /* data */ class Coupon extends l {
        public static final Parcelable.Creator<Coupon> CREATOR = new a();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.c coupon;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$c$a */
        public static final class a implements Parcelable.Creator<Coupon> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Coupon createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                Pk.c cVar = (Pk.c) parcel.readParcelable(Coupon.class.getClassLoader());
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Coupon.class.getClassLoader()));
                }
                return new Coupon(cVar, i10, i11, arrayList, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Coupon[] newArray(int i10) {
                return new Coupon[i10];
            }
        }

        public /* synthetic */ Coupon(Pk.c cVar, int i10, int i11, List list, boolean z10, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 10 : i11, (i12 & 8) != 0 ? CollectionsKt.m() : list, (i12 & 16) != 0 ? true : z10, (i12 & 32) != 0 ? null : th2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coupon)) {
                return false;
            }
            Coupon coupon = (Coupon) other;
            return Intrinsics.e(this.coupon, coupon.coupon) && this.page == coupon.page && this.perPage == coupon.perPage && Intrinsics.e(this.products, coupon.products) && this.isPending == coupon.isPending && Intrinsics.e(this.error, coupon.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeParcelable(this.coupon, flags);
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.isPending ? 1 : 0);
            dest.writeSerializable(this.error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Coupon G(Coupon coupon) {
            return new Coupon(coupon.coupon, 0, 0, null, false, null, 62, null);
        }

        public static /* synthetic */ Coupon v(Coupon coupon, Pk.c cVar, int i10, int i11, List list, boolean z10, Throwable th2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                cVar = coupon.coupon;
            }
            if ((i12 & 2) != 0) {
                i10 = coupon.page;
            }
            if ((i12 & 4) != 0) {
                i11 = coupon.perPage;
            }
            if ((i12 & 8) != 0) {
                list = coupon.products;
            }
            if ((i12 & 16) != 0) {
                z10 = coupon.isPending;
            }
            if ((i12 & 32) != 0) {
                th2 = coupon.error;
            }
            boolean z11 = z10;
            Throwable th3 = th2;
            return coupon.t(cVar, i10, i11, list, z11, th3);
        }

        @Override // Qo.l
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Coupon a() {
            return (Coupon) this.empty.getValue();
        }

        @Override // Qo.l
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Coupon c() {
            return (Coupon) this.next.getValue();
        }

        @Override // Qo.l
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Coupon g() {
            return (Coupon) this.reload.getValue();
        }

        @Override // Qo.l
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public Coupon o(boolean isPending) {
            return v(this, null, 0, 0, null, isPending, null, 47, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.coupon.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Throwable th2 = this.error;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        public final Coupon t(Pk.c coupon, int page, int perPage, List<ProductFullDetails> products, boolean isPending, Throwable error) {
            Intrinsics.j(coupon, "coupon");
            Intrinsics.j(products, "products");
            return new Coupon(coupon, page, perPage, products, isPending, error);
        }

        public String toString() {
            return "Coupon(coupon=" + this.coupon + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", isPending=" + this.isPending + ", error=" + this.error + ')';
        }

        public Coupon x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, 0, 0, null, false, throwable, 31, null);
        }

        /* renamed from: y, reason: from getter */
        public final Pk.c getCoupon() {
            return this.coupon;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Coupon(Pk.c coupon, int i10, int i11, List<ProductFullDetails> products, boolean z10, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(coupon, "coupon");
            Intrinsics.j(products, "products");
            this.coupon = coupon;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.isPending = z10;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Coupon.E(this.f31233a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Coupon.w(this.f31234a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Coupon.G(this.f31235a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Coupon E(Coupon coupon) {
            Integer nextPage = coupon.getNextPage();
            if (nextPage != null) {
                return v(coupon, null, nextPage.intValue(), 0, null, true, null, 45, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Coupon w(Coupon coupon) {
            return v(coupon, null, 0, 0, CollectionsKt.m(), false, null, 55, null);
        }
    }

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b\u0012\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%JW\u0010&\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001aH\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0005¢\u0006\u0004\b.\u0010/Jâ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b5\u0010/J\u001a\u00108\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010/R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u0010/R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010JR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010S\u001a\u0004\bT\u0010UR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010D\u001a\u0004\bW\u0010FR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010D\u001a\u0004\bY\u0010FR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010D\u001a\u0004\b[\u0010FR<\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR#\u0010o\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b<\u0010j\u0012\u0004\bm\u0010n\u001a\u0004\bk\u0010lR!\u0010r\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bp\u0010j\u0012\u0004\bq\u0010n\u001a\u0004\bp\u0010lR!\u0010u\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b[\u0010j\u0012\u0004\bt\u0010n\u001a\u0004\bs\u0010l¨\u0006v"}, d2 = {"LQo/l$d;", "LQo/l;", "LQo/l$k;", "LCo/b;", "department", "", "page", "perPage", "", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "LPo/a;", "cursor", "LQo/a;", "facets", "LQo/g;", "sorts", "LQo/e;", "groups", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "selectedSort", "", "error", "<init>", "(LCo/b;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLPo/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LQo/g;Ljava/lang/Throwable;)V", "J", "(Z)LQo/l$d;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$d;", "M", "(Ljava/util/List;Ljava/util/List;LQo/g;Ljava/util/Map;)LQo/l$d;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(LCo/b;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLPo/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;LQo/g;Ljava/lang/Throwable;)LQo/l$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "LCo/b;", "A", "()LCo/b;", "m", "I", "e", "n", "F", "o", "Ljava/util/List;", "f", "()Ljava/util/List;", "p", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "q", "i", "r", "d", "s", "Z", "k", "()Z", "LPo/a;", "y", "()LPo/a;", "u", "c1", "v", "u3", "w", "C", "Ljava/util/Map;", "F3", "()Ljava/util/Map;", "n0", "(Ljava/util/Map;)V", "LQo/g;", "N1", "()LQo/g;", "q1", "(LQo/g;)V", "z", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lkotlin/Lazy;", "E", "()LQo/l$d;", "getNext$annotations", "()V", "next", "B", "getEmpty$annotations", "empty", "G", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$d, reason: from toString */
    public static final /* data */ class Department extends l implements k {
        public static final Parcelable.Creator<Department> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Co.Department department;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Cursor cursor;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterFacet> facets;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterSortOption> sorts;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterGroup> groups;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private Map<FilterFacet, List<FilterFacetOption>> selectedFacets;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private FilterSortOption selectedSort;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$d$a */
        public static final class a implements Parcelable.Creator<Department> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Department createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.j(parcel, "parcel");
                Co.Department department = (Co.Department) parcel.readParcelable(Department.class.getClassLoader());
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Department.class.getClassLoader()));
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int i14 = parcel.readInt();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z10 = parcel.readInt() != 0;
                Cursor cursorCreateFromParcel = parcel.readInt() == 0 ? null : Cursor.CREATOR.createFromParcel(parcel);
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(FilterFacet.CREATOR.createFromParcel(parcel));
                }
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(FilterSortOption.CREATOR.createFromParcel(parcel));
                }
                int i19 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i19);
                for (int i20 = 0; i20 != i19; i20++) {
                    arrayList4.add(FilterGroup.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i21 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i21);
                    int i22 = 0;
                    while (i22 != i21) {
                        int i23 = i21;
                        FilterFacet filterFacetCreateFromParcel = FilterFacet.CREATOR.createFromParcel(parcel);
                        int i24 = i22;
                        int i25 = parcel.readInt();
                        Co.Department department2 = department;
                        ArrayList arrayList5 = new ArrayList(i25);
                        int i26 = i10;
                        int i27 = 0;
                        while (i27 != i25) {
                            arrayList5.add(FilterFacetOption.CREATOR.createFromParcel(parcel));
                            i27++;
                            i25 = i25;
                        }
                        linkedHashMap.put(filterFacetCreateFromParcel, arrayList5);
                        i22 = i24 + 1;
                        i21 = i23;
                        department = department2;
                        i10 = i26;
                    }
                }
                return new Department(department, i10, i11, arrayList, numValueOf, i14, numValueOf2, z10, cursorCreateFromParcel, arrayList2, arrayList3, arrayList4, linkedHashMap, parcel.readInt() == 0 ? null : FilterSortOption.CREATOR.createFromParcel(parcel), (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Department[] newArray(int i10) {
                return new Department[i10];
            }
        }

        public /* synthetic */ Department(Co.Department department, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Cursor cursor, List list2, List list3, List list4, Map map, FilterSortOption filterSortOption, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(department, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 10 : i11, (i13 & 8) != 0 ? CollectionsKt.m() : list, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? null : num2, (i13 & 128) == 0 ? z10 : true, (i13 & 256) != 0 ? null : cursor, (i13 & 512) != 0 ? CollectionsKt.m() : list2, (i13 & 1024) != 0 ? CollectionsKt.m() : list3, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? CollectionsKt.m() : list4, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : map, (i13 & 8192) != 0 ? null : filterSortOption, (i13 & 16384) != 0 ? null : th2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Department)) {
                return false;
            }
            Department department = (Department) other;
            return Intrinsics.e(this.department, department.department) && this.page == department.page && this.perPage == department.perPage && Intrinsics.e(this.products, department.products) && Intrinsics.e(this.totalCount, department.totalCount) && this.totalPages == department.totalPages && Intrinsics.e(this.nextPage, department.nextPage) && this.isPending == department.isPending && Intrinsics.e(this.cursor, department.cursor) && Intrinsics.e(this.facets, department.facets) && Intrinsics.e(this.sorts, department.sorts) && Intrinsics.e(this.groups, department.groups) && Intrinsics.e(this.selectedFacets, department.selectedFacets) && Intrinsics.e(this.selectedSort, department.selectedSort) && Intrinsics.e(this.error, department.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeParcelable(this.department, flags);
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            Cursor cursor = this.cursor;
            if (cursor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cursor.writeToParcel(dest, flags);
            }
            List<FilterFacet> list2 = this.facets;
            dest.writeInt(list2.size());
            Iterator<FilterFacet> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            List<FilterSortOption> list3 = this.sorts;
            dest.writeInt(list3.size());
            Iterator<FilterSortOption> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            List<FilterGroup> list4 = this.groups;
            dest.writeInt(list4.size());
            Iterator<FilterGroup> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            Map<FilterFacet, List<FilterFacetOption>> map = this.selectedFacets;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : map.entrySet()) {
                    entry.getKey().writeToParcel(dest, flags);
                    List<FilterFacetOption> value = entry.getValue();
                    dest.writeInt(value.size());
                    Iterator<FilterFacetOption> it5 = value.iterator();
                    while (it5.hasNext()) {
                        it5.next().writeToParcel(dest, flags);
                    }
                }
            }
            FilterSortOption filterSortOption = this.selectedSort;
            if (filterSortOption == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                filterSortOption.writeToParcel(dest, flags);
            }
            dest.writeSerializable(this.error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Department L(Department department) {
            Co.Department department2 = department.department;
            int perPage = department.getPerPage();
            Map<FilterFacet, List<FilterFacetOption>> mapF3 = department.F3();
            FilterSortOption selectedSort = department.getSelectedSort();
            return new Department(department2, 0, perPage, null, null, 0, null, false, null, department.c1(), department.u3(), department.C(), mapF3, selectedSort, null, 16890, null);
        }

        public static /* synthetic */ Department v(Department department, Co.Department department2, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Cursor cursor, List list2, List list3, List list4, Map map, FilterSortOption filterSortOption, Throwable th2, int i13, Object obj) {
            return department.t((i13 & 1) != 0 ? department.department : department2, (i13 & 2) != 0 ? department.page : i10, (i13 & 4) != 0 ? department.perPage : i11, (i13 & 8) != 0 ? department.products : list, (i13 & 16) != 0 ? department.totalCount : num, (i13 & 32) != 0 ? department.totalPages : i12, (i13 & 64) != 0 ? department.nextPage : num2, (i13 & 128) != 0 ? department.isPending : z10, (i13 & 256) != 0 ? department.cursor : cursor, (i13 & 512) != 0 ? department.facets : list2, (i13 & 1024) != 0 ? department.sorts : list3, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? department.groups : list4, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? department.selectedFacets : map, (i13 & 8192) != 0 ? department.selectedSort : filterSortOption, (i13 & 16384) != 0 ? department.error : th2);
        }

        /* renamed from: A, reason: from getter */
        public final Co.Department getDepartment() {
            return this.department;
        }

        @Override // Qo.l
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Department a() {
            return (Department) this.empty.getValue();
        }

        public List<FilterGroup> C() {
            return this.groups;
        }

        @Override // Qo.l
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Department c() {
            return (Department) this.next.getValue();
        }

        /* renamed from: F, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l.k
        public Map<FilterFacet, List<FilterFacetOption>> F3() {
            return this.selectedFacets;
        }

        @Override // Qo.l
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Department g() {
            return (Department) this.reload.getValue();
        }

        @Override // Qo.l
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public Department o(boolean isPending) {
            return v(this, null, 0, 0, null, null, 0, null, isPending, null, null, null, null, null, null, null, 32639, null);
        }

        @Override // Qo.l.k
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public Department x0(List<FilterSortOption> sorts, List<FilterFacet> facets, FilterSortOption selectedSort, Map<FilterFacet, List<FilterFacetOption>> selectedFacets) {
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(facets, "facets");
            return v(this, null, 0, 0, null, null, 0, null, false, null, facets, sorts, null, selectedFacets, selectedSort, null, 18943, null);
        }

        @Override // Qo.l.k
        /* renamed from: N1, reason: from getter */
        public FilterSortOption getSelectedSort() {
            return this.selectedSort;
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l.k
        public List<FilterFacet> c1() {
            return this.facets;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((((this.department.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Cursor cursor = this.cursor;
            int iHashCode4 = (((((((iHashCode3 + (cursor == null ? 0 : cursor.hashCode())) * 31) + this.facets.hashCode()) * 31) + this.sorts.hashCode()) * 31) + this.groups.hashCode()) * 31;
            Map<FilterFacet, List<FilterFacetOption>> map = this.selectedFacets;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            FilterSortOption filterSortOption = this.selectedSort;
            int iHashCode6 = (iHashCode5 + (filterSortOption == null ? 0 : filterSortOption.hashCode())) * 31;
            Throwable th2 = this.error;
            return iHashCode6 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        @Override // Qo.l.k
        public void n0(Map<FilterFacet, List<FilterFacetOption>> map) {
            this.selectedFacets = map;
        }

        @Override // Qo.l.k
        public void q1(FilterSortOption filterSortOption) {
            this.selectedSort = filterSortOption;
        }

        public final Department t(Co.Department department, int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Cursor cursor, List<FilterFacet> facets, List<FilterSortOption> sorts, List<FilterGroup> groups, Map<FilterFacet, List<FilterFacetOption>> selectedFacets, FilterSortOption selectedSort, Throwable error) {
            Intrinsics.j(department, "department");
            Intrinsics.j(products, "products");
            Intrinsics.j(facets, "facets");
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(groups, "groups");
            return new Department(department, page, perPage, products, totalCount, totalPages, nextPage, isPending, cursor, facets, sorts, groups, selectedFacets, selectedSort, error);
        }

        public String toString() {
            return "Department(department=" + this.department + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", cursor=" + this.cursor + ", facets=" + this.facets + ", sorts=" + this.sorts + ", groups=" + this.groups + ", selectedFacets=" + this.selectedFacets + ", selectedSort=" + this.selectedSort + ", error=" + this.error + ')';
        }

        @Override // Qo.l.k
        public List<FilterSortOption> u3() {
            return this.sorts;
        }

        public Department x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, throwable, 16383, null);
        }

        /* renamed from: y, reason: from getter */
        public Cursor getCursor() {
            return this.cursor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Department I(Department department) {
            Integer nextPage = department.getNextPage();
            if (nextPage != null) {
                return v(department, null, nextPage.intValue(), 0, null, null, 0, null, true, null, null, null, null, null, null, null, 32637, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Department w(Department department) {
            return v(department, null, 0, 0, CollectionsKt.m(), null, 0, null, false, null, null, null, null, null, null, null, 32759, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Department(Co.Department department, int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, Cursor cursor, List<FilterFacet> facets, List<FilterSortOption> sorts, List<FilterGroup> groups, Map<FilterFacet, List<FilterFacetOption>> map, FilterSortOption filterSortOption, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(department, "department");
            Intrinsics.j(products, "products");
            Intrinsics.j(facets, "facets");
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(groups, "groups");
            this.department = department;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.cursor = cursor;
            this.facets = facets;
            this.sorts = sorts;
            this.groups = groups;
            this.selectedFacets = map;
            this.selectedSort = filterSortOption;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Department.I(this.f31236a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Department.w(this.f31237a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Department.L(this.f31238a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJl\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010F\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR!\u0010J\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bG\u0010A\u0012\u0004\bI\u0010E\u001a\u0004\bH\u0010CR!\u0010N\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bK\u0010A\u0012\u0004\bM\u0010E\u001a\u0004\bL\u0010C¨\u0006O"}, d2 = {"LQo/l$e;", "LQo/l;", "", "page", "perPage", "", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "", "error", "<init>", "(IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)V", "F", "(Z)LQo/l$e;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$e;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)LQo/l$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "I", "e", "m", "B", "n", "Ljava/util/List;", "f", "()Ljava/util/List;", "o", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "p", "i", "q", "d", "r", "Z", "k", "()Z", "s", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lkotlin/Lazy;", "A", "()LQo/l$e;", "getNext$annotations", "()V", "next", "u", "y", "getEmpty$annotations", "empty", "v", "C", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$e, reason: from toString */
    public static final /* data */ class Favorites extends l {
        public static final Parcelable.Creator<Favorites> CREATOR = new a();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$e$a */
        public static final class a implements Parcelable.Creator<Favorites> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Favorites createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Favorites.class.getClassLoader()));
                }
                return new Favorites(i10, i11, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Favorites[] newArray(int i10) {
                return new Favorites[i10];
            }
        }

        public Favorites() {
            this(0, 0, null, null, 0, null, false, null, l3.f93323c, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Favorites)) {
                return false;
            }
            Favorites favorites = (Favorites) other;
            return this.page == favorites.page && this.perPage == favorites.perPage && Intrinsics.e(this.products, favorites.products) && Intrinsics.e(this.totalCount, favorites.totalCount) && this.totalPages == favorites.totalPages && Intrinsics.e(this.nextPage, favorites.nextPage) && this.isPending == favorites.isPending && Intrinsics.e(this.error, favorites.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            dest.writeSerializable(this.error);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Favorites(int r3, int r4, java.util.List r5, java.lang.Integer r6, int r7, java.lang.Integer r8, boolean r9, java.lang.Throwable r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r2 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L5
                r3 = 0
            L5:
                r12 = r11 & 2
                if (r12 == 0) goto Lb
                r4 = 10
            Lb:
                r12 = r11 & 4
                if (r12 == 0) goto L13
                java.util.List r5 = kotlin.collections.CollectionsKt.m()
            L13:
                r12 = r11 & 8
                r0 = 0
                if (r12 == 0) goto L19
                r6 = r0
            L19:
                r12 = r11 & 16
                r1 = 1
                if (r12 == 0) goto L1f
                r7 = r1
            L1f:
                r12 = r11 & 32
                if (r12 == 0) goto L24
                r8 = r0
            L24:
                r12 = r11 & 64
                if (r12 == 0) goto L29
                r9 = r1
            L29:
                r11 = r11 & 128(0x80, float:1.8E-43)
                if (r11 == 0) goto L37
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L40
            L37:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L40:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qo.l.Favorites.<init>(int, int, java.util.List, java.lang.Integer, int, java.lang.Integer, boolean, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Favorites G(Favorites favorites) {
            return new Favorites(0, favorites.getPerPage(), null, null, 0, null, false, null, 253, null);
        }

        public static /* synthetic */ Favorites v(Favorites favorites, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Throwable th2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = favorites.page;
            }
            if ((i13 & 2) != 0) {
                i11 = favorites.perPage;
            }
            if ((i13 & 4) != 0) {
                list = favorites.products;
            }
            if ((i13 & 8) != 0) {
                num = favorites.totalCount;
            }
            if ((i13 & 16) != 0) {
                i12 = favorites.totalPages;
            }
            if ((i13 & 32) != 0) {
                num2 = favorites.nextPage;
            }
            if ((i13 & 64) != 0) {
                z10 = favorites.isPending;
            }
            if ((i13 & 128) != 0) {
                th2 = favorites.error;
            }
            boolean z11 = z10;
            Throwable th3 = th2;
            int i14 = i12;
            Integer num3 = num2;
            return favorites.t(i10, i11, list, num, i14, num3, z11, th3);
        }

        @Override // Qo.l
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Favorites c() {
            return (Favorites) this.next.getValue();
        }

        /* renamed from: B, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Favorites g() {
            return (Favorites) this.reload.getValue();
        }

        @Override // Qo.l
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public Favorites o(boolean isPending) {
            return v(this, 0, 0, null, null, 0, null, isPending, null, 191, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Throwable th2 = this.error;
            return iHashCode3 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        public final Favorites t(int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Throwable error) {
            Intrinsics.j(products, "products");
            return new Favorites(page, perPage, products, totalCount, totalPages, nextPage, isPending, error);
        }

        public String toString() {
            return "Favorites(page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", error=" + this.error + ')';
        }

        public Favorites x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, 0, 0, null, null, 0, null, false, throwable, l3.f93324d, null);
        }

        @Override // Qo.l
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Favorites a() {
            return (Favorites) this.empty.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Favorites E(Favorites favorites) {
            Integer nextPage = favorites.getNextPage();
            if (nextPage != null) {
                return v(favorites, nextPage.intValue(), 0, null, null, 0, null, true, null, 190, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Favorites w(Favorites favorites) {
            return v(favorites, 0, 0, CollectionsKt.m(), null, 0, null, false, null, 251, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Favorites(int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(products, "products");
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Favorites.E(this.f31239a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Favorites.w(this.f31240a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Favorites.G(this.f31241a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJv\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u001a\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b<\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010C\u001a\u0004\bD\u0010ER#\u0010L\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR!\u0010P\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bM\u0010G\u0012\u0004\bO\u0010K\u001a\u0004\bN\u0010IR!\u0010T\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bQ\u0010G\u0012\u0004\bS\u0010K\u001a\u0004\bR\u0010I¨\u0006U"}, d2 = {"LQo/l$f;", "LQo/l;", "Lnk/d;", "category", "", "page", "perPage", "", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "", "error", "<init>", "(Lnk/d;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)V", "G", "(Z)LQo/l$f;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$f;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(Lnk/d;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)LQo/l$f;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "Lnk/d;", "y", "()Lnk/d;", "m", "I", "e", "n", "C", "o", "Ljava/util/List;", "f", "()Ljava/util/List;", "p", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "q", "i", "r", "d", "s", "Z", "k", "()Z", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "u", "Lkotlin/Lazy;", "B", "()LQo/l$f;", "getNext$annotations", "()V", "next", "v", "A", "getEmpty$annotations", "empty", "w", "E", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$f, reason: from toString */
    public static final /* data */ class Personalized extends l {
        public static final Parcelable.Creator<Personalized> CREATOR = new a();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final nk.d category;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$f$a */
        public static final class a implements Parcelable.Creator<Personalized> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Personalized createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                nk.d dVarValueOf = nk.d.valueOf(parcel.readString());
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Personalized.class.getClassLoader()));
                }
                return new Personalized(dVarValueOf, i10, i11, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Personalized[] newArray(int i10) {
                return new Personalized[i10];
            }
        }

        public /* synthetic */ Personalized(nk.d dVar, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 20 : i11, (i13 & 8) != 0 ? CollectionsKt.m() : list, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? 1 : num2, (i13 & 128) != 0 ? true : z10, (i13 & 256) != 0 ? null : th2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Personalized)) {
                return false;
            }
            Personalized personalized = (Personalized) other;
            return this.category == personalized.category && this.page == personalized.page && this.perPage == personalized.perPage && Intrinsics.e(this.products, personalized.products) && Intrinsics.e(this.totalCount, personalized.totalCount) && this.totalPages == personalized.totalPages && Intrinsics.e(this.nextPage, personalized.nextPage) && this.isPending == personalized.isPending && Intrinsics.e(this.error, personalized.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.category.name());
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            dest.writeSerializable(this.error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Personalized I(Personalized personalized) {
            return new Personalized(personalized.category, 0, 0, null, null, 0, null, false, null, 510, null);
        }

        public static /* synthetic */ Personalized v(Personalized personalized, nk.d dVar, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Throwable th2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                dVar = personalized.category;
            }
            if ((i13 & 2) != 0) {
                i10 = personalized.page;
            }
            if ((i13 & 4) != 0) {
                i11 = personalized.perPage;
            }
            if ((i13 & 8) != 0) {
                list = personalized.products;
            }
            if ((i13 & 16) != 0) {
                num = personalized.totalCount;
            }
            if ((i13 & 32) != 0) {
                i12 = personalized.totalPages;
            }
            if ((i13 & 64) != 0) {
                num2 = personalized.nextPage;
            }
            if ((i13 & 128) != 0) {
                z10 = personalized.isPending;
            }
            if ((i13 & 256) != 0) {
                th2 = personalized.error;
            }
            boolean z11 = z10;
            Throwable th3 = th2;
            int i14 = i12;
            Integer num3 = num2;
            Integer num4 = num;
            int i15 = i11;
            return personalized.t(dVar, i10, i15, list, num4, i14, num3, z11, th3);
        }

        @Override // Qo.l
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Personalized a() {
            return (Personalized) this.empty.getValue();
        }

        @Override // Qo.l
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Personalized c() {
            return (Personalized) this.next.getValue();
        }

        /* renamed from: C, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Personalized g() {
            return (Personalized) this.reload.getValue();
        }

        @Override // Qo.l
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Personalized o(boolean isPending) {
            return v(this, null, 0, 0, null, null, 0, null, isPending, null, 383, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((((this.category.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Throwable th2 = this.error;
            return iHashCode3 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        public final Personalized t(nk.d category, int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Throwable error) {
            Intrinsics.j(category, "category");
            Intrinsics.j(products, "products");
            return new Personalized(category, page, perPage, products, totalCount, totalPages, nextPage, isPending, error);
        }

        public String toString() {
            return "Personalized(category=" + this.category + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", error=" + this.error + ')';
        }

        public Personalized x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, 0, 0, null, null, 0, null, false, throwable, l3.f93323c, null);
        }

        /* renamed from: y, reason: from getter */
        public final nk.d getCategory() {
            return this.category;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Personalized F(Personalized personalized) {
            Integer nextPage = personalized.getNextPage();
            if (nextPage != null) {
                return v(personalized, null, nextPage.intValue(), 0, null, null, 0, null, true, null, 381, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Personalized w(Personalized personalized) {
            return v(personalized, null, 0, 0, CollectionsKt.m(), null, 0, null, false, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Personalized(nk.d category, int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(category, "category");
            Intrinsics.j(products, "products");
            this.category = category;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Personalized.F(this.f31242a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Personalized.w(this.f31243a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Personalized.I(this.f31244a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u008a\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010!J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010%R!\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010!R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR#\u0010N\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR!\u0010R\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bO\u0010I\u0012\u0004\bQ\u0010M\u001a\u0004\bP\u0010KR!\u0010U\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010I\u0012\u0004\bT\u0010M\u001a\u0004\bS\u0010K¨\u0006V"}, d2 = {"LQo/l$g;", "LQo/l;", "", "recommendationProductType", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCodes", "", "page", "perPage", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "", "error", "<init>", "(Ljava/lang/String;Ljava/util/List;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)V", "G", "(Z)LQo/l$g;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$g;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(Ljava/lang/String;Ljava/util/List;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)LQo/l$g;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "Ljava/lang/String;", "C", "m", "Ljava/util/List;", "getProductCodes", "()Ljava/util/List;", "n", "I", "e", "o", "B", "p", "f", "q", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "r", "i", "s", "d", "Z", "k", "()Z", "u", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "v", "Lkotlin/Lazy;", "A", "()LQo/l$g;", "getNext$annotations", "()V", "next", "w", "y", "getEmpty$annotations", "empty", "E", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$g, reason: from toString */
    public static final /* data */ class Recommendations extends l {
        public static final Parcelable.Creator<Recommendations> CREATOR = new a();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String recommendationProductType;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> productCodes;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$g$a */
        public static final class a implements Parcelable.Creator<Recommendations> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Recommendations createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Recommendations.class.getClassLoader()));
                }
                return new Recommendations(string, arrayListCreateStringArrayList, i10, i11, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Recommendations[] newArray(int i10) {
                return new Recommendations[i10];
            }
        }

        public Recommendations() {
            this(null, null, 0, 0, null, null, 0, null, false, null, 1023, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recommendations)) {
                return false;
            }
            Recommendations recommendations = (Recommendations) other;
            return Intrinsics.e(this.recommendationProductType, recommendations.recommendationProductType) && Intrinsics.e(this.productCodes, recommendations.productCodes) && this.page == recommendations.page && this.perPage == recommendations.perPage && Intrinsics.e(this.products, recommendations.products) && Intrinsics.e(this.totalCount, recommendations.totalCount) && this.totalPages == recommendations.totalPages && Intrinsics.e(this.nextPage, recommendations.nextPage) && this.isPending == recommendations.isPending && Intrinsics.e(this.error, recommendations.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.recommendationProductType);
            dest.writeStringList(this.productCodes);
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            dest.writeSerializable(this.error);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Recommendations(java.lang.String r3, java.util.List r4, int r5, int r6, java.util.List r7, java.lang.Integer r8, int r9, java.lang.Integer r10, boolean r11, java.lang.Throwable r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r2 = this;
                r14 = r13 & 1
                if (r14 == 0) goto L6
                java.lang.String r3 = ""
            L6:
                r14 = r13 & 2
                if (r14 == 0) goto Le
                java.util.List r4 = kotlin.collections.CollectionsKt.m()
            Le:
                r14 = r13 & 4
                if (r14 == 0) goto L13
                r5 = 0
            L13:
                r14 = r13 & 8
                if (r14 == 0) goto L19
                r6 = 10
            L19:
                r14 = r13 & 16
                if (r14 == 0) goto L21
                java.util.List r7 = kotlin.collections.CollectionsKt.m()
            L21:
                r14 = r13 & 32
                r0 = 0
                if (r14 == 0) goto L27
                r8 = r0
            L27:
                r14 = r13 & 64
                r1 = 1
                if (r14 == 0) goto L2d
                r9 = r1
            L2d:
                r14 = r13 & 128(0x80, float:1.8E-43)
                if (r14 == 0) goto L32
                r10 = r0
            L32:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L37
                r11 = r1
            L37:
                r13 = r13 & 512(0x200, float:7.17E-43)
                if (r13 == 0) goto L47
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L52
            L47:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L52:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qo.l.Recommendations.<init>(java.lang.String, java.util.List, int, int, java.util.List, java.lang.Integer, int, java.lang.Integer, boolean, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ Recommendations v(Recommendations recommendations, String str, List list, int i10, int i11, List list2, Integer num, int i12, Integer num2, boolean z10, Throwable th2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = recommendations.recommendationProductType;
            }
            if ((i13 & 2) != 0) {
                list = recommendations.productCodes;
            }
            if ((i13 & 4) != 0) {
                i10 = recommendations.page;
            }
            if ((i13 & 8) != 0) {
                i11 = recommendations.perPage;
            }
            if ((i13 & 16) != 0) {
                list2 = recommendations.products;
            }
            if ((i13 & 32) != 0) {
                num = recommendations.totalCount;
            }
            if ((i13 & 64) != 0) {
                i12 = recommendations.totalPages;
            }
            if ((i13 & 128) != 0) {
                num2 = recommendations.nextPage;
            }
            if ((i13 & 256) != 0) {
                z10 = recommendations.isPending;
            }
            if ((i13 & 512) != 0) {
                th2 = recommendations.error;
            }
            boolean z11 = z10;
            Throwable th3 = th2;
            int i14 = i12;
            Integer num3 = num2;
            List list3 = list2;
            Integer num4 = num;
            return recommendations.t(str, list, i10, i11, list3, num4, i14, num3, z11, th3);
        }

        @Override // Qo.l
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Recommendations c() {
            return (Recommendations) this.next.getValue();
        }

        /* renamed from: B, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        /* renamed from: C, reason: from getter */
        public final String getRecommendationProductType() {
            return this.recommendationProductType;
        }

        @Override // Qo.l
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Recommendations g() {
            return (Recommendations) this.reload.getValue();
        }

        @Override // Qo.l
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Recommendations o(boolean isPending) {
            return v(this, null, null, 0, 0, null, null, 0, null, isPending, null, 767, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.recommendationProductType.hashCode() * 31) + this.productCodes.hashCode()) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Throwable th2 = this.error;
            return iHashCode3 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        public final Recommendations t(String recommendationProductType, List<String> productCodes, int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Throwable error) {
            Intrinsics.j(recommendationProductType, "recommendationProductType");
            Intrinsics.j(productCodes, "productCodes");
            Intrinsics.j(products, "products");
            return new Recommendations(recommendationProductType, productCodes, page, perPage, products, totalCount, totalPages, nextPage, isPending, error);
        }

        public String toString() {
            return "Recommendations(recommendationProductType=" + this.recommendationProductType + ", productCodes=" + this.productCodes + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", error=" + this.error + ')';
        }

        public Recommendations x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, null, 0, 0, null, null, 0, null, false, throwable, 511, null);
        }

        @Override // Qo.l
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Recommendations a() {
            return (Recommendations) this.empty.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recommendations F(Recommendations recommendations) {
            Integer nextPage = recommendations.getNextPage();
            if (nextPage != null) {
                return v(recommendations, null, null, nextPage.intValue(), 0, null, null, 0, null, true, null, 763, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recommendations I(Recommendations recommendations) {
            int perPage = recommendations.getPerPage();
            return new Recommendations(recommendations.recommendationProductType, recommendations.productCodes, 0, perPage, null, null, 0, null, false, null, 1012, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recommendations w(Recommendations recommendations) {
            return v(recommendations, null, null, 0, 0, CollectionsKt.m(), null, 0, null, false, null, 1007, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recommendations(String recommendationProductType, List<String> productCodes, int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(recommendationProductType, "recommendationProductType");
            Intrinsics.j(productCodes, "productCodes");
            Intrinsics.j(products, "products");
            this.recommendationProductType = recommendationProductType;
            this.productCodes = productCodes;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Recommendations.F(this.f31245a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Recommendations.w(this.f31246a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Recommendations.I(this.f31061a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\u008c\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010!J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010!R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010!R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010>R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR#\u0010P\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010MR!\u0010S\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010K\u0012\u0004\bR\u0010O\u001a\u0004\bQ\u0010MR!\u0010V\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b:\u0010K\u0012\u0004\bU\u0010O\u001a\u0004\bT\u0010M¨\u0006W"}, d2 = {"LQo/l$h;", "LQo/l;", "", "rewardId", "rewardTitle", "", "page", "perPage", "", "LCo/h;", "products", "continuationToken", "totalCount", "totalPages", "nextPage", "", "isPending", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)V", "J", "(Z)LQo/l$h;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$h;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)LQo/l$h;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "Ljava/lang/String;", "F", "m", "G", "n", "I", "e", "o", "C", "p", "Ljava/util/List;", "f", "()Ljava/util/List;", "q", "y", "r", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "s", "i", "d", "u", "Z", "k", "()Z", "v", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "w", "Lkotlin/Lazy;", "B", "()LQo/l$h;", "getNext$annotations", "()V", "next", "A", "getEmpty$annotations", "empty", "E", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$h, reason: from toString */
    public static final /* data */ class Reward extends l {
        public static final Parcelable.Creator<Reward> CREATOR = new a();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardId;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String rewardTitle;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String continuationToken;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$h$a */
        public static final class a implements Parcelable.Creator<Reward> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Reward createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Reward.class.getClassLoader()));
                }
                return new Reward(string, string2, i10, i11, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Reward[] newArray(int i10) {
                return new Reward[i10];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Reward(java.lang.String r15, java.lang.String r16, int r17, int r18, java.util.List r19, java.lang.String r20, java.lang.Integer r21, int r22, java.lang.Integer r23, boolean r24, java.lang.Throwable r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 4
                if (r1 == 0) goto L9
                r1 = 0
                r5 = r1
                goto Lb
            L9:
                r5 = r17
            Lb:
                r1 = r0 & 8
                if (r1 == 0) goto L13
                r1 = 20
                r6 = r1
                goto L15
            L13:
                r6 = r18
            L15:
                r1 = r0 & 16
                if (r1 == 0) goto L1f
                java.util.List r1 = kotlin.collections.CollectionsKt.m()
                r7 = r1
                goto L21
            L1f:
                r7 = r19
            L21:
                r1 = r0 & 32
                r2 = 0
                if (r1 == 0) goto L28
                r8 = r2
                goto L2a
            L28:
                r8 = r20
            L2a:
                r1 = r0 & 64
                if (r1 == 0) goto L30
                r9 = r2
                goto L32
            L30:
                r9 = r21
            L32:
                r1 = r0 & 128(0x80, float:1.8E-43)
                r3 = 1
                if (r1 == 0) goto L39
                r10 = r3
                goto L3b
            L39:
                r10 = r22
            L3b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L41
                r11 = r2
                goto L43
            L41:
                r11 = r23
            L43:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L49
                r12 = r3
                goto L4b
            L49:
                r12 = r24
            L4b:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L55
                r13 = r2
                r3 = r15
                r4 = r16
                r2 = r14
                goto L5b
            L55:
                r13 = r25
                r2 = r14
                r3 = r15
                r4 = r16
            L5b:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qo.l.Reward.<init>(java.lang.String, java.lang.String, int, int, java.util.List, java.lang.String, java.lang.Integer, int, java.lang.Integer, boolean, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reward)) {
                return false;
            }
            Reward reward = (Reward) other;
            return Intrinsics.e(this.rewardId, reward.rewardId) && Intrinsics.e(this.rewardTitle, reward.rewardTitle) && this.page == reward.page && this.perPage == reward.perPage && Intrinsics.e(this.products, reward.products) && Intrinsics.e(this.continuationToken, reward.continuationToken) && Intrinsics.e(this.totalCount, reward.totalCount) && this.totalPages == reward.totalPages && Intrinsics.e(this.nextPage, reward.nextPage) && this.isPending == reward.isPending && Intrinsics.e(this.error, reward.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.rewardId);
            dest.writeString(this.rewardTitle);
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.continuationToken);
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            dest.writeSerializable(this.error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Reward L(Reward reward) {
            return new Reward(reward.rewardId, reward.rewardTitle, 0, 0, null, null, null, 0, null, false, null, 2044, null);
        }

        public static /* synthetic */ Reward v(Reward reward, String str, String str2, int i10, int i11, List list, String str3, Integer num, int i12, Integer num2, boolean z10, Throwable th2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = reward.rewardId;
            }
            if ((i13 & 2) != 0) {
                str2 = reward.rewardTitle;
            }
            if ((i13 & 4) != 0) {
                i10 = reward.page;
            }
            if ((i13 & 8) != 0) {
                i11 = reward.perPage;
            }
            if ((i13 & 16) != 0) {
                list = reward.products;
            }
            if ((i13 & 32) != 0) {
                str3 = reward.continuationToken;
            }
            if ((i13 & 64) != 0) {
                num = reward.totalCount;
            }
            if ((i13 & 128) != 0) {
                i12 = reward.totalPages;
            }
            if ((i13 & 256) != 0) {
                num2 = reward.nextPage;
            }
            if ((i13 & 512) != 0) {
                z10 = reward.isPending;
            }
            if ((i13 & 1024) != 0) {
                th2 = reward.error;
            }
            boolean z11 = z10;
            Throwable th3 = th2;
            int i14 = i12;
            Integer num3 = num2;
            String str4 = str3;
            Integer num4 = num;
            List list2 = list;
            int i15 = i10;
            return reward.t(str, str2, i15, i11, list2, str4, num4, i14, num3, z11, th3);
        }

        @Override // Qo.l
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Reward a() {
            return (Reward) this.empty.getValue();
        }

        @Override // Qo.l
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Reward c() {
            return (Reward) this.next.getValue();
        }

        /* renamed from: C, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Reward g() {
            return (Reward) this.reload.getValue();
        }

        /* renamed from: F, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        /* renamed from: G, reason: from getter */
        public final String getRewardTitle() {
            return this.rewardTitle;
        }

        @Override // Qo.l
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public Reward o(boolean isPending) {
            return v(this, null, null, 0, 0, null, null, null, 0, null, isPending, null, 1535, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.rewardId.hashCode() * 31) + this.rewardTitle.hashCode()) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            String str = this.continuationToken;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.totalCount;
            int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode4 = (((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Throwable th2 = this.error;
            return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        public final Reward t(String rewardId, String rewardTitle, int page, int perPage, List<ProductFullDetails> products, String continuationToken, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Throwable error) {
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(rewardTitle, "rewardTitle");
            Intrinsics.j(products, "products");
            return new Reward(rewardId, rewardTitle, page, perPage, products, continuationToken, totalCount, totalPages, nextPage, isPending, error);
        }

        public String toString() {
            return "Reward(rewardId=" + this.rewardId + ", rewardTitle=" + this.rewardTitle + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", continuationToken=" + this.continuationToken + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", error=" + this.error + ')';
        }

        public Reward x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, null, 0, 0, null, null, null, 0, null, false, throwable, 1023, null);
        }

        /* renamed from: y, reason: from getter */
        public String getContinuationToken() {
            return this.continuationToken;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Reward(String rewardId, String rewardTitle, int i10, int i11, List<ProductFullDetails> products, String str, Integer num, int i12, Integer num2, boolean z10, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(rewardId, "rewardId");
            Intrinsics.j(rewardTitle, "rewardTitle");
            Intrinsics.j(products, "products");
            this.rewardId = rewardId;
            this.rewardTitle = rewardTitle;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.continuationToken = str;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Reward.I(this.f31062a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Reward.w(this.f31063a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Reward.L(this.f31064a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Reward I(Reward reward) {
            Integer nextPage = reward.getNextPage();
            if (nextPage != null) {
                return v(reward, null, null, nextPage.intValue(), 0, null, null, null, 0, null, true, null, 1531, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Reward w(Reward reward) {
            return v(reward, null, null, 0, 0, CollectionsKt.m(), null, null, 0, null, false, null, 2031, null);
        }
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\bL\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0085\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f\u0012\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+JW\u0010,\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f\u0018\u00010\u0018j\u0004\u0018\u0001`\u001aH\u0016¢\u0006\u0004\b,\u0010-J\u001d\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\t¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0090\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\"\b\u0002\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b:\u00105J\u001a\u0010<\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u00109R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u00109R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u00109R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010D\u001a\u0004\bF\u00105R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010D\u001a\u0004\bH\u00105R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u0010\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\bR\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\bS\u0010PR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bY\u0010LR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010LR<\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f\u0018\u00010\u0018j\u0004\u0018\u0001`\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\ba\u0010iR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010N\u001a\u0004\bk\u0010PR\u001c\u0010 \u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010N\u001a\u0004\bj\u0010PR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010J\u001a\u0004\bn\u0010LR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR#\u0010w\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bB\u0010s\u0012\u0004\bu\u0010v\u001a\u0004\bm\u0010tR!\u0010y\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bH\u0010s\u0012\u0004\bx\u0010v\u001a\u0004\bl\u0010tR!\u0010|\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bz\u0010s\u0012\u0004\b{\u0010v\u001a\u0004\bz\u0010t¨\u0006}"}, d2 = {"LQo/l$i;", "LQo/l;", "Landroid/os/Parcelable;", "LQo/l$k;", "", "", "term", "originalQuery", "spellingSuggestion", "", "page", "perPage", "", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "LQo/a;", "facets", "LQo/g;", "sorts", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "selectedSort", "LPo/a;", "cursor", "tokenMatch", "embeddingsMatch", "LQo/e;", "groups", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;LQo/g;LPo/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Throwable;)V", "N", "(Z)LQo/l$i;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$i;", "P", "(Ljava/util/List;Ljava/util/List;LQo/g;Ljava/util/Map;)LQo/l$i;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/util/List;Ljava/util/List;Ljava/util/Map;LQo/g;LPo/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Throwable;)LQo/l$i;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "l", "Ljava/lang/String;", "J", "m", "E", "n", "I", "o", "e", "p", "F", "q", "Ljava/util/List;", "f", "()Ljava/util/List;", "r", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "s", "i", "d", "u", "Z", "k", "()Z", "v", "c1", "w", "u3", "Ljava/util/Map;", "F3", "()Ljava/util/Map;", "n0", "(Ljava/util/Map;)V", "y", "LQo/g;", "N1", "()LQo/g;", "q1", "(LQo/g;)V", "z", "LPo/a;", "()LPo/a;", "A", "L", "B", "C", "getGroups", "D", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lkotlin/Lazy;", "()LQo/l$i;", "getNext$annotations", "()V", "next", "getEmpty$annotations", "empty", "G", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$i, reason: from toString */
    public static final /* data */ class Search extends l implements Parcelable, k {
        public static final Parcelable.Creator<Search> CREATOR = new a();

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer tokenMatch;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer embeddingsMatch;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterGroup> groups;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String term;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originalQuery;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String spellingSuggestion;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterFacet> facets;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterSortOption> sorts;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private Map<FilterFacet, List<FilterFacetOption>> selectedFacets;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private FilterSortOption selectedSort;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Cursor cursor;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$i$a */
        public static final class a implements Parcelable.Creator<Search> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Search createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.j(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(Search.class.getClassLoader()));
                }
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int i14 = parcel.readInt();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z10 = parcel.readInt() != 0;
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(FilterFacet.CREATOR.createFromParcel(parcel));
                }
                int i17 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(FilterSortOption.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i19 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i19);
                    int i20 = 0;
                    while (i20 != i19) {
                        Integer num = numValueOf;
                        FilterFacet filterFacetCreateFromParcel = FilterFacet.CREATOR.createFromParcel(parcel);
                        int i21 = i19;
                        int i22 = parcel.readInt();
                        String str = string;
                        ArrayList arrayList4 = new ArrayList(i22);
                        String str2 = string2;
                        int i23 = 0;
                        while (i23 != i22) {
                            arrayList4.add(FilterFacetOption.CREATOR.createFromParcel(parcel));
                            i23++;
                            i22 = i22;
                        }
                        linkedHashMap2.put(filterFacetCreateFromParcel, arrayList4);
                        i20++;
                        numValueOf = num;
                        i19 = i21;
                        string = str;
                        string2 = str2;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                Integer num2 = numValueOf;
                String str3 = string;
                String str4 = string2;
                FilterSortOption filterSortOptionCreateFromParcel = parcel.readInt() == 0 ? null : FilterSortOption.CREATOR.createFromParcel(parcel);
                Cursor cursorCreateFromParcel = parcel.readInt() == 0 ? null : Cursor.CREATOR.createFromParcel(parcel);
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                int i24 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList5.add(FilterGroup.CREATOR.createFromParcel(parcel));
                }
                return new Search(str3, str4, string3, i10, i11, arrayList, num2, i14, numValueOf2, z10, arrayList2, arrayList3, linkedHashMap, filterSortOptionCreateFromParcel, cursorCreateFromParcel, numValueOf3, numValueOf4, arrayList5, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Search[] newArray(int i10) {
                return new Search[i10];
            }
        }

        public /* synthetic */ Search(String str, String str2, String str3, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, List list2, List list3, Map map, FilterSortOption filterSortOption, Cursor cursor, Integer num3, Integer num4, List list4, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? str : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? 0 : i10, (i13 & 16) != 0 ? 30 : i11, (i13 & 32) != 0 ? CollectionsKt.m() : list, (i13 & 64) != 0 ? null : num, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : num2, (i13 & 512) == 0 ? z10 : true, (i13 & 1024) != 0 ? CollectionsKt.m() : list2, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? CollectionsKt.m() : list3, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : map, (i13 & 8192) != 0 ? null : filterSortOption, (i13 & 16384) != 0 ? null : cursor, (i13 & 32768) != 0 ? null : num3, (i13 & 65536) != 0 ? null : num4, (i13 & 131072) != 0 ? CollectionsKt.m() : list4, (i13 & 262144) != 0 ? null : th2);
        }

        public static /* synthetic */ Search v(Search search, String str, String str2, String str3, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, List list2, List list3, Map map, FilterSortOption filterSortOption, Cursor cursor, Integer num3, Integer num4, List list4, Throwable th2, int i13, Object obj) {
            Throwable th3;
            List list5;
            String str4 = (i13 & 1) != 0 ? search.term : str;
            String str5 = (i13 & 2) != 0 ? search.originalQuery : str2;
            String str6 = (i13 & 4) != 0 ? search.spellingSuggestion : str3;
            int i14 = (i13 & 8) != 0 ? search.page : i10;
            int i15 = (i13 & 16) != 0 ? search.perPage : i11;
            List list6 = (i13 & 32) != 0 ? search.products : list;
            Integer num5 = (i13 & 64) != 0 ? search.totalCount : num;
            int i16 = (i13 & 128) != 0 ? search.totalPages : i12;
            Integer num6 = (i13 & 256) != 0 ? search.nextPage : num2;
            boolean z11 = (i13 & 512) != 0 ? search.isPending : z10;
            List list7 = (i13 & 1024) != 0 ? search.facets : list2;
            List list8 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? search.sorts : list3;
            Map map2 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? search.selectedFacets : map;
            FilterSortOption filterSortOption2 = (i13 & 8192) != 0 ? search.selectedSort : filterSortOption;
            String str7 = str4;
            Cursor cursor2 = (i13 & 16384) != 0 ? search.cursor : cursor;
            Integer num7 = (i13 & 32768) != 0 ? search.tokenMatch : num3;
            Integer num8 = (i13 & 65536) != 0 ? search.embeddingsMatch : num4;
            List list9 = (i13 & 131072) != 0 ? search.groups : list4;
            if ((i13 & 262144) != 0) {
                list5 = list9;
                th3 = search.error;
            } else {
                th3 = th2;
                list5 = list9;
            }
            return search.t(str7, str5, str6, i14, i15, list6, num5, i16, num6, z11, list7, list8, map2, filterSortOption2, cursor2, num7, num8, list5, th3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Search)) {
                return false;
            }
            Search search = (Search) other;
            return Intrinsics.e(this.term, search.term) && Intrinsics.e(this.originalQuery, search.originalQuery) && Intrinsics.e(this.spellingSuggestion, search.spellingSuggestion) && this.page == search.page && this.perPage == search.perPage && Intrinsics.e(this.products, search.products) && Intrinsics.e(this.totalCount, search.totalCount) && this.totalPages == search.totalPages && Intrinsics.e(this.nextPage, search.nextPage) && this.isPending == search.isPending && Intrinsics.e(this.facets, search.facets) && Intrinsics.e(this.sorts, search.sorts) && Intrinsics.e(this.selectedFacets, search.selectedFacets) && Intrinsics.e(this.selectedSort, search.selectedSort) && Intrinsics.e(this.cursor, search.cursor) && Intrinsics.e(this.tokenMatch, search.tokenMatch) && Intrinsics.e(this.embeddingsMatch, search.embeddingsMatch) && Intrinsics.e(this.groups, search.groups) && Intrinsics.e(this.error, search.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeString(this.term);
            dest.writeString(this.originalQuery);
            dest.writeString(this.spellingSuggestion);
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            List<FilterFacet> list2 = this.facets;
            dest.writeInt(list2.size());
            Iterator<FilterFacet> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            List<FilterSortOption> list3 = this.sorts;
            dest.writeInt(list3.size());
            Iterator<FilterSortOption> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            Map<FilterFacet, List<FilterFacetOption>> map = this.selectedFacets;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : map.entrySet()) {
                    entry.getKey().writeToParcel(dest, flags);
                    List<FilterFacetOption> value = entry.getValue();
                    dest.writeInt(value.size());
                    Iterator<FilterFacetOption> it4 = value.iterator();
                    while (it4.hasNext()) {
                        it4.next().writeToParcel(dest, flags);
                    }
                }
            }
            FilterSortOption filterSortOption = this.selectedSort;
            if (filterSortOption == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                filterSortOption.writeToParcel(dest, flags);
            }
            Cursor cursor = this.cursor;
            if (cursor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cursor.writeToParcel(dest, flags);
            }
            Integer num3 = this.tokenMatch;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
            Integer num4 = this.embeddingsMatch;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num4.intValue());
            }
            List<FilterGroup> list4 = this.groups;
            dest.writeInt(list4.size());
            Iterator<FilterGroup> it5 = list4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(dest, flags);
            }
            dest.writeSerializable(this.error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Search O(Search search) {
            String str = search.term;
            int perPage = search.getPerPage();
            Map<FilterFacet, List<FilterFacetOption>> mapF3 = search.F3();
            FilterSortOption selectedSort = search.getSelectedSort();
            Cursor cursor = search.getCursor();
            return new Search(str, null, null, 0, perPage, null, null, 0, null, false, search.c1(), search.u3(), mapF3, selectedSort, cursor, null, null, null, null, 492526, null);
        }

        /* renamed from: A, reason: from getter */
        public Integer getEmbeddingsMatch() {
            return this.embeddingsMatch;
        }

        @Override // Qo.l
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Search a() {
            return (Search) this.empty.getValue();
        }

        @Override // Qo.l
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Search c() {
            return (Search) this.next.getValue();
        }

        /* renamed from: E, reason: from getter */
        public final String getOriginalQuery() {
            return this.originalQuery;
        }

        /* renamed from: F, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l.k
        public Map<FilterFacet, List<FilterFacetOption>> F3() {
            return this.selectedFacets;
        }

        @Override // Qo.l
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Search g() {
            return (Search) this.reload.getValue();
        }

        /* renamed from: I, reason: from getter */
        public final String getSpellingSuggestion() {
            return this.spellingSuggestion;
        }

        /* renamed from: J, reason: from getter */
        public final String getTerm() {
            return this.term;
        }

        /* renamed from: L, reason: from getter */
        public Integer getTokenMatch() {
            return this.tokenMatch;
        }

        @Override // Qo.l.k
        /* renamed from: N1, reason: from getter */
        public FilterSortOption getSelectedSort() {
            return this.selectedSort;
        }

        @Override // Qo.l.k
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public Search x0(List<FilterSortOption> sorts, List<FilterFacet> facets, FilterSortOption selectedSort, Map<FilterFacet, List<FilterFacetOption>> selectedFacets) {
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(facets, "facets");
            return v(this, null, null, null, 0, 0, null, null, 0, null, false, facets, sorts, selectedFacets, selectedSort, null, null, null, null, null, 508927, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l.k
        public List<FilterFacet> c1() {
            return this.facets;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((this.term.hashCode() * 31) + this.originalQuery.hashCode()) * 31;
            String str = this.spellingSuggestion;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode4 = (((((((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31) + this.facets.hashCode()) * 31) + this.sorts.hashCode()) * 31;
            Map<FilterFacet, List<FilterFacetOption>> map = this.selectedFacets;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            FilterSortOption filterSortOption = this.selectedSort;
            int iHashCode6 = (iHashCode5 + (filterSortOption == null ? 0 : filterSortOption.hashCode())) * 31;
            Cursor cursor = this.cursor;
            int iHashCode7 = (iHashCode6 + (cursor == null ? 0 : cursor.hashCode())) * 31;
            Integer num3 = this.tokenMatch;
            int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.embeddingsMatch;
            int iHashCode9 = (((iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31) + this.groups.hashCode()) * 31;
            Throwable th2 = this.error;
            return iHashCode9 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        @Override // Qo.l.k
        public void n0(Map<FilterFacet, List<FilterFacetOption>> map) {
            this.selectedFacets = map;
        }

        @Override // Qo.l.k
        public void q1(FilterSortOption filterSortOption) {
            this.selectedSort = filterSortOption;
        }

        public final Search t(String term, String originalQuery, String spellingSuggestion, int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, List<FilterFacet> facets, List<FilterSortOption> sorts, Map<FilterFacet, List<FilterFacetOption>> selectedFacets, FilterSortOption selectedSort, Cursor cursor, Integer tokenMatch, Integer embeddingsMatch, List<FilterGroup> groups, Throwable error) {
            Intrinsics.j(term, "term");
            Intrinsics.j(originalQuery, "originalQuery");
            Intrinsics.j(products, "products");
            Intrinsics.j(facets, "facets");
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(groups, "groups");
            return new Search(term, originalQuery, spellingSuggestion, page, perPage, products, totalCount, totalPages, nextPage, isPending, facets, sorts, selectedFacets, selectedSort, cursor, tokenMatch, embeddingsMatch, groups, error);
        }

        public String toString() {
            return "Search(term=" + this.term + ", originalQuery=" + this.originalQuery + ", spellingSuggestion=" + this.spellingSuggestion + ", page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", facets=" + this.facets + ", sorts=" + this.sorts + ", selectedFacets=" + this.selectedFacets + ", selectedSort=" + this.selectedSort + ", cursor=" + this.cursor + ", tokenMatch=" + this.tokenMatch + ", embeddingsMatch=" + this.embeddingsMatch + ", groups=" + this.groups + ", error=" + this.error + ')';
        }

        @Override // Qo.l.k
        public List<FilterSortOption> u3() {
            return this.sorts;
        }

        public Search x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, null, null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, throwable, 262143, null);
        }

        /* renamed from: y, reason: from getter */
        public Cursor getCursor() {
            return this.cursor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Search M(Search search) {
            Integer nextPage = search.getNextPage();
            if (nextPage != null) {
                return v(search, null, null, null, nextPage.intValue(), 0, null, null, 0, null, true, null, null, null, null, null, null, null, null, null, 523767, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Search w(Search search) {
            return v(search, null, null, null, 0, 0, CollectionsKt.m(), null, 0, null, false, null, null, null, null, null, null, null, null, null, 524255, null);
        }

        @Override // Qo.l
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public Search o(boolean isPending) {
            return v(this, null, null, null, 0, 0, null, null, 0, null, isPending, null, null, null, null, null, null, null, null, null, 523775, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Search(String term, String originalQuery, String str, int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, List<FilterFacet> facets, List<FilterSortOption> sorts, Map<FilterFacet, List<FilterFacetOption>> map, FilterSortOption filterSortOption, Cursor cursor, Integer num3, Integer num4, List<FilterGroup> groups, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(term, "term");
            Intrinsics.j(originalQuery, "originalQuery");
            Intrinsics.j(products, "products");
            Intrinsics.j(facets, "facets");
            Intrinsics.j(sorts, "sorts");
            Intrinsics.j(groups, "groups");
            this.term = term;
            this.originalQuery = originalQuery;
            this.spellingSuggestion = str;
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.facets = facets;
            this.sorts = sorts;
            this.selectedFacets = map;
            this.selectedSort = filterSortOption;
            this.cursor = cursor;
            this.tokenMatch = num3;
            this.embeddingsMatch = num4;
            this.groups = groups;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Search.M(this.f31065a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Search.w(this.f31066a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.G
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.Search.O(this.f31067a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJl\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010F\u001a\u0004\u0018\u00010\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR!\u0010J\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bG\u0010A\u0012\u0004\bI\u0010E\u001a\u0004\bH\u0010CR!\u0010N\u001a\u00020\u00008VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\bK\u0010A\u0012\u0004\bM\u0010E\u001a\u0004\bL\u0010C¨\u0006O"}, d2 = {"LQo/l$j;", "LQo/l;", "", "page", "perPage", "", "LCo/h;", "products", "totalCount", "totalPages", "nextPage", "", "isPending", "", "error", "<init>", "(IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)V", "F", "(Z)LQo/l$j;", "throwable", "x", "(Ljava/lang/Throwable;)LQo/l$j;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "t", "(IILjava/util/List;Ljava/lang/Integer;ILjava/lang/Integer;ZLjava/lang/Throwable;)LQo/l$j;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "l", "I", "e", "m", "B", "n", "Ljava/util/List;", "f", "()Ljava/util/List;", "o", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "p", "i", "q", "d", "r", "Z", "k", "()Z", "s", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lkotlin/Lazy;", "A", "()LQo/l$j;", "getNext$annotations", "()V", "next", "u", "y", "getEmpty$annotations", "empty", "v", "C", "getReload$annotations", "reload", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qo.l$j, reason: from toString */
    public static final /* data */ class ShoppingList extends l {
        public static final Parcelable.Creator<ShoppingList> CREATOR = new a();

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final int page;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final int perPage;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductFullDetails> products;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer totalCount;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalPages;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nextPage;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPending;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final Lazy next;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final Lazy empty;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final Lazy reload;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qo.l$j$a */
        public static final class a implements Parcelable.Creator<ShoppingList> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShoppingList createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readParcelable(ShoppingList.class.getClassLoader()));
                }
                return new ShoppingList(i10, i11, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShoppingList[] newArray(int i10) {
                return new ShoppingList[i10];
            }
        }

        public ShoppingList() {
            this(0, 0, null, null, 0, null, false, null, l3.f93323c, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShoppingList)) {
                return false;
            }
            ShoppingList shoppingList = (ShoppingList) other;
            return this.page == shoppingList.page && this.perPage == shoppingList.perPage && Intrinsics.e(this.products, shoppingList.products) && Intrinsics.e(this.totalCount, shoppingList.totalCount) && this.totalPages == shoppingList.totalPages && Intrinsics.e(this.nextPage, shoppingList.nextPage) && this.isPending == shoppingList.isPending && Intrinsics.e(this.error, shoppingList.error);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(this.page);
            dest.writeInt(this.perPage);
            List<ProductFullDetails> list = this.products;
            dest.writeInt(list.size());
            Iterator<ProductFullDetails> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Integer num = this.totalCount;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.totalPages);
            Integer num2 = this.nextPage;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeInt(this.isPending ? 1 : 0);
            dest.writeSerializable(this.error);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ShoppingList(int r3, int r4, java.util.List r5, java.lang.Integer r6, int r7, java.lang.Integer r8, boolean r9, java.lang.Throwable r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r2 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L5
                r3 = 0
            L5:
                r12 = r11 & 2
                if (r12 == 0) goto Lb
                r4 = 10
            Lb:
                r12 = r11 & 4
                if (r12 == 0) goto L13
                java.util.List r5 = kotlin.collections.CollectionsKt.m()
            L13:
                r12 = r11 & 8
                r0 = 0
                if (r12 == 0) goto L19
                r6 = r0
            L19:
                r12 = r11 & 16
                r1 = 1
                if (r12 == 0) goto L1f
                r7 = r1
            L1f:
                r12 = r11 & 32
                if (r12 == 0) goto L24
                r8 = r0
            L24:
                r12 = r11 & 64
                if (r12 == 0) goto L29
                r9 = r1
            L29:
                r11 = r11 & 128(0x80, float:1.8E-43)
                if (r11 == 0) goto L37
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L40
            L37:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L40:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qo.l.ShoppingList.<init>(int, int, java.util.List, java.lang.Integer, int, java.lang.Integer, boolean, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ShoppingList G(ShoppingList shoppingList) {
            return new ShoppingList(0, shoppingList.getPerPage(), null, null, 0, null, false, null, 253, null);
        }

        public static /* synthetic */ ShoppingList v(ShoppingList shoppingList, int i10, int i11, List list, Integer num, int i12, Integer num2, boolean z10, Throwable th2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i10 = shoppingList.page;
            }
            if ((i13 & 2) != 0) {
                i11 = shoppingList.perPage;
            }
            if ((i13 & 4) != 0) {
                list = shoppingList.products;
            }
            if ((i13 & 8) != 0) {
                num = shoppingList.totalCount;
            }
            if ((i13 & 16) != 0) {
                i12 = shoppingList.totalPages;
            }
            if ((i13 & 32) != 0) {
                num2 = shoppingList.nextPage;
            }
            if ((i13 & 64) != 0) {
                z10 = shoppingList.isPending;
            }
            if ((i13 & 128) != 0) {
                th2 = shoppingList.error;
            }
            boolean z11 = z10;
            Throwable th3 = th2;
            int i14 = i12;
            Integer num3 = num2;
            return shoppingList.t(i10, i11, list, num, i14, num3, z11, th3);
        }

        @Override // Qo.l
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public ShoppingList c() {
            return (ShoppingList) this.next.getValue();
        }

        /* renamed from: B, reason: from getter */
        public int getPerPage() {
            return this.perPage;
        }

        @Override // Qo.l
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public ShoppingList g() {
            return (ShoppingList) this.reload.getValue();
        }

        @Override // Qo.l
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public ShoppingList o(boolean isPending) {
            return v(this, 0, 0, null, null, 0, null, isPending, null, 191, null);
        }

        @Override // Qo.l
        /* renamed from: b, reason: from getter */
        public Throwable getError() {
            return this.error;
        }

        @Override // Qo.l
        /* renamed from: d, reason: from getter */
        public Integer getNextPage() {
            return this.nextPage;
        }

        @Override // Qo.l
        /* renamed from: e, reason: from getter */
        public int getPage() {
            return this.page;
        }

        @Override // Qo.l
        public List<ProductFullDetails> f() {
            return this.products;
        }

        @Override // Qo.l
        /* renamed from: h, reason: from getter */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.perPage)) * 31) + this.products.hashCode()) * 31;
            Integer num = this.totalCount;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31;
            Integer num2 = this.nextPage;
            int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.isPending)) * 31;
            Throwable th2 = this.error;
            return iHashCode3 + (th2 != null ? th2.hashCode() : 0);
        }

        @Override // Qo.l
        /* renamed from: i, reason: from getter */
        public int getTotalPages() {
            return this.totalPages;
        }

        @Override // Qo.l
        /* renamed from: k, reason: from getter */
        public boolean getIsPending() {
            return this.isPending;
        }

        public final ShoppingList t(int page, int perPage, List<ProductFullDetails> products, Integer totalCount, int totalPages, Integer nextPage, boolean isPending, Throwable error) {
            Intrinsics.j(products, "products");
            return new ShoppingList(page, perPage, products, totalCount, totalPages, nextPage, isPending, error);
        }

        public String toString() {
            return "ShoppingList(page=" + this.page + ", perPage=" + this.perPage + ", products=" + this.products + ", totalCount=" + this.totalCount + ", totalPages=" + this.totalPages + ", nextPage=" + this.nextPage + ", isPending=" + this.isPending + ", error=" + this.error + ')';
        }

        public ShoppingList x(Throwable throwable) {
            Intrinsics.j(throwable, "throwable");
            return v(this, 0, 0, null, null, 0, null, false, throwable, l3.f93324d, null);
        }

        @Override // Qo.l
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public ShoppingList a() {
            return (ShoppingList) this.empty.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ShoppingList E(ShoppingList shoppingList) {
            Integer nextPage = shoppingList.getNextPage();
            if (nextPage != null) {
                return v(shoppingList, nextPage.intValue(), 0, null, null, 0, null, true, null, 190, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ShoppingList w(ShoppingList shoppingList) {
            return v(shoppingList, 0, 0, CollectionsKt.m(), null, 0, null, false, null, 251, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShoppingList(int i10, int i11, List<ProductFullDetails> products, Integer num, int i12, Integer num2, boolean z10, Throwable th2) {
            super(i10, i11, products, null, null, 0, false, null, null, null, 1016, null);
            Intrinsics.j(products, "products");
            this.page = i10;
            this.perPage = i11;
            this.products = products;
            this.totalCount = num;
            this.totalPages = i12;
            this.nextPage = num2;
            this.isPending = z10;
            this.error = th2;
            this.next = LazyKt.b(new Function0() { // from class: Qo.H
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.ShoppingList.E(this.f31068a);
                }
            });
            this.empty = LazyKt.b(new Function0() { // from class: Qo.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.ShoppingList.w(this.f31069a);
                }
            });
            this.reload = LazyKt.b(new Function0() { // from class: Qo.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.ShoppingList.G(this.f31070a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001JW\u0010\f\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0018\u00010\bj\u0004\u0018\u0001`\nH&¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R6\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0002\u0018\u00010\bj\u0004\u0018\u0001`\n8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"LQo/l$k;", "Landroid/os/Parcelable;", "", "LQo/g;", "sorts", "LQo/a;", "facets", "selectedSort", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "x0", "(Ljava/util/List;Ljava/util/List;LQo/g;Ljava/util/Map;)LQo/l$k;", "u3", "()Ljava/util/List;", "c1", "N1", "()LQo/g;", "q1", "(LQo/g;)V", "F3", "()Ljava/util/Map;", "n0", "(Ljava/util/Map;)V", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface k extends Parcelable {
        Map<FilterFacet, List<FilterFacetOption>> F3();

        /* renamed from: N1 */
        FilterSortOption getSelectedSort();

        List<FilterFacet> c1();

        void n0(Map<FilterFacet, List<FilterFacetOption>> map);

        void q1(FilterSortOption filterSortOption);

        List<FilterSortOption> u3();

        k x0(List<FilterSortOption> sorts, List<FilterFacet> facets, FilterSortOption selectedSort, Map<FilterFacet, List<FilterFacetOption>> selectedFacets);
    }

    public /* synthetic */ l(int i10, int i11, List list, String str, Integer num, int i12, boolean z10, Integer num2, Cursor cursor, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, str, num, i12, z10, num2, cursor, th2);
    }

    public abstract l a();

    public abstract l c();

    public abstract l g();

    public abstract l o(boolean isPending);

    private l(int i10, int i11, List<ProductFullDetails> list, String str, Integer num, int i12, boolean z10, Integer num2, Cursor cursor, Throwable th2) {
        this.page = i10;
        this.perPage = i11;
        this.products = list;
        this.continuationToken = str;
        this.totalCount = num;
        this.totalPages = i12;
        this.isPending = z10;
        this.nextPage = num2;
        this.cursor = cursor;
        this.error = th2;
    }

    /* renamed from: b, reason: from getter */
    public Throwable getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public Integer getNextPage() {
        return this.nextPage;
    }

    /* renamed from: e, reason: from getter */
    public int getPage() {
        return this.page;
    }

    public List<ProductFullDetails> f() {
        return this.products;
    }

    /* renamed from: h, reason: from getter */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: i, reason: from getter */
    public int getTotalPages() {
        return this.totalPages;
    }

    /* renamed from: k, reason: from getter */
    public boolean getIsPending() {
        return this.isPending;
    }

    public final boolean j() {
        if (getError() != null) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        return Intrinsics.e(this, g());
    }

    public /* synthetic */ l(int i10, int i11, List list, String str, Integer num, int i12, boolean z10, Integer num2, Cursor cursor, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? 1 : i12, (i13 & 64) != 0 ? true : z10, (i13 & 128) != 0 ? null : num2, (i13 & 256) != 0 ? null : cursor, (i13 & 512) != 0 ? null : th2, null);
    }
}

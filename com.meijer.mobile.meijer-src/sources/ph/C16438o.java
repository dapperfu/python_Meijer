package ph;

import com.launchdarkly.sdk.AttributeRef;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ph.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16438o {

    /* renamed from: a, reason: collision with root package name */
    final boolean f156542a;

    /* renamed from: b, reason: collision with root package name */
    final int f156543b;

    /* renamed from: c, reason: collision with root package name */
    final long f156544c;

    /* renamed from: d, reason: collision with root package name */
    final C16431h f156545d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC16436m f156546e;

    /* renamed from: f, reason: collision with root package name */
    final int f156547f;

    /* renamed from: g, reason: collision with root package name */
    final URI f156548g;

    /* renamed from: h, reason: collision with root package name */
    final long f156549h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f156550i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f156551j;

    /* renamed from: k, reason: collision with root package name */
    final List<AttributeRef> f156552k;

    public C16438o(boolean z10, int i10, InterfaceC16433j interfaceC16433j, long j10, C16431h c16431h, InterfaceC16436m interfaceC16436m, int i11, URI uri, long j11, boolean z11, boolean z12, Collection<AttributeRef> collection) {
        List<AttributeRef> arrayList;
        this.f156542a = z10;
        this.f156543b = i10 < 0 ? 1 : i10;
        this.f156544c = j10;
        this.f156545d = c16431h;
        this.f156546e = interfaceC16436m;
        this.f156547f = i11 < 0 ? 5 : i11;
        this.f156548g = uri;
        this.f156549h = j11;
        this.f156550i = z11;
        this.f156551j = z12;
        if (collection == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList<>(collection);
        }
        this.f156552k = arrayList;
    }
}

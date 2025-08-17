package oh;

import com.launchdarkly.sdk.AttributeRef;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: oh.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16073o {

    /* renamed from: a, reason: collision with root package name */
    final boolean f153782a;

    /* renamed from: b, reason: collision with root package name */
    final int f153783b;

    /* renamed from: c, reason: collision with root package name */
    final long f153784c;

    /* renamed from: d, reason: collision with root package name */
    final C16066h f153785d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC16071m f153786e;

    /* renamed from: f, reason: collision with root package name */
    final int f153787f;

    /* renamed from: g, reason: collision with root package name */
    final URI f153788g;

    /* renamed from: h, reason: collision with root package name */
    final long f153789h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f153790i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f153791j;

    /* renamed from: k, reason: collision with root package name */
    final List<AttributeRef> f153792k;

    public C16073o(boolean z10, int i10, InterfaceC16068j interfaceC16068j, long j10, C16066h c16066h, InterfaceC16071m interfaceC16071m, int i11, URI uri, long j11, boolean z11, boolean z12, Collection<AttributeRef> collection) {
        List<AttributeRef> arrayList;
        this.f153782a = z10;
        this.f153783b = i10 < 0 ? 1 : i10;
        this.f153784c = j10;
        this.f153785d = c16066h;
        this.f153786e = interfaceC16071m;
        this.f153787f = i11 < 0 ? 5 : i11;
        this.f153788g = uri;
        this.f153789h = j11;
        this.f153790i = z11;
        this.f153791j = z12;
        if (collection == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList<>(collection);
        }
        this.f153792k = arrayList;
    }
}

package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Li4/s;", "Li4/q;", "Li4/r;", "Li4/C;", "provider", "", "startDestination", PlaceTypes.ROUTE, "<init>", "(Li4/C;Ljava/lang/String;Ljava/lang/String;)V", "Li4/p;", "D", "navDestination", "", "e", "(Li4/q;)V", "destination", "c", "(Li4/p;)V", "d", "()Li4/r;", "h", "Li4/C;", "f", "()Li4/C;", "", "i", "I", "startDestinationId", "j", "Ljava/lang/String;", "startDestinationRoute", "", "k", "Ljava/util/List;", "destinations", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14675s extends C14673q<C14674r> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C14654C provider;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int startDestinationId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<C14672p> destinations;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14675s(C14654C provider, String startDestination, String str) {
        super(provider.d(C14676t.class), str);
        Intrinsics.j(provider, "provider");
        Intrinsics.j(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }

    public final void c(C14672p destination) {
        Intrinsics.j(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends C14672p> void e(C14673q<? extends D> navDestination) {
        Intrinsics.j(navDestination, "navDestination");
        this.destinations.add(navDestination.a());
    }

    /* renamed from: f, reason: from getter */
    public final C14654C getProvider() {
        return this.provider;
    }

    @Override // kotlin.C14673q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C14674r a() {
        C14674r c14674r = (C14674r) super.a();
        c14674r.I(this.destinations);
        int i10 = this.startDestinationId;
        if (i10 == 0 && this.startDestinationRoute == null) {
            if (getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            Intrinsics.g(str);
            c14674r.V(str);
            return c14674r;
        }
        c14674r.U(i10);
        return c14674r;
    }
}

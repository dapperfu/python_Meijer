package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u0006)"}, d2 = {"Li4/n;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li4/k;", "navController", "(Li4/k;)V", "", "destId", "Li4/p;", "d", "(I)Li4/p;", "", "h", "()V", "c", "Landroid/os/Bundle;", "args", "f", "(ILandroid/os/Bundle;)Li4/n;", "a", "e", "(Landroid/os/Bundle;)Li4/n;", "Landroidx/core/app/y;", "b", "()Landroidx/core/app/y;", "Landroid/content/Context;", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "Li4/r;", "Li4/r;", "graph", "", "Li4/n$a;", "Ljava/util/List;", "destinations", "Landroid/os/Bundle;", "globalArgs", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14673n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Intent intent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C14677r graph;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<a> destinations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Bundle globalArgs;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Li4/n$a;", "", "", "destinationId", "Landroid/os/Bundle;", "arguments", "<init>", "(ILandroid/os/Bundle;)V", "a", "I", "b", "()I", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int destinationId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Bundle arguments;

        /* renamed from: a, reason: from getter */
        public final Bundle getArguments() {
            return this.arguments;
        }

        /* renamed from: b, reason: from getter */
        public final int getDestinationId() {
            return this.destinationId;
        }

        public a(int i10, Bundle bundle) {
            this.destinationId = i10;
            this.arguments = bundle;
        }
    }

    public C14673n(Context context) {
        Intent launchIntentForPackage;
        Intrinsics.j(context, "context");
        this.context = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.intent = launchIntentForPackage;
        this.destinations = new ArrayList();
    }

    private final void c() throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        C14675p c14675p = null;
        for (a aVar : this.destinations) {
            int destinationId = aVar.getDestinationId();
            Bundle arguments = aVar.getArguments();
            C14675p c14675pD = d(destinationId);
            if (c14675pD == null) {
                throw new IllegalArgumentException("Navigation destination " + C14675p.INSTANCE.b(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
            for (int i10 : c14675pD.o(c14675p)) {
                arrayList.add(Integer.valueOf(i10));
                arrayList2.add(arguments);
            }
            c14675p = c14675pD;
        }
        this.intent.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt.i1(arrayList));
        this.intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    private final C14675p d(int destId) {
        ArrayDeque arrayDeque = new ArrayDeque();
        C14677r c14677r = this.graph;
        Intrinsics.g(c14677r);
        arrayDeque.add(c14677r);
        while (!arrayDeque.isEmpty()) {
            C14675p c14675p = (C14675p) arrayDeque.removeFirst();
            if (c14675p.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() == destId) {
                return c14675p;
            }
            if (c14675p instanceof C14677r) {
                Iterator<C14675p> it = ((C14677r) c14675p).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ C14673n g(C14673n c14673n, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return c14673n.f(i10, bundle);
    }

    private final void h() throws Resources.NotFoundException {
        Iterator<a> it = this.destinations.iterator();
        while (it.hasNext()) {
            int destinationId = it.next().getDestinationId();
            if (d(destinationId) == null) {
                throw new IllegalArgumentException("Navigation destination " + C14675p.INSTANCE.b(this.context, destinationId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    @JvmOverloads
    public final C14673n a(int destId, Bundle args) throws Resources.NotFoundException {
        this.destinations.add(new a(destId, args));
        if (this.graph != null) {
            h();
        }
        return this;
    }

    public final y b() throws Resources.NotFoundException {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (this.destinations.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        c();
        y yVarE = y.k(this.context).e(new Intent(this.intent));
        Intrinsics.i(yVarE, "create(context)\n        …rentStack(Intent(intent))");
        int iM = yVarE.m();
        for (int i10 = 0; i10 < iM; i10++) {
            Intent intentL = yVarE.l(i10);
            if (intentL != null) {
                intentL.putExtra("android-support-nav:controller:deepLinkIntent", this.intent);
            }
        }
        return yVarE;
    }

    public final C14673n e(Bundle args) {
        this.globalArgs = args;
        this.intent.putExtra("android-support-nav:controller:deepLinkExtras", args);
        return this;
    }

    @JvmOverloads
    public final C14673n f(int destId, Bundle args) throws Resources.NotFoundException {
        this.destinations.clear();
        this.destinations.add(new a(destId, args));
        if (this.graph != null) {
            h();
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14673n(C14670k navController) {
        this(navController.getContext());
        Intrinsics.j(navController, "navController");
        this.graph = navController.G();
    }
}

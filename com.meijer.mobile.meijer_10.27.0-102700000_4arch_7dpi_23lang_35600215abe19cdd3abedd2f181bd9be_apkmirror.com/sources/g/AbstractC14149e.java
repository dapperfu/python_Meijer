package g;

import android.content.Intent;
import android.os.Bundle;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import com.fullstory.FS;
import h.AbstractC14314a;
import j2.C14834b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b&\u0018\u0000 \u00122\u00020\u0001:\u00037:=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00108R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010E\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010D¨\u0006F"}, d2 = {"Lg/e;", "", "<init>", "()V", "O", "", "key", "", "resultCode", "Landroid/content/Intent;", "data", "Lg/e$a;", "callbackAndContract", "", "g", "(Ljava/lang/String;ILandroid/content/Intent;Lg/e$a;)V", "o", "(Ljava/lang/String;)V", "h", "()I", "rc", "d", "(ILjava/lang/String;)V", "I", "requestCode", "Lh/a;", "contract", "input", "Landroidx/core/app/d;", "options", "i", "(ILh/a;Ljava/lang/Object;Landroidx/core/app/d;)V", "Landroidx/lifecycle/s;", "lifecycleOwner", "Lg/b;", "callback", "Lg/c;", "l", "(Ljava/lang/String;Landroidx/lifecycle/s;Lh/a;Lg/b;)Lg/c;", "m", "(Ljava/lang/String;Lh/a;Lg/b;)Lg/c;", "p", "Landroid/os/Bundle;", "outState", "k", "(Landroid/os/Bundle;)V", "savedInstanceState", "j", "", "e", "(IILandroid/content/Intent;)Z", "result", "f", "(ILjava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Lg/e$c;", "c", "keyToLifecycleContainers", "", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14149e {

    /* renamed from: h, reason: collision with root package name */
    private static final b f132436h = new b(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> launchedKeys = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bundle pendingResults = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg/e$a;", "O", "", "Lg/b;", "callback", "Lh/a;", "contract", "<init>", "(Lg/b;Lh/a;)V", "a", "Lg/b;", "()Lg/b;", "b", "Lh/a;", "()Lh/a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$a */
    private static final class a<O> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC14146b<O> callback;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC14314a<?, O> contract;

        public a(InterfaceC14146b<O> callback, AbstractC14314a<?, O> contract) {
            Intrinsics.j(callback, "callback");
            Intrinsics.j(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        public final InterfaceC14146b<O> a() {
            return this.callback;
        }

        public final AbstractC14314a<?, O> b() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lg/e$b;", "", "<init>", "()V", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg/e$c;", "", "Landroidx/lifecycle/l;", "lifecycle", "<init>", "(Landroidx/lifecycle/l;)V", "Landroidx/lifecycle/p;", "observer", "", "a", "(Landroidx/lifecycle/p;)V", "b", "()V", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "", "Ljava/util/List;", "observers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: g.e$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC6023l lifecycle;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<InterfaceC6027p> observers;

        public c(AbstractC6023l lifecycle) {
            Intrinsics.j(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void a(InterfaceC6027p observer) {
            Intrinsics.j(observer, "observer");
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((InterfaceC6027p) it.next());
            }
            this.observers.clear();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g.e$d */
    static final class d extends Lambda implements Function0<Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f132448f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Random.INSTANCE.g(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g/e$e", "Lg/c;", "input", "Landroidx/core/app/d;", "options", "", "b", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "c", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$e, reason: collision with other inner class name */
    public static final class C2087e<I> extends AbstractC14147c<I> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f132450b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14314a<I, O> f132451c;

        C2087e(String str, AbstractC14314a<I, O> abstractC14314a) {
            this.f132450b = str;
            this.f132451c = abstractC14314a;
        }

        @Override // g.AbstractC14147c
        public void b(I input, androidx.core.app.d options) throws Exception {
            Object obj = AbstractC14149e.this.keyToRc.get(this.f132450b);
            Object obj2 = this.f132451c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                AbstractC14149e.this.launchedKeys.add(this.f132450b);
                try {
                    AbstractC14149e.this.i(iIntValue, this.f132451c, input, options);
                    return;
                } catch (Exception e10) {
                    AbstractC14149e.this.launchedKeys.remove(this.f132450b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.AbstractC14147c
        public void c() {
            AbstractC14149e.this.p(this.f132450b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"g/e$f", "Lg/c;", "input", "Landroidx/core/app/d;", "options", "", "b", "(Ljava/lang/Object;Landroidx/core/app/d;)V", "c", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.e$f */
    public static final class f<I> extends AbstractC14147c<I> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f132453b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14314a<I, O> f132454c;

        f(String str, AbstractC14314a<I, O> abstractC14314a) {
            this.f132453b = str;
            this.f132454c = abstractC14314a;
        }

        @Override // g.AbstractC14147c
        public void b(I input, androidx.core.app.d options) throws Exception {
            Object obj = AbstractC14149e.this.keyToRc.get(this.f132453b);
            Object obj2 = this.f132454c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                AbstractC14149e.this.launchedKeys.add(this.f132453b);
                try {
                    AbstractC14149e.this.i(iIntValue, this.f132454c, input, options);
                    return;
                } catch (Exception e10) {
                    AbstractC14149e.this.launchedKeys.remove(this.f132453b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.AbstractC14147c
        public void c() {
            AbstractC14149e.this.p(this.f132453b);
        }
    }

    public abstract <I, O> void i(int requestCode, AbstractC14314a<I, O> contract, I input, androidx.core.app.d options);

    private final <O> void g(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new C14145a(resultCode, data));
        } else {
            callbackAndContract.a().a(callbackAndContract.b().c(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int h() {
        for (Number number : SequencesKt.r(d.f132448f)) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AbstractC14149e abstractC14149e, String str, InterfaceC14146b interfaceC14146b, AbstractC14314a abstractC14314a, InterfaceC6030s interfaceC6030s, AbstractC6023l.a event) {
        Intrinsics.j(interfaceC6030s, "<anonymous parameter 0>");
        Intrinsics.j(event, "event");
        if (AbstractC6023l.a.ON_START != event) {
            if (AbstractC6023l.a.ON_STOP == event) {
                abstractC14149e.keyToCallback.remove(str);
                return;
            } else {
                if (AbstractC6023l.a.ON_DESTROY == event) {
                    abstractC14149e.p(str);
                    return;
                }
                return;
            }
        }
        abstractC14149e.keyToCallback.put(str, new a<>(interfaceC14146b, abstractC14314a));
        if (abstractC14149e.parsedPendingResults.containsKey(str)) {
            Object obj = abstractC14149e.parsedPendingResults.get(str);
            abstractC14149e.parsedPendingResults.remove(str);
            interfaceC14146b.a(obj);
        }
        C14145a c14145a = (C14145a) C14834b.a(abstractC14149e.pendingResults, str, C14145a.class);
        if (c14145a != null) {
            abstractC14149e.pendingResults.remove(str);
            interfaceC14146b.a(abstractC14314a.c(c14145a.getResultCode(), c14145a.getData()));
        }
    }

    private final void o(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        d(h(), key);
    }

    public final boolean e(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        g(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean f(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        InterfaceC14146b<?> interfaceC14146bA = aVar.a();
        Intrinsics.h(interfaceC14146bA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        interfaceC14146bA.a(result);
        return true;
    }

    public final void j(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    TypeIntrinsics.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            Intrinsics.i(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            Intrinsics.i(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.j(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    public final <I, O> AbstractC14147c<I> l(final String key, InterfaceC6030s lifecycleOwner, final AbstractC14314a<I, O> contract, final InterfaceC14146b<O> callback) {
        Intrinsics.j(key, "key");
        Intrinsics.j(lifecycleOwner, "lifecycleOwner");
        Intrinsics.j(contract, "contract");
        Intrinsics.j(callback, "callback");
        AbstractC6023l lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().b(AbstractC6023l.b.f55278d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC6027p() { // from class: g.d
            @Override // androidx.view.InterfaceC6027p
            public final void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
                AbstractC14149e.n(this.f132432a, key, callback, contract, interfaceC6030s, aVar);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new C2087e(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> AbstractC14147c<I> m(String key, AbstractC14314a<I, O> contract, InterfaceC14146b<O> callback) {
        Intrinsics.j(key, "key");
        Intrinsics.j(contract, "contract");
        Intrinsics.j(callback, "callback");
        o(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.a(obj);
        }
        C14145a c14145a = (C14145a) C14834b.a(this.pendingResults, key, C14145a.class);
        if (c14145a != null) {
            this.pendingResults.remove(key);
            callback.a(contract.c(c14145a.getResultCode(), c14145a.getData()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer numRemove;
        Intrinsics.j(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            FS.log_w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            FS.log_w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C14145a) C14834b.a(this.pendingResults, key, C14145a.class)));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }

    private final void d(int rc2, String key) {
        this.rcToKey.put(Integer.valueOf(rc2), key);
        this.keyToRc.put(key, Integer.valueOf(rc2));
    }
}

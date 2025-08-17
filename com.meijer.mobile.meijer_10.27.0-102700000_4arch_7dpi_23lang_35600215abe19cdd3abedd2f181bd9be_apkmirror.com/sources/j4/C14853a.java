package j4;

import androidx.view.C5996L;
import androidx.view.c0;
import io.constructor.data.local.PreferencesHelper;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lj4/a;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/L;", "handle", "<init>", "(Landroidx/lifecycle/L;)V", "", "onCleared", "()V", "", "a", "Ljava/lang/String;", "IdKey", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "m", "()Ljava/util/UUID;", PreferencesHelper.PREF_ID, "Ljava/lang/ref/WeakReference;", "LL0/e;", "c", "Ljava/lang/ref/WeakReference;", "n", "()Ljava/lang/ref/WeakReference;", "o", "(Ljava/lang/ref/WeakReference;)V", "saveableStateHolderRef", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14853a extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String IdKey = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public WeakReference<L0.e> saveableStateHolderRef;

    /* renamed from: m, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    public final WeakReference<L0.e> n() {
        WeakReference<L0.e> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.y("saveableStateHolderRef");
        return null;
    }

    public final void o(WeakReference<L0.e> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }

    public C14853a(C5996L c5996l) {
        UUID uuidRandomUUID = (UUID) c5996l.b("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            c5996l.f("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
        }
        this.id = uuidRandomUUID;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        L0.e eVar = n().get();
        if (eVar != null) {
            eVar.c(this.id);
        }
        n().clear();
    }
}

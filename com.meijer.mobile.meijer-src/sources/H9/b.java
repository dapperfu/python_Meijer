package H9;

import android.content.SharedPreferences;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LH9/b;", "LH9/a;", "", "Landroid/content/SharedPreferences;", "LH9/m;", "key", PlaceTypes.STORE, "<init>", "(LH9/m;Landroid/content/SharedPreferences;)V", "value", "", "d", "(Landroid/content/SharedPreferences;Z)V", "e", "(Landroid/content/SharedPreferences;)Ljava/lang/Boolean;", "f", "(Landroid/content/SharedPreferences;)V", "", "c", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends a<Boolean, SharedPreferences> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m key, SharedPreferences store) {
        super(store);
        Intrinsics.j(key, "key");
        Intrinsics.j(store, "store");
        String key2 = key.getKey();
        Intrinsics.i(key2, "getKey(...)");
        this.key = key2;
    }

    @Override // H9.i
    public /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        d((SharedPreferences) obj, ((Boolean) obj2).booleanValue());
    }

    public void d(SharedPreferences store, boolean value) {
        Intrinsics.j(store, "store");
        store.edit().putBoolean(this.key, value).apply();
    }

    @Override // H9.i
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean b(SharedPreferences store) {
        Intrinsics.j(store, "store");
        return Boolean.valueOf(store.getBoolean(this.key, false));
    }

    @Override // H9.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a(SharedPreferences store) {
        Intrinsics.j(store, "store");
        store.edit().remove(this.key).apply();
    }
}

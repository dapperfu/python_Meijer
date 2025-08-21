package Ln;

import android.content.Context;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LLn/s;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "a", "(Landroid/content/Context;)Lcom/google/android/libraries/places/api/net/PlacesClient;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f19311a = new s();

    public final PlacesClient a(Context context) {
        Intrinsics.j(context, "context");
        Places.initialize(context, context.getString(Y.f100646R6));
        PlacesClient placesClientCreateClient = Places.createClient(context);
        Intrinsics.i(placesClientCreateClient, "createClient(...)");
        return placesClientCreateClient;
    }

    private s() {
    }
}

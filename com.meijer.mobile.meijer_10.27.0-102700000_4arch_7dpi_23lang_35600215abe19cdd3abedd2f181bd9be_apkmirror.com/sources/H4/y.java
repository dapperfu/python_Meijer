package H4;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public View f12262b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f12261a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<AbstractC3664k> f12263c = new ArrayList<>();

    @Deprecated
    public y() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f12262b == yVar.f12262b && this.f12261a.equals(yVar.f12261a);
    }

    public int hashCode() {
        return (this.f12262b.hashCode() * 31) + this.f12261a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f12262b + "\n") + "    values:";
        for (String str2 : this.f12261a.keySet()) {
            str = str + "    " + str2 + ": " + this.f12261a.get(str2) + "\n";
        }
        return str;
    }

    public y(View view) {
        this.f12262b = view;
    }
}

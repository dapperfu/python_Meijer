package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements Iterable<Intent> {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f53853a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final Context f53854b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public void n() {
        o(null);
    }

    public static y k(Context context) {
        return new y(context);
    }

    public y a(Intent intent) {
        this.f53853a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y f(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = k.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f53854b.getPackageManager());
            }
            h(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public y h(ComponentName componentName) {
        int size = this.f53853a.size();
        try {
            Intent intentB = k.b(this.f53854b, componentName);
            while (intentB != null) {
                this.f53853a.add(size, intentB);
                intentB = k.b(this.f53854b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f53853a.iterator();
    }

    public Intent l(int i10) {
        return this.f53853a.get(i10);
    }

    public int m() {
        return this.f53853a.size();
    }

    public void o(Bundle bundle) {
        if (this.f53853a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f53853a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (Z1.b.n(this.f53854b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f53854b.startActivity(intent);
    }

    private y(Context context) {
        this.f53854b = context;
    }

    public y e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f53854b.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        a(intent);
        return this;
    }
}

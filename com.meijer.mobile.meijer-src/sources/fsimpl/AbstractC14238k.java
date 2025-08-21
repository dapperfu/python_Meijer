package fsimpl;

import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC14238k extends CompoundButton {

    /* renamed from: a, reason: collision with root package name */
    static final Field f133604a = fT.a(28, -1, CompoundButton.class, "mButtonDrawable");

    /* renamed from: b, reason: collision with root package name */
    static final Field f133605b = fT.a(28, -1, CompoundButton.class, "mOnCheckedChangeListener");

    public static Drawable a(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static CompoundButton.OnCheckedChangeListener b(CompoundButton compoundButton) {
        Field field = f133605b;
        if (field == null) {
            Log.d("CompoundButtonViolator: mOnCheckedChangeListener field was null");
            return null;
        }
        try {
            return (CompoundButton.OnCheckedChangeListener) field.get(compoundButton);
        } catch (Throwable th2) {
            Log.e("Could not get mOnCheckedChangeListener on given CompoundButton", th2);
            return null;
        }
    }
}

package bf;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes7.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f60169a = new i() { // from class: bf.h
        @Override // bf.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<C6245c<?>> a(ComponentRegistrar componentRegistrar);
}

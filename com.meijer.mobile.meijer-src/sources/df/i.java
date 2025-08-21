package df;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes8.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f128404a = new i() { // from class: df.h
        @Override // df.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<C13676c<?>> a(ComponentRegistrar componentRegistrar);
}

package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f147956c = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private Object[] f147957a;

    /* renamed from: b, reason: collision with root package name */
    private int f147958b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ArrayMapImpl(Object[] objArr, int i10) {
        super(null);
        this.f147957a = objArr;
        this.f147958b = i10;
    }

    private final void k(int i10) {
        Object[] objArr = this.f147957a;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f147957a, length);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        this.f147957a = objArrCopyOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int a() {
        return this.f147958b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void f(int i10, T value) {
        Intrinsics.j(value, "value");
        k(i10);
        if (this.f147957a[i10] == null) {
            this.f147958b = a() + 1;
        }
        this.f147957a[i10] = value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i10) {
        return (T) ArraysKt.o0(this.f147957a, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1

            /* renamed from: c, reason: collision with root package name */
            private int f147959c = -1;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayMapImpl<T> f147960d;

            {
                this.f147960d = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected void a() {
                do {
                    int i10 = this.f147959c + 1;
                    this.f147959c = i10;
                    if (i10 >= ((ArrayMapImpl) this.f147960d).f147957a.length) {
                        break;
                    }
                } while (((ArrayMapImpl) this.f147960d).f147957a[this.f147959c] == null);
                if (this.f147959c >= ((ArrayMapImpl) this.f147960d).f147957a.length) {
                    c();
                    return;
                }
                Object obj = ((ArrayMapImpl) this.f147960d).f147957a[this.f147959c];
                Intrinsics.h(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                d(obj);
            }
        };
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}

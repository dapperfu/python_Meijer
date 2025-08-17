package J2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import o2.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f14547a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f14548a;

        /* renamed from: b, reason: collision with root package name */
        private final d f14549b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14550c = true;

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f14549b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f14549b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f14548a.setFilters(a(this.f14548a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // J2.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f14550c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // J2.f.b
        public boolean b() {
            return this.f14550c;
        }

        @Override // J2.f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // J2.f.b
        void d(boolean z10) {
            this.f14550c = z10;
            l();
            k();
        }

        @Override // J2.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f14550c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f14550c = z10;
        }

        void l() {
            this.f14548a.setTransformationMethod(e(this.f14548a.getTransformationMethod()));
        }

        a(TextView textView) {
            this.f14548a = textView;
            this.f14549b = new d(textView);
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
    }

    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f14551a;

        @Override // J2.f.b
        public boolean b() {
            return this.f14551a.b();
        }

        c(TextView textView) {
            this.f14551a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.k();
        }

        @Override // J2.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            if (f()) {
                return inputFilterArr;
            }
            return this.f14551a.a(inputFilterArr);
        }

        @Override // J2.f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f14551a.c(z10);
        }

        @Override // J2.f.b
        void d(boolean z10) {
            if (f()) {
                this.f14551a.i(z10);
            } else {
                this.f14551a.d(z10);
            }
        }

        @Override // J2.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            if (f()) {
                return transformationMethod;
            }
            return this.f14551a.e(transformationMethod);
        }
    }

    static class b {
        InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        void c(boolean z10) {
            throw null;
        }

        void d(boolean z10) {
            throw null;
        }

        TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }

        b() {
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f14547a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f14547a.b();
    }

    public void c(boolean z10) {
        this.f14547a.c(z10);
    }

    public void d(boolean z10) {
        this.f14547a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f14547a.e(transformationMethod);
    }

    public f(TextView textView, boolean z10) {
        i.h(textView, "textView cannot be null");
        if (!z10) {
            this.f14547a = new c(textView);
        } else {
            this.f14547a = new a(textView);
        }
    }
}

package com.okta.authfoundation;

import Qs.s;
import Z1.b;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.e;
import com.okta.authfoundation.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wv.InterfaceC17929a;
import wv.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/okta/authfoundation/BiometricDecryptionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroidx/biometric/e;", "u1", "()Landroidx/biometric/e;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "finish", "r", "a", "b", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricDecryptionActivity extends AppCompatActivity {

    /* renamed from: s, reason: collision with root package name */
    private static e.d f120575s;

    /* renamed from: t, reason: collision with root package name */
    private static a f120576t;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: u, reason: collision with root package name */
    private static final InterfaceC17929a f120577u = g.b(false, 1, null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\b\u0006J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/okta/authfoundation/BiometricDecryptionActivity$a;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "a", "(Ljava/lang/Exception;)V", "b", "Lcom/okta/authfoundation/BiometricDecryptionActivity$a$a;", "Lcom/okta/authfoundation/BiometricDecryptionActivity$a$b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/okta/authfoundation/BiometricDecryptionActivity$a$a;", "Lcom/okta/authfoundation/BiometricDecryptionActivity$a;", "Ljavax/crypto/Cipher;", "cipher", "", "encryptedData", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Ljavax/crypto/Cipher;[BLkotlin/coroutines/Continuation;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "a", "(Ljava/lang/Exception;)V", "Ljavax/crypto/Cipher;", "b", "()Ljavax/crypto/Cipher;", "[B", "d", "()[B", "c", "Lkotlin/coroutines/Continuation;", "()Lkotlin/coroutines/Continuation;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.okta.authfoundation.BiometricDecryptionActivity$a$a, reason: collision with other inner class name */
        public static final class C1969a implements a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Cipher cipher;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final byte[] encryptedData;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Continuation<byte[]> continuation;

            /* JADX WARN: Multi-variable type inference failed */
            public C1969a(Cipher cipher, byte[] encryptedData, Continuation<? super byte[]> continuation) {
                Intrinsics.j(cipher, "cipher");
                Intrinsics.j(encryptedData, "encryptedData");
                Intrinsics.j(continuation, "continuation");
                this.cipher = cipher;
                this.encryptedData = encryptedData;
                this.continuation = continuation;
            }

            @Override // com.okta.authfoundation.BiometricDecryptionActivity.a
            public void a(Exception exception) {
                Intrinsics.j(exception, "exception");
                Continuation<byte[]> continuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(ResultKt.a(exception)));
            }

            /* renamed from: b, reason: from getter */
            public final Cipher getCipher() {
                return this.cipher;
            }

            public final Continuation<byte[]> c() {
                return this.continuation;
            }

            /* renamed from: d, reason: from getter */
            public final byte[] getEncryptedData() {
                return this.encryptedData;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/okta/authfoundation/BiometricDecryptionActivity$a$b;", "Lcom/okta/authfoundation/BiometricDecryptionActivity$a;", "Lkotlin/coroutines/Continuation;", "", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "a", "(Ljava/lang/Exception;)V", "Lkotlin/coroutines/Continuation;", "b", "()Lkotlin/coroutines/Continuation;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Continuation<Unit> continuation;

            /* JADX WARN: Multi-variable type inference failed */
            public b(Continuation<? super Unit> continuation) {
                Intrinsics.j(continuation, "continuation");
                this.continuation = continuation;
            }

            @Override // com.okta.authfoundation.BiometricDecryptionActivity.a
            public void a(Exception exception) {
                Intrinsics.j(exception, "exception");
                Continuation<Unit> continuation = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(ResultKt.a(exception)));
            }

            public final Continuation<Unit> b() {
                return this.continuation;
            }
        }

        void a(Exception exception);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/okta/authfoundation/BiometricDecryptionActivity$b;", "", "<init>", "()V", "", "d", "Landroidx/biometric/e$d;", "promptInfo", "c", "(Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljavax/crypto/Cipher;", "cipher", "", "encryptedData", "b", "(Ljavax/crypto/Cipher;[BLandroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/biometric/e$d;", "Lcom/okta/authfoundation/BiometricDecryptionActivity$a;", "biometricAction", "Lcom/okta/authfoundation/BiometricDecryptionActivity$a;", "Lwv/a;", "accessMutex", "Lwv/a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.okta.authfoundation.BiometricDecryptionActivity$b, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.BiometricDecryptionActivity$Companion", f = "BiometricDecryptionActivity.kt", l = {197, HttpResponseStatus.SUCCESS_OK}, m = "biometricDecrypt$auth_foundation_release")
        /* renamed from: com.okta.authfoundation.BiometricDecryptionActivity$b$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f120582a;

            /* renamed from: b, reason: collision with root package name */
            Object f120583b;

            /* renamed from: c, reason: collision with root package name */
            Object f120584c;

            /* renamed from: d, reason: collision with root package name */
            Object f120585d;

            /* renamed from: e, reason: collision with root package name */
            Object f120586e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f120587f;

            /* renamed from: h, reason: collision with root package name */
            int f120589h;

            a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f120587f = obj;
                this.f120589h |= Integer.MIN_VALUE;
                return Companion.this.b(null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.okta.authfoundation.BiometricDecryptionActivity$Companion", f = "BiometricDecryptionActivity.kt", l = {197, HttpResponseStatus.SUCCESS_OK}, m = "biometricUnlock$auth_foundation_release")
        /* renamed from: com.okta.authfoundation.BiometricDecryptionActivity$b$b, reason: collision with other inner class name */
        static final class C1970b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f120590a;

            /* renamed from: b, reason: collision with root package name */
            Object f120591b;

            /* renamed from: c, reason: collision with root package name */
            Object f120592c;

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f120593d;

            /* renamed from: f, reason: collision with root package name */
            int f120595f;

            C1970b(Continuation<? super C1970b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f120593d = obj;
                this.f120595f |= Integer.MIN_VALUE;
                return Companion.this.c(null, this);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d() {
            Intent intent = new Intent();
            Ss.a aVar = Ss.a.f35759a;
            intent.setClass(aVar.a(), BiometricDecryptionActivity.class);
            intent.setAction(BiometricDecryptionActivity.class.getName());
            intent.setFlags(276824064);
            aVar.a().startActivity(intent);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(javax.crypto.Cipher r8, byte[] r9, androidx.biometric.e.d r10, kotlin.coroutines.Continuation<? super byte[]> r11) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r11 instanceof com.okta.authfoundation.BiometricDecryptionActivity.Companion.a
                if (r0 == 0) goto L13
                r0 = r11
                com.okta.authfoundation.BiometricDecryptionActivity$b$a r0 = (com.okta.authfoundation.BiometricDecryptionActivity.Companion.a) r0
                int r1 = r0.f120589h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f120589h = r1
                goto L18
            L13:
                com.okta.authfoundation.BiometricDecryptionActivity$b$a r0 = new com.okta.authfoundation.BiometricDecryptionActivity$b$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f120587f
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f120589h
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L64
                if (r2 == r4) goto L4d
                if (r2 != r3) goto L45
                java.lang.Object r8 = r0.f120586e
                com.okta.authfoundation.BiometricDecryptionActivity$b$a r8 = (com.okta.authfoundation.BiometricDecryptionActivity.Companion.a) r8
                java.lang.Object r8 = r0.f120585d
                wv.a r8 = (wv.InterfaceC17929a) r8
                java.lang.Object r9 = r0.f120584c
                androidx.biometric.e$d r9 = (androidx.biometric.e.d) r9
                java.lang.Object r9 = r0.f120583b
                byte[] r9 = (byte[]) r9
                java.lang.Object r9 = r0.f120582a
                javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L42
                goto Lbb
            L42:
                r9 = move-exception
                goto Lc1
            L45:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L4d:
                java.lang.Object r8 = r0.f120585d
                wv.a r8 = (wv.InterfaceC17929a) r8
                java.lang.Object r9 = r0.f120584c
                r10 = r9
                androidx.biometric.e$d r10 = (androidx.biometric.e.d) r10
                java.lang.Object r9 = r0.f120583b
                byte[] r9 = (byte[]) r9
                java.lang.Object r2 = r0.f120582a
                javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
                kotlin.ResultKt.b(r11)
                r11 = r8
                r8 = r2
                goto L7c
            L64:
                kotlin.ResultKt.b(r11)
                wv.a r11 = com.okta.authfoundation.BiometricDecryptionActivity.q1()
                r0.f120582a = r8
                r0.f120583b = r9
                r0.f120584c = r10
                r0.f120585d = r11
                r0.f120589h = r4
                java.lang.Object r2 = r11.g(r5, r0)
                if (r2 != r1) goto L7c
                goto Lb7
            L7c:
                r0.f120582a = r8     // Catch: java.lang.Throwable -> Lb2
                r0.f120583b = r9     // Catch: java.lang.Throwable -> Lb2
                r0.f120584c = r10     // Catch: java.lang.Throwable -> Lb2
                r0.f120585d = r11     // Catch: java.lang.Throwable -> Lb2
                r0.f120586e = r0     // Catch: java.lang.Throwable -> Lb2
                r0.f120589h = r3     // Catch: java.lang.Throwable -> Lb2
                mv.p r2 = new mv.p     // Catch: java.lang.Throwable -> Lb2
                kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch: java.lang.Throwable -> Lb2
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lb2
                r2.C()     // Catch: java.lang.Throwable -> Lb2
                com.okta.authfoundation.BiometricDecryptionActivity.t1(r10)     // Catch: java.lang.Throwable -> Lb2
                com.okta.authfoundation.BiometricDecryptionActivity$a$a r10 = new com.okta.authfoundation.BiometricDecryptionActivity$a$a     // Catch: java.lang.Throwable -> Lb2
                r10.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> Lb2
                com.okta.authfoundation.BiometricDecryptionActivity.s1(r10)     // Catch: java.lang.Throwable -> Lb2
                com.okta.authfoundation.BiometricDecryptionActivity$b r8 = com.okta.authfoundation.BiometricDecryptionActivity.INSTANCE     // Catch: java.lang.Throwable -> Lb2
                a(r8)     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r8 = r2.u()     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch: java.lang.Throwable -> Lb2
                if (r8 != r9) goto Lb5
                kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch: java.lang.Throwable -> Lb2
                goto Lb5
            Lb2:
                r9 = move-exception
                r8 = r11
                goto Lc1
            Lb5:
                if (r8 != r1) goto Lb8
            Lb7:
                return r1
            Lb8:
                r6 = r11
                r11 = r8
                r8 = r6
            Lbb:
                byte[] r11 = (byte[]) r11     // Catch: java.lang.Throwable -> L42
                r8.h(r5)
                return r11
            Lc1:
                r8.h(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.BiometricDecryptionActivity.Companion.b(javax.crypto.Cipher, byte[], androidx.biometric.e$d, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(androidx.biometric.e.d r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.okta.authfoundation.BiometricDecryptionActivity.Companion.C1970b
                if (r0 == 0) goto L13
                r0 = r9
                com.okta.authfoundation.BiometricDecryptionActivity$b$b r0 = (com.okta.authfoundation.BiometricDecryptionActivity.Companion.C1970b) r0
                int r1 = r0.f120595f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f120595f = r1
                goto L18
            L13:
                com.okta.authfoundation.BiometricDecryptionActivity$b$b r0 = new com.okta.authfoundation.BiometricDecryptionActivity$b$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f120593d
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f120595f
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L53
                if (r2 == r4) goto L45
                if (r2 != r3) goto L3d
                java.lang.Object r8 = r0.f120592c
                com.okta.authfoundation.BiometricDecryptionActivity$b$b r8 = (com.okta.authfoundation.BiometricDecryptionActivity.Companion.C1970b) r8
                java.lang.Object r8 = r0.f120591b
                wv.a r8 = (wv.InterfaceC17929a) r8
                java.lang.Object r0 = r0.f120590a
                androidx.biometric.e$d r0 = (androidx.biometric.e.d) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L3a
                goto La2
            L3a:
                r9 = move-exception
                goto La8
            L3d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L45:
                java.lang.Object r8 = r0.f120591b
                wv.a r8 = (wv.InterfaceC17929a) r8
                java.lang.Object r2 = r0.f120590a
                androidx.biometric.e$d r2 = (androidx.biometric.e.d) r2
                kotlin.ResultKt.b(r9)
                r9 = r8
                r8 = r2
                goto L67
            L53:
                kotlin.ResultKt.b(r9)
                wv.a r9 = com.okta.authfoundation.BiometricDecryptionActivity.q1()
                r0.f120590a = r8
                r0.f120591b = r9
                r0.f120595f = r4
                java.lang.Object r2 = r9.g(r5, r0)
                if (r2 != r1) goto L67
                goto La0
            L67:
                r0.f120590a = r8     // Catch: java.lang.Throwable -> L99
                r0.f120591b = r9     // Catch: java.lang.Throwable -> L99
                r0.f120592c = r0     // Catch: java.lang.Throwable -> L99
                r0.f120595f = r3     // Catch: java.lang.Throwable -> L99
                mv.p r2 = new mv.p     // Catch: java.lang.Throwable -> L99
                kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch: java.lang.Throwable -> L99
                r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L99
                r2.C()     // Catch: java.lang.Throwable -> L99
                com.okta.authfoundation.BiometricDecryptionActivity.t1(r8)     // Catch: java.lang.Throwable -> L99
                com.okta.authfoundation.BiometricDecryptionActivity$a$b r8 = new com.okta.authfoundation.BiometricDecryptionActivity$a$b     // Catch: java.lang.Throwable -> L99
                r8.<init>(r2)     // Catch: java.lang.Throwable -> L99
                com.okta.authfoundation.BiometricDecryptionActivity.s1(r8)     // Catch: java.lang.Throwable -> L99
                com.okta.authfoundation.BiometricDecryptionActivity$b r8 = com.okta.authfoundation.BiometricDecryptionActivity.INSTANCE     // Catch: java.lang.Throwable -> L99
                a(r8)     // Catch: java.lang.Throwable -> L99
                java.lang.Object r8 = r2.u()     // Catch: java.lang.Throwable -> L99
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch: java.lang.Throwable -> L99
                if (r8 != r2) goto L9e
                kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch: java.lang.Throwable -> L99
                goto L9e
            L99:
                r8 = move-exception
                r6 = r9
                r9 = r8
                r8 = r6
                goto La8
            L9e:
                if (r8 != r1) goto La1
            La0:
                return r1
            La1:
                r8 = r9
            La2:
                kotlin.Unit r9 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L3a
                r8.h(r5)
                return r9
            La8:
                r8.h(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.okta.authfoundation.BiometricDecryptionActivity.Companion.c(androidx.biometric.e$d, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/okta/authfoundation/BiometricDecryptionActivity$c", "Landroidx/biometric/e$a;", "", "errorCode", "", "errString", "", "a", "(ILjava/lang/CharSequence;)V", "Landroidx/biometric/e$b;", "result", "c", "(Landroidx/biometric/e$b;)V", "b", "()V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends e.a {
        c() {
        }

        @Override // androidx.biometric.e.a
        public void a(int errorCode, CharSequence errString) {
            Intrinsics.j(errString, "errString");
            a aVar = BiometricDecryptionActivity.f120576t;
            if (aVar == null) {
                Intrinsics.x("biometricAction");
                aVar = null;
            }
            aVar.a(new BiometricAuthenticationException("Failed biometric authentication with errorCode: " + errorCode + ", and errString: " + ((Object) errString), new a.OnAuthenticationError(errorCode, errString)));
            BiometricDecryptionActivity.this.finish();
        }

        @Override // androidx.biometric.e.a
        public void c(e.b result) {
            Cipher cipherA;
            Intrinsics.j(result, "result");
            a aVar = BiometricDecryptionActivity.f120576t;
            if (aVar == null) {
                Intrinsics.x("biometricAction");
                aVar = null;
            }
            if (aVar instanceof a.b) {
                Continuation<Unit> continuationB = ((a.b) aVar).b();
                Result.Companion companion = Result.INSTANCE;
                continuationB.resumeWith(Result.b(Unit.f143329a));
            } else {
                if (!(aVar instanceof a.C1969a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e.c cVarB = result.b();
                if (cVarB == null || (cipherA = cVarB.a()) == null) {
                    ((a.C1969a) aVar).a(new IllegalStateException("Biometric prompt onAuthenticationSucceeded called without crypto object"));
                } else {
                    a.C1969a c1969a = (a.C1969a) aVar;
                    c1969a.c().resumeWith(Result.b(cipherA.doFinal(c1969a.getEncryptedData())));
                }
            }
            BiometricDecryptionActivity.this.finish();
        }

        @Override // androidx.biometric.e.a
        public void b() {
            a aVar = BiometricDecryptionActivity.f120576t;
            if (aVar == null) {
                Intrinsics.x("biometricAction");
                aVar = null;
            }
            aVar.a(new BiometricAuthenticationException("Unexpected Biometric error", a.b.f120599a));
            BiometricDecryptionActivity.this.finish();
        }
    }

    private final e u1() {
        Executor executorH = b.h(this);
        Intrinsics.i(executorH, "getMainExecutor(...)");
        return new e(this, executorH, new c());
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(s.f31449a);
        a aVar = f120576t;
        e.d dVar = null;
        if (aVar == null) {
            Intrinsics.x("biometricAction");
            aVar = null;
        }
        if (aVar instanceof a.b) {
            e eVarU1 = u1();
            e.d dVar2 = f120575s;
            if (dVar2 == null) {
                Intrinsics.x("promptInfo");
            } else {
                dVar = dVar2;
            }
            eVarU1.a(dVar);
            return;
        }
        if (aVar instanceof a.C1969a) {
            e eVarU12 = u1();
            e.d dVar3 = f120575s;
            if (dVar3 == null) {
                Intrinsics.x("promptInfo");
            } else {
                dVar = dVar3;
            }
            eVarU12.b(dVar, new e.c(((a.C1969a) aVar).getCipher()));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}

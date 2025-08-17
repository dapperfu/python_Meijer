package sv;

import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import qv.C16658p;
import qv.C16662r;
import qv.InterfaceC16654n;
import qv.h1;
import vv.AbstractC17628B;
import vv.AbstractC17647c;
import vv.C17629C;
import vv.C17630D;
import vv.C17646b;
import vv.C17654j;
import vv.C17668x;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:ª\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u00109J\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bS\u0010@J\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bT\u0010UJ\u001d\u0010W\u001a\u00020\u00112\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020\u00062\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bY\u0010ZJ%\u0010\\\u001a\u00020\u00062\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010[\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010`\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b`\u0010_J\u001b\u0010b\u001a\u00020\u0006*\u00020\u00152\u0006\u0010a\u001a\u00020\u001eH\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010f\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\u001eH\u0002¢\u0006\u0004\bf\u0010gJ-\u0010i\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u0011H\u0002¢\u0006\u0004\bi\u0010<J-\u0010l\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bl\u0010mJ-\u0010n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bn\u0010mJ5\u0010p\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010o\u001a\u00020\u0011H\u0002¢\u0006\u0004\bp\u0010qJ%\u0010r\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u0011H\u0002¢\u0006\u0004\bu\u0010@J\u0017\u0010v\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@JG\u0010z\u001a \u0012\u0004\u0012\u00020x\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060w*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\bz\u0010{J-\u0010~\u001a\u00020\u00062\u0006\u0010|\u001a\u00020x2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010}\u001a\u00020yH\u0002¢\u0006\u0004\b~\u0010\u007fJO\u0010\u0081\u0001\u001a\u001d\u0012\u0004\u0012\u00020x\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060\u0080\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001JC\u0010\u0083\u0001\u001a\u001a\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060w*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0083\u0001\u0010{J)\u0010\u0084\u0001\u001a\u00020\u00062\u0006\u0010|\u001a\u00020x2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010}\u001a\u00020yH\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b*\u0010\rJ \u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0088\u0001\u00109J\u0011\u0010\u0089\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0089\u0001\u00109J\u0013\u0010\u008a\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0019\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J\u0018\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00062\u0007\u0010\u008f\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0090\u0001\u0010@J\u0019\u0010\u0091\u0001\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0091\u0001\u0010@J\u001a\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0092\u0001H\u0096\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0095\u0001\u00109J\u001c\u0010\u0096\u0001\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\"\u0010\u009a\u0001\u001a\u00020\u00062\u0010\u0010|\u001a\f\u0018\u00010\u0098\u0001j\u0005\u0018\u0001`\u0099\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010xH\u0010¢\u0006\u0006\b\u009c\u0001\u0010\u0097\u0001J%\u0010\u009e\u0001\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010x2\u0007\u0010\u009d\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J:\u0010£\u0001\u001a\u00020\u00062&\u0010¢\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010x¢\u0006\u000e\b \u0001\u0012\t\b¡\u0001\u0012\u0004\b\b(|\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0012\u0010¥\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0013\u0010¨\u0001\u001a\u00030§\u0001H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010¬\u0001R\u0098\u0001\u0010³\u0001\u001a|\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030A¢\u0006\u000e\b \u0001\u0012\t\b¡\u0001\u0012\u0004\b\b(B\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b \u0001\u0012\n\b¡\u0001\u0012\u0005\b\b(\u00ad\u0001\u0012\u0018\u0012\u0016\u0018\u00010\u001c¢\u0006\u000f\b \u0001\u0012\n\b¡\u0001\u0012\u0005\b\b(®\u0001\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020x\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060\u0080\u0001\u0018\u00010\u0080\u0001j\u0005\u0018\u0001`¯\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b°\u0001\u0010±\u0001\u0012\u0005\b²\u0001\u00109R\u0017\u0010¶\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0017\u0010¸\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¦\u0001R\u0017\u0010»\u0001\u001a\u00020x8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010½\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010%R\u001a\u0010¿\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010%R\u0016\u0010[\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010µ\u0001R\u0017\u0010Â\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010µ\u0001R+\u0010Ç\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000Ã\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÆ\u0001\u00109\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010É\u0001\u001a\u0004\u0018\u00010x8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010º\u0001R\u0017\u0010Ë\u0001\u001a\u00020x8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010º\u0001R\u0017\u0010Í\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010¦\u0001R\u001d\u0010Ï\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÎ\u0001\u00109\u001a\u0005\b\u0012\u0010¦\u0001R\u001d\u0010e\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÑ\u0001\u00109\u001a\u0006\bÐ\u0001\u0010¦\u0001R\f\u0010Ò\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004R\f\u0010Ó\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004R\f\u0010Ô\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004R\f\u0010Õ\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004R\u0018\u0010Ö\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0082\u0004R\u0018\u0010×\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0082\u0004R\u0018\u0010Ø\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0082\u0004R\u0014\u0010Ù\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004R\u0014\u0010Ú\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¨\u0006Û\u0001"}, d2 = {"Lsv/e;", "E", "Lsv/g;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "element", "N0", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsv/m;", "segment", "index", "", "s", "g1", "(Lsv/m;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/h1;", "U0", "(Lqv/h1;Lsv/m;I)V", "Lqv/n;", "cont", "O0", "(Ljava/lang/Object;Lqv/n;)V", "", "waiter", "", "closed", "p1", "(Lsv/m;ILjava/lang/Object;JLjava/lang/Object;Z)I", "q1", "curSendersAndCloseStatus", "h1", "(J)Z", "curSenders", "P", "i1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "Z0", "(Lsv/m;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T0", "L0", "(Lqv/n;)V", "Lsv/k;", "Y0", "K0", "n1", "(Lsv/m;IJLjava/lang/Object;)Ljava/lang/Object;", "o1", "j1", "(Ljava/lang/Object;Lsv/m;I)Z", "Y", "()V", "b", "l1", "(Lsv/m;IJ)Z", "m1", "nAttempts", "s0", "(J)V", "Lzv/k;", "select", "ignoredParam", "a1", "(Lzv/k;Ljava/lang/Object;)V", "M0", "(Lzv/k;)V", "selectResult", "V0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "u0", "F0", "E0", "D0", "W", "sendersCur", "V", "(J)Lsv/m;", "U", "S", "()Lsv/m;", "lastSegment", "C0", "(Lsv/m;)J", "b1", "(Lsv/m;)V", "sendersCounter", "R", "(Lsv/m;J)V", "c1", "(Lqv/h1;)V", "d1", "receiver", "e1", "(Lqv/h1;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "w0", "(JZ)Z", "globalIndex", "v0", PreferencesHelper.PREF_ID, "startFrom", "b0", "(JLsv/m;)Lsv/m;", "a0", "currentBufferEndCounter", "Z", "(JLsv/m;J)Lsv/m;", "G0", "(JLsv/m;)V", "value", "s1", "r1", "Lkotlin/reflect/KFunction3;", "", "Lkotlin/coroutines/CoroutineContext;", "O", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/KFunction;", "cause", "context", "H0", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function3;", "L", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "M", "I0", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "k1", "Q0", "P0", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "n", "()Ljava/lang/Object;", "globalCellIndex", "X", "t1", "Lsv/i;", "iterator", "()Lsv/i;", "J0", "q", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "d", "(Ljava/util/concurrent/CancellationException;)V", "Q", "cancel", "T", "(Ljava/lang/Throwable;Z)Z", "Lkotlin/ParameterName;", "name", "handler", "f", "(Lkotlin/jvm/functions/Function1;)V", "r0", "()Z", "", "toString", "()Ljava/lang/String;", "a", "I", "Lkotlin/jvm/functions/Function1;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "Lkotlin/jvm/functions/Function3;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "d0", "()J", "bufferEndCounter", "B0", "isRendezvousOrUnlimited", "i0", "()Ljava/lang/Throwable;", "receiveException", "z0", "isClosedForSend0", "y0", "isClosedForReceive0", "p0", "l0", "receiversCounter", "Lzv/g;", "l", "()Lzv/g;", "getOnReceiveCatching$annotations", "onReceiveCatching", "f0", "closeCause", "m0", "sendException", "A0", "isConflatedDropOldest", "isClosedForSend$annotations", "isClosedForSend", "x0", "isClosedForReceive$annotations", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public class e<E> implements sv.g<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f161251d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f161252e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f161253f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f161254g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f161255h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f161256i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f161257j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f161258k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f161259l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Function1<E, Unit> onUndeliveredElement;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function3<zv.k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lsv/e$a;", "Lsv/i;", "Lqv/h1;", "<init>", "(Lsv/e;)V", "", "g", "()Z", "Lsv/m;", "segment", "", "index", "", "r", "e", "(Lsv/m;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "h", "()V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvv/B;", "f", "(Lvv/B;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "", "Ljava/lang/Object;", "receiveResult", "Lqv/p;", "b", "Lqv/p;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private final class a implements i<E>, h1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object receiveResult = sv.f.f161295p;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private C16658p<? super Boolean> continuation;

        public a() {
        }

        private final Object e(m<E> mVar, int i10, long j10, Continuation<? super Boolean> continuation) throws Throwable {
            Boolean boolA;
            m mVarA0;
            e<E> eVar = e.this;
            C16658p c16658pB = C16662r.b(IntrinsicsKt.c(continuation));
            try {
                this.continuation = c16658pB;
                try {
                    Object objN1 = eVar.n1(mVar, i10, j10, this);
                    if (objN1 == sv.f.f161292m) {
                        eVar.T0(this, mVar, i10);
                    } else {
                        Function3 function3L = null;
                        if (objN1 == sv.f.f161294o) {
                            if (j10 < eVar.p0()) {
                                mVar.b();
                            }
                            m mVar2 = (m) e.j0().get(eVar);
                            while (true) {
                                if (eVar.x0()) {
                                    h();
                                    break;
                                }
                                long andIncrement = e.k0().getAndIncrement(eVar);
                                int i11 = sv.f.f161281b;
                                long j11 = andIncrement / i11;
                                int i12 = (int) (andIncrement % i11);
                                if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j11) {
                                    mVarA0 = eVar.a0(j11, mVar2);
                                    if (mVarA0 == null) {
                                    }
                                } else {
                                    mVarA0 = mVar2;
                                }
                                Object objN12 = eVar.n1(mVarA0, i12, andIncrement, this);
                                if (objN12 == sv.f.f161292m) {
                                    eVar.T0(this, mVarA0, i12);
                                    break;
                                }
                                if (objN12 == sv.f.f161294o) {
                                    if (andIncrement < eVar.p0()) {
                                        mVarA0.b();
                                    }
                                    mVar2 = mVarA0;
                                } else {
                                    if (objN12 == sv.f.f161293n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVarA0.b();
                                    this.receiveResult = objN12;
                                    this.continuation = null;
                                    boolA = Boxing.a(true);
                                    Function1<E, Unit> function1 = eVar.onUndeliveredElement;
                                    if (function1 != null) {
                                        function3L = eVar.L(function1, objN12);
                                    }
                                }
                            }
                        } else {
                            mVar.b();
                            this.receiveResult = objN1;
                            this.continuation = null;
                            boolA = Boxing.a(true);
                            Function1<E, Unit> function12 = eVar.onUndeliveredElement;
                            if (function12 != null) {
                                function3L = eVar.L(function12, objN1);
                            }
                        }
                        c16658pB.U(boolA, function3L);
                    }
                    Object objV = c16658pB.v();
                    if (objV == IntrinsicsKt.f()) {
                        DebugProbesKt.c(continuation);
                    }
                    return objV;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    c16658pB.O();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            C16658p<? super Boolean> c16658p = this.continuation;
            Intrinsics.g(c16658p);
            this.continuation = null;
            this.receiveResult = sv.f.z();
            Throwable thF0 = e.this.f0();
            if (thF0 == null) {
                Result.Companion companion = Result.INSTANCE;
                c16658p.resumeWith(Result.b(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c16658p.resumeWith(Result.b(ResultKt.a(thF0)));
            }
        }

        @Override // sv.i
        public Object a(Continuation<? super Boolean> continuation) throws Throwable {
            m<E> mVarA0;
            boolean zG = true;
            if (this.receiveResult == sv.f.f161295p || this.receiveResult == sv.f.z()) {
                e<E> eVar = e.this;
                m<E> mVar = (m) e.j0().get(eVar);
                while (!eVar.x0()) {
                    long andIncrement = e.k0().getAndIncrement(eVar);
                    int i10 = sv.f.f161281b;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j10) {
                        mVarA0 = eVar.a0(j10, mVar);
                        if (mVarA0 == null) {
                            continue;
                        }
                    } else {
                        mVarA0 = mVar;
                    }
                    Object objN1 = eVar.n1(mVarA0, i11, andIncrement, null);
                    if (objN1 == sv.f.f161292m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objN1 == sv.f.f161294o) {
                        if (andIncrement < eVar.p0()) {
                            mVarA0.b();
                        }
                        mVar = mVarA0;
                    } else {
                        if (objN1 == sv.f.f161293n) {
                            return e(mVarA0, i11, andIncrement, continuation);
                        }
                        mVarA0.b();
                        this.receiveResult = objN1;
                    }
                }
                zG = g();
            }
            return Boxing.a(zG);
        }

        @Override // qv.h1
        public void f(AbstractC17628B<?> segment, int index) {
            C16658p<? super Boolean> c16658p = this.continuation;
            if (c16658p != null) {
                c16658p.f(segment, index);
            }
        }

        public final boolean i(E element) {
            C16658p<? super Boolean> c16658p = this.continuation;
            Intrinsics.g(c16658p);
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            e<E> eVar = e.this;
            Function1<E, Unit> function1 = eVar.onUndeliveredElement;
            return sv.f.B(c16658p, bool, function1 != null ? eVar.L(function1, element) : null);
        }

        public final void j() {
            C16658p<? super Boolean> c16658p = this.continuation;
            Intrinsics.g(c16658p);
            this.continuation = null;
            this.receiveResult = sv.f.z();
            Throwable thF0 = e.this.f0();
            if (thF0 == null) {
                Result.Companion companion = Result.INSTANCE;
                c16658p.resumeWith(Result.b(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c16658p.resumeWith(Result.b(ResultKt.a(thF0)));
            }
        }

        @Override // sv.i
        public E next() throws Throwable {
            E e10 = (E) this.receiveResult;
            if (e10 == sv.f.f161295p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = sv.f.f161295p;
            if (e10 != sv.f.z()) {
                return e10;
            }
            throw C17630D.a(e.this.i0());
        }

        private final boolean g() throws Throwable {
            this.receiveResult = sv.f.z();
            Throwable thF0 = e.this.f0();
            if (thF0 == null) {
                return false;
            }
            throw C17630D.a(thF0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lsv/e$b;", "Lqv/h1;", "Lvv/B;", "segment", "", "index", "", "f", "(Lvv/B;I)V", "Lqv/n;", "", "b", "Lqv/n;", "a", "()Lqv/n;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements h1 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ C16658p<Boolean> f161266a;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC16654n<Boolean> cont;

        public final InterfaceC16654n<Boolean> a() {
            return this.cont;
        }

        @Override // qv.h1
        public void f(AbstractC17628B<?> segment, int index) {
            this.f161266a.f(segment, index);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function3<Throwable, E, CoroutineContext, Unit> {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, E e10, CoroutineContext coroutineContext) {
            ((e) this.receiver).I0(th2, e10, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            a(th2, obj, coroutineContext);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function3<Throwable, k<? extends E>, CoroutineContext, Unit> {
        d(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((e) this.receiver).H0(th2, obj, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            a(th2, ((k) obj).getHolder(), coroutineContext);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sv.e$e, reason: collision with other inner class name */
    /* synthetic */ class C2527e extends FunctionReferenceImpl implements Function3<e<?>, zv.k<?>, Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2527e f161268b = new C2527e();

        C2527e() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(e<?> eVar, zv.k<?> kVar, Object obj) {
            a(eVar, kVar, obj);
            return Unit.f142422a;
        }

        public final void a(e<?> eVar, zv.k<?> kVar, Object obj) {
            eVar.a1(kVar, obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends FunctionReferenceImpl implements Function3<e<?>, Object, Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f161269b = new f();

        f() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e<?> eVar, Object obj, Object obj2) {
            return eVar.V0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
    static final class g<E> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f161270a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<E> f161271b;

        /* renamed from: c, reason: collision with root package name */
        int f161272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e<E> eVar, Continuation<? super g> continuation) {
            super(continuation);
            this.f161271b = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f161270a = obj;
            this.f161272c |= Integer.MIN_VALUE;
            Object objX0 = e.X0(this.f161271b, this);
            return objX0 == IntrinsicsKt.f() ? objX0 : k.b(objX0);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f161273a;

        /* renamed from: b, reason: collision with root package name */
        Object f161274b;

        /* renamed from: c, reason: collision with root package name */
        int f161275c;

        /* renamed from: d, reason: collision with root package name */
        long f161276d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f161277e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e<E> f161278f;

        /* renamed from: g, reason: collision with root package name */
        int f161279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e<E> eVar, Continuation<? super h> continuation) {
            super(continuation);
            this.f161278f = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f161277e = obj;
            this.f161279g |= Integer.MIN_VALUE;
            Object objY0 = this.f161278f.Y0(null, 0, 0L, this);
            return objY0 == IntrinsicsKt.f() ? objY0 : k.b(objY0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void R(m<E> lastSegment, long sendersCounter) {
        Object objB = C17654j.b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i10 = sv.f.f161281b - 1; -1 < i10; i10--) {
                if ((lastSegment.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * sv.f.f161281b) + i10 < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lastSegment.B(i10);
                    if (objB2 != null && objB2 != sv.f.f161284e) {
                        if (!(objB2 instanceof WaiterEB)) {
                            if (!(objB2 instanceof h1)) {
                                break;
                            }
                            if (lastSegment.v(i10, objB2, sv.f.z())) {
                                objB = C17654j.c(objB, objB2);
                                lastSegment.C(i10, true);
                                break;
                            }
                        } else {
                            if (lastSegment.v(i10, objB2, sv.f.z())) {
                                objB = C17654j.c(objB, ((WaiterEB) objB2).waiter);
                                lastSegment.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.v(i10, objB2, sv.f.z())) {
                            lastSegment.t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                c1((h1) objB);
                return;
            }
            Intrinsics.h(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                c1((h1) arrayList.get(size));
            }
        }
    }

    private final m<E> Z(long id2, m<E> startFrom, long currentBufferEndCounter) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f161257j;
        Function2 function2 = (Function2) sv.f.y();
        loop0: while (true) {
            objC = C17646b.c(startFrom, id2, function2);
            if (!C17629C.c(objC)) {
                AbstractC17628B abstractC17628BB = C17629C.b(objC);
                while (true) {
                    AbstractC17628B abstractC17628B = (AbstractC17628B) atomicReferenceFieldUpdater.get(this);
                    if (abstractC17628B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC17628BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                        break loop0;
                    }
                    if (!abstractC17628BB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC17628B, abstractC17628BB)) {
                        if (abstractC17628B.p()) {
                            abstractC17628B.n();
                        }
                    } else if (abstractC17628BB.p()) {
                        abstractC17628BB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C17629C.c(objC)) {
            W();
            G0(id2, startFrom);
            t0(this, 0L, 1, null);
            return null;
        }
        m<E> mVar = (m) C17629C.b(objC);
        if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String <= id2) {
            return mVar;
        }
        long j10 = mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
        int i10 = sv.f.f161281b;
        if (f161253f.compareAndSet(this, currentBufferEndCounter + 1, j10 * i10)) {
            s0((mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * i10) - currentBufferEndCounter);
        } else {
            t0(this, 0L, 1, null);
        }
        return null;
    }

    private final void c1(h1 h1Var) {
        e1(h1Var, true);
    }

    private final void d1(h1 h1Var) {
        e1(h1Var, false);
    }

    private final boolean y0(long j10) {
        return w0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z0(long j10) {
        return w0(j10, false);
    }

    protected boolean A0() {
        return false;
    }

    protected void J0() {
    }

    protected void P0() {
    }

    protected void Q0() {
    }

    @Override // sv.w
    public boolean q(Throwable cause) {
        return T(cause, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (sv.m) r8.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long C0(sv.m<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = sv.f.f161281b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String
            int r5 = sv.f.f161281b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.l0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            vv.E r2 = sv.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            vv.E r2 = sv.f.f161283d
            if (r1 != r2) goto L39
            return r3
        L2c:
            vv.E r2 = sv.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            vv.c r8 = r8.h()
            sv.m r8 = (sv.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.C0(sv.m):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G0(long r5, sv.m<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            vv.c r0 = r7.f()
            sv.m r0 = (sv.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            vv.c r5 = r7.f()
            sv.m r5 = (sv.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = e0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            vv.B r6 = (vv.AbstractC17628B) r6
            long r0 = r6.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String
            long r2 = r7.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.G0(long, sv.m):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(Throwable cause, Object element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.g(function1);
        Object objF = k.f(element);
        Intrinsics.g(objF);
        C17668x.a(function1, objF, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(Throwable cause, E element, CoroutineContext context) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        Intrinsics.g(function1);
        C17668x.a(function1, element, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(InterfaceC16654n<? super k<? extends E>> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.b(k.b(k.INSTANCE.a(f0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function3<Throwable, Object, CoroutineContext, Unit> L(final Function1<? super E, Unit> function1, final E e10) {
        return new Function3() { // from class: sv.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.N(function1, e10, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(InterfaceC16654n<? super E> cont) {
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.b(ResultKt.a(i0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction<Unit> M(Function1<? super E, Unit> function1) {
        return new c(this);
    }

    private final Object N0(E e10, Continuation<? super Unit> continuation) {
        UndeliveredElementException undeliveredElementExceptionC;
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionC = C17668x.c(function1, e10, null, 2, null)) == null) {
            Throwable thM0 = m0();
            Result.Companion companion = Result.INSTANCE;
            c16658p.resumeWith(Result.b(ResultKt.a(thM0)));
        } else {
            ExceptionsKt.a(undeliveredElementExceptionC, m0());
            Result.Companion companion2 = Result.INSTANCE;
            c16658p.resumeWith(Result.b(ResultKt.a(undeliveredElementExceptionC)));
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction<Unit> O(Function1<? super E, Unit> function1) {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(E element, InterfaceC16654n<? super Unit> cont) {
        Function1<E, Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            C17668x.a(function1, element, cont.getContext());
        }
        Throwable thM0 = m0();
        Result.Companion companion = Result.INSTANCE;
        cont.resumeWith(Result.b(ResultKt.a(thM0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 R0(final e eVar, final zv.k kVar, Object obj, final Object obj2) {
        return new Function3() { // from class: sv.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.S0(obj2, eVar, kVar, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(h1 h1Var, m<E> mVar, int i10) {
        h1Var.f(mVar, i10 + sv.f.f161281b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r14v12, types: [sv.k$b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [sv.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ <E> java.lang.Object X0(sv.e<E> r13, kotlin.coroutines.Continuation<? super sv.k<? extends E>> r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof sv.e.g
            if (r0 == 0) goto L14
            r0 = r14
            sv.e$g r0 = (sv.e.g) r0
            int r1 = r0.f161272c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f161272c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            sv.e$g r0 = new sv.e$g
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f161270a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f161272c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.ResultKt.b(r14)
            sv.k r14 = (sv.k) r14
            java.lang.Object r13 = r14.getHolder()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.ResultKt.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = t()
            java.lang.Object r14 = r14.get(r13)
            sv.m r14 = (sv.m) r14
        L46:
            boolean r1 = r13.x0()
            if (r1 == 0) goto L57
            sv.k$b r14 = sv.k.INSTANCE
            java.lang.Throwable r13 = r13.f0()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = u()
            long r4 = r1.getAndIncrement(r13)
            int r1 = sv.f.f161281b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            sv.m r1 = j(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = J(r7, r8, r9, r10, r12)
            r1 = r7
            vv.E r14 = sv.f.r()
            if (r13 == r14) goto Lb6
            vv.E r14 = sv.f.h()
            if (r13 != r14) goto L9b
            long r13 = r1.p0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.b()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            vv.E r14 = sv.f.s()
            if (r13 != r14) goto Lac
            r6.f161272c = r2
            r2 = r8
            java.lang.Object r13 = r1.Y0(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.b()
            sv.k$b r14 = sv.k.INSTANCE
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.X0(sv.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y0(sv.m<E> r11, int r12, long r13, kotlin.coroutines.Continuation<? super sv.k<? extends E>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.Y0(sv.m, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (sv.m) r12.h();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b1(sv.m<E> r12) {
        /*
            r11 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r11.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = vv.C17654j.b(r1, r2, r1)
        L8:
            int r4 = sv.f.f161281b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String
            int r8 = sv.f.f161281b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.B(r4)
            vv.E r9 = sv.f.f()
            if (r8 == r9) goto Lbb
            vv.E r9 = sv.f.f161283d
            if (r8 != r9) goto L48
            long r9 = r11.l0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            vv.E r9 = sv.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = vv.C17668x.b(r0, r5, r1)
        L40:
            r12.w(r4)
            r12.t()
            goto Laf
        L48:
            vv.E r9 = sv.f.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof qv.h1
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof sv.WaiterEB
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            vv.E r9 = sv.f.p()
            if (r8 == r9) goto Lbb
            vv.E r9 = sv.f.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            vv.E r9 = sv.f.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.l0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof sv.WaiterEB
            if (r9 == 0) goto L80
            r9 = r8
            sv.x r9 = (sv.WaiterEB) r9
            qv.h1 r9 = r9.waiter
            goto L83
        L80:
            r9 = r8
            qv.h1 r9 = (qv.h1) r9
        L83:
            vv.E r10 = sv.f.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = vv.C17668x.b(r0, r5, r1)
        L97:
            java.lang.Object r3 = vv.C17654j.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto Laf
        La2:
            vv.E r9 = sv.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            vv.c r12 = r12.h()
            sv.m r12 = (sv.m) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            qv.h1 r3 = (qv.h1) r3
            r11.d1(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.Intrinsics.h(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            qv.h1 r0 = (qv.h1) r0
            r11.d1(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.b1(sv.m):void");
    }

    private final void e1(h1 h1Var, boolean z10) {
        if (h1Var instanceof b) {
            InterfaceC16654n<Boolean> interfaceC16654nA = ((b) h1Var).a();
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654nA.resumeWith(Result.b(Boolean.FALSE));
            return;
        }
        if (h1Var instanceof InterfaceC16654n) {
            Continuation continuation = (Continuation) h1Var;
            Result.Companion companion2 = Result.INSTANCE;
            continuation.resumeWith(Result.b(ResultKt.a(z10 ? i0() : m0())));
        } else if (h1Var instanceof u) {
            C16658p<k<? extends E>> c16658p = ((u) h1Var).cont;
            Result.Companion companion3 = Result.INSTANCE;
            c16658p.resumeWith(Result.b(k.b(k.INSTANCE.a(f0()))));
        } else if (h1Var instanceof a) {
            ((a) h1Var).j();
        } else {
            if (h1Var instanceof zv.k) {
                ((zv.k) h1Var).e(this, sv.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + h1Var).toString());
        }
    }

    private final boolean i1(Object obj, E e10) {
        if (obj instanceof zv.k) {
            return ((zv.k) obj).e(this, e10);
        }
        if (obj instanceof u) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C16658p<k<? extends E>> c16658p = ((u) obj).cont;
            k kVarB = k.b(k.INSTANCE.c(e10));
            Function1<E, Unit> function1 = this.onUndeliveredElement;
            return sv.f.B(c16658p, kVarB, (Function3) (function1 != null ? O(function1) : null));
        }
        if (obj instanceof a) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        }
        if (obj instanceof InterfaceC16654n) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC16654n interfaceC16654n = (InterfaceC16654n) obj;
            Function1<E, Unit> function12 = this.onUndeliveredElement;
            return sv.f.B(interfaceC16654n, e10, (Function3) (function12 != null ? M(function12) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater j0() {
        return f161256i;
    }

    private final boolean j1(Object obj, m<E> mVar, int i10) {
        if (obj instanceof InterfaceC16654n) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return sv.f.C((InterfaceC16654n) obj, Unit.f142422a, null, 2, null);
        }
        if (obj instanceof zv.k) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            zv.m mVarX = ((zv.j) obj).x(this, Unit.f142422a);
            if (mVarX == zv.m.f173356b) {
                mVar.w(i10);
            }
            return mVarX == zv.m.f173355a;
        }
        if (obj instanceof b) {
            return sv.f.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater k0() {
        return f161252e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater n0() {
        return f161255h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater o0() {
        return f161251d;
    }

    static /* synthetic */ void t0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.s0(j10);
    }

    private final boolean w0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i10 = (int) (sendersAndCloseStatusCur >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            V(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && r0()) ? false : true;
        }
        if (i10 == 3) {
            U(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    public boolean Q(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return T(cause, true);
    }

    protected boolean T(Throwable cause, boolean cancel) {
        if (cancel) {
            D0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f161258k, this, sv.f.f161298s, cause);
        if (cancel) {
            E0();
        } else {
            F0();
        }
        W();
        J0();
        if (zA) {
            u0();
        }
        return zA;
    }

    @Override // sv.v
    public i<E> iterator() {
        return new a();
    }

    protected final Object k1(E element) {
        m mVarB0;
        int i10;
        e<E> eVar;
        Object obj = sv.f.f161283d;
        m mVar = (m) n0().get(this);
        while (true) {
            long andIncrement = o0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zZ0 = z0(andIncrement);
            int i11 = sv.f.f161281b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j11) {
                mVarB0 = b0(j11, mVar);
                if (mVarB0 != null) {
                    eVar = this;
                    i10 = i12;
                } else if (zZ0) {
                    return k.INSTANCE.a(m0());
                }
            } else {
                mVarB0 = mVar;
                i10 = i12;
                eVar = this;
            }
            E e10 = element;
            int iP1 = eVar.p1(mVarB0, i10, e10, j10, obj, zZ0);
            mVar = mVarB0;
            if (iP1 == 0) {
                mVar.b();
                return k.INSTANCE.c(Unit.f142422a);
            }
            if (iP1 == 1) {
                return k.INSTANCE.c(Unit.f142422a);
            }
            if (iP1 == 2) {
                if (zZ0) {
                    mVar.t();
                    return k.INSTANCE.a(m0());
                }
                h1 h1Var = obj instanceof h1 ? (h1) obj : null;
                if (h1Var != null) {
                    U0(h1Var, mVar, i10);
                }
                X((mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * i11) + i10);
                return k.INSTANCE.c(Unit.f142422a);
            }
            if (iP1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iP1 == 4) {
                if (j10 < l0()) {
                    mVar.b();
                }
                return k.INSTANCE.a(m0());
            }
            if (iP1 == 5) {
                mVar.b();
            }
            element = e10;
        }
    }

    @Override // sv.v
    public zv.g<k<E>> l() {
        C2527e c2527e = C2527e.f161268b;
        Intrinsics.h(c2527e, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.f(c2527e, 3);
        f fVar = f.f161269b;
        Intrinsics.h(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new zv.h(this, function3, (Function3) TypeIntrinsics.f(fVar, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    public final void t1(long globalIndex) {
        e<E> eVar = this;
        if (eVar.B0()) {
            return;
        }
        while (eVar.d0() <= globalIndex) {
            eVar = this;
        }
        int i10 = sv.f.f161282c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jD0 = eVar.d0();
            if (jD0 == (4611686018427387903L & f161254g.get(eVar)) && jD0 == eVar.d0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f161254g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j10, sv.f.v(j10 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jD02 = eVar.d0();
            long j11 = f161254g.get(eVar);
            long j12 = j11 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j11) != 0;
            if (jD02 == j12 && jD02 == eVar.d0()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f161254g.compareAndSet(eVar, j11, sv.f.v(j12, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f161254g;
        while (true) {
            long j13 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j13, sv.f.v(j13 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01df, code lost:
    
        r16 = r7;
        r3 = (sv.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e8, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.toString():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i10, Function1<? super E, Unit> function1) {
        Function3<zv.k<?>, Object, Object, Function3<Throwable, Object, CoroutineContext, Unit>> function3;
        this.capacity = i10;
        this.onUndeliveredElement = function1;
        if (i10 >= 0) {
            this.bufferEnd$volatile = sv.f.A(i10);
            this.completedExpandBuffersAndPauseFlag$volatile = d0();
            m mVar = new m(0L, null, this, 3);
            this.sendSegment$volatile = mVar;
            this.receiveSegment$volatile = mVar;
            if (B0()) {
                mVar = sv.f.f161280a;
                Intrinsics.h(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = mVar;
            if (function1 != 0) {
                function3 = new Function3() { // from class: sv.b
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return e.R0(this.f161245a, (zv.k) obj, obj2, obj3);
                    }
                };
            } else {
                function3 = null;
            }
            this.onUndeliveredElementReceiveCancellationConstructor = function3;
            this._closeCause$volatile = sv.f.f161298s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    private final boolean B0() {
        long jD0 = d0();
        if (jD0 != 0 && jD0 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    private final void D0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f161251d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, sv.f.w(1152921504606846975L & j10, 1)));
    }

    private final void E0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f161251d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, sv.f.w(1152921504606846975L & j10, 3)));
    }

    private final void F0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f161251d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = sv.f.w(1152921504606846975L & j10, 2);
            } else if (i10 == 1) {
                jW = sv.f.w(1152921504606846975L & j10, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    private final void M0(zv.k<?> select) {
        select.d(sv.f.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        C17668x.a(function1, obj, coroutineContext);
        return Unit.f142422a;
    }

    private final boolean P(long curSenders) {
        if (curSenders >= d0() && curSenders >= l0() + this.capacity) {
            return false;
        }
        return true;
    }

    private final m<E> S() {
        Object obj = f161257j.get(this);
        m mVar = (m) f161255h.get(this);
        if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String > ((m) obj).io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
            obj = mVar;
        }
        m mVar2 = (m) f161256i.get(this);
        if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String > ((m) obj).io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
            obj = mVar2;
        }
        return (m) C17646b.b((AbstractC17647c) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S0(Object obj, e eVar, zv.k kVar, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != sv.f.z()) {
            C17668x.a(eVar.onUndeliveredElement, obj, kVar.getContext());
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(h1 h1Var, m<E> mVar, int i10) {
        Q0();
        h1Var.f(mVar, i10);
    }

    private final void U(long sendersCur) {
        b1(V(sendersCur));
    }

    private final m<E> V(long sendersCur) {
        m<E> mVarS = S();
        if (A0()) {
            long jC0 = C0(mVarS);
            if (jC0 != -1) {
                X(jC0);
            }
        }
        R(mVarS, sendersCur);
        return mVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V0(Object ignoredParam, Object selectResult) {
        Object objC;
        if (selectResult == sv.f.z()) {
            objC = k.INSTANCE.a(f0());
        } else {
            objC = k.INSTANCE.c(selectResult);
        }
        return k.b(objC);
    }

    private final void W() {
        s();
    }

    static /* synthetic */ <E> Object W0(e<E> eVar, Continuation<? super E> continuation) throws Throwable {
        m<E> mVar;
        m<E> mVar2 = (m) j0().get(eVar);
        while (!eVar.x0()) {
            long andIncrement = k0().getAndIncrement(eVar);
            int i10 = sv.f.f161281b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j10) {
                m<E> mVarA0 = eVar.a0(j10, mVar2);
                if (mVarA0 == null) {
                    continue;
                } else {
                    mVar = mVarA0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            Object objN1 = eVar2.n1(mVar, i11, andIncrement, null);
            if (objN1 != sv.f.f161292m) {
                if (objN1 == sv.f.f161294o) {
                    if (andIncrement < eVar2.p0()) {
                        mVar.b();
                    }
                    eVar = eVar2;
                    mVar2 = mVar;
                } else {
                    if (objN1 == sv.f.f161293n) {
                        return eVar2.Z0(mVar, i11, andIncrement, continuation);
                    }
                    mVar.b();
                    return objN1;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw C17630D.a(eVar.i0());
    }

    private final void Y() {
        if (B0()) {
            return;
        }
        m<E> mVar = (m) f161257j.get(this);
        while (true) {
            long andIncrement = f161253f.getAndIncrement(this);
            int i10 = sv.f.f161281b;
            long j10 = andIncrement / i10;
            if (p0() <= andIncrement) {
                if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String < j10 && mVar.f() != 0) {
                    G0(j10, mVar);
                }
                t0(this, 0L, 1, null);
                return;
            }
            if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j10) {
                m<E> mVarZ = Z(j10, mVar, andIncrement);
                if (mVarZ == null) {
                    continue;
                } else {
                    mVar = mVarZ;
                }
            }
            if (l1(mVar, (int) (andIncrement % i10), andIncrement)) {
                t0(this, 0L, 1, null);
                return;
            }
            t0(this, 0L, 1, null);
        }
    }

    private final Object Z0(m<E> mVar, int i10, long j10, Continuation<? super E> continuation) {
        Function3 function3;
        m mVar2;
        C16658p c16658pB = C16662r.b(IntrinsicsKt.c(continuation));
        try {
            Object objN1 = n1(mVar, i10, j10, c16658pB);
            if (objN1 == sv.f.f161292m) {
                T0(c16658pB, mVar, i10);
            } else {
                KFunction kFunctionM = null;
                KFunction kFunctionM2 = null;
                C16658p c16658p = null;
                if (objN1 == sv.f.f161294o) {
                    if (j10 < p0()) {
                        mVar.b();
                    }
                    m mVar3 = (m) j0().get(this);
                    while (true) {
                        if (x0()) {
                            L0(c16658pB);
                            break;
                        }
                        long andIncrement = k0().getAndIncrement(this);
                        int i11 = sv.f.f161281b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (mVar3.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j11) {
                            m mVarA0 = a0(j11, mVar3);
                            if (mVarA0 != null) {
                                mVar2 = mVarA0;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        objN1 = n1(mVar2, i12, andIncrement, c16658pB);
                        m mVar4 = mVar2;
                        if (objN1 == sv.f.f161292m) {
                            if (c16658pB != null) {
                                c16658p = c16658pB;
                            }
                            if (c16658p != null) {
                                T0(c16658p, mVar4, i12);
                            }
                        } else if (objN1 == sv.f.f161294o) {
                            if (andIncrement < p0()) {
                                mVar4.b();
                            }
                            mVar3 = mVar4;
                        } else if (objN1 != sv.f.f161293n) {
                            mVar4.b();
                            Function1<E, Unit> function1 = this.onUndeliveredElement;
                            if (function1 != null) {
                                kFunctionM2 = M(function1);
                            }
                            function3 = (Function3) kFunctionM2;
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    }
                } else {
                    mVar.b();
                    Function1<E, Unit> function12 = this.onUndeliveredElement;
                    if (function12 != null) {
                        kFunctionM = M(function12);
                    }
                    function3 = (Function3) kFunctionM;
                }
                c16658pB.U(objN1, function3);
            }
            Object objV = c16658pB.v();
            if (objV == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return objV;
        } catch (Throwable th2) {
            c16658pB.O();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> a0(long id2, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f161256i;
        Function2 function2 = (Function2) sv.f.y();
        loop0: while (true) {
            objC = C17646b.c(startFrom, id2, function2);
            if (!C17629C.c(objC)) {
                AbstractC17628B abstractC17628BB = C17629C.b(objC);
                while (true) {
                    AbstractC17628B abstractC17628B = (AbstractC17628B) atomicReferenceFieldUpdater.get(this);
                    if (abstractC17628B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC17628BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                        break loop0;
                    }
                    if (!abstractC17628BB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC17628B, abstractC17628BB)) {
                        if (abstractC17628B.p()) {
                            abstractC17628B.n();
                        }
                    } else if (abstractC17628BB.p()) {
                        abstractC17628BB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C17629C.c(objC)) {
            W();
            if (startFrom.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * sv.f.f161281b < p0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) C17629C.b(objC);
        if (!B0() && id2 <= d0() / sv.f.f161281b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f161257j;
            while (true) {
                AbstractC17628B abstractC17628B2 = (AbstractC17628B) atomicReferenceFieldUpdater2.get(this);
                if (abstractC17628B2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String || !mVar.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, abstractC17628B2, mVar)) {
                    if (abstractC17628B2.p()) {
                        abstractC17628B2.n();
                    }
                } else if (mVar.p()) {
                    mVar.n();
                }
            }
        }
        long j10 = mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
        if (j10 > id2) {
            int i10 = sv.f.f161281b;
            r1(j10 * i10);
            if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * i10 < p0()) {
                mVar.b();
            }
            return null;
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a1(zv.k<?> select, Object ignoredParam) {
        m mVar;
        h1 h1Var;
        m mVar2 = (m) j0().get(this);
        while (!x0()) {
            long andIncrement = k0().getAndIncrement(this);
            int i10 = sv.f.f161281b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j10) {
                m mVarA0 = a0(j10, mVar2);
                if (mVarA0 == null) {
                    continue;
                } else {
                    mVar = mVarA0;
                }
            } else {
                mVar = mVar2;
            }
            zv.k<?> kVar = select;
            Object objN1 = n1(mVar, i11, andIncrement, kVar);
            mVar2 = mVar;
            if (objN1 == sv.f.f161292m) {
                if (kVar instanceof h1) {
                    h1Var = (h1) kVar;
                } else {
                    h1Var = null;
                }
                if (h1Var != null) {
                    T0(h1Var, mVar2, i11);
                    return;
                }
                return;
            }
            if (objN1 == sv.f.f161294o) {
                if (andIncrement < p0()) {
                    mVar2.b();
                }
                select = kVar;
            } else {
                if (objN1 != sv.f.f161293n) {
                    mVar2.b();
                    kVar.d(objN1);
                    return;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        M0(select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> b0(long id2, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f161255h;
        Function2 function2 = (Function2) sv.f.y();
        loop0: while (true) {
            objC = C17646b.c(startFrom, id2, function2);
            if (!C17629C.c(objC)) {
                AbstractC17628B abstractC17628BB = C17629C.b(objC);
                while (true) {
                    AbstractC17628B abstractC17628B = (AbstractC17628B) atomicReferenceFieldUpdater.get(this);
                    if (abstractC17628B.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String >= abstractC17628BB.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String) {
                        break loop0;
                    }
                    if (!abstractC17628BB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, abstractC17628B, abstractC17628BB)) {
                        if (abstractC17628B.p()) {
                            abstractC17628B.n();
                        }
                    } else if (abstractC17628BB.p()) {
                        abstractC17628BB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (C17629C.c(objC)) {
            W();
            if (startFrom.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * sv.f.f161281b < l0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) C17629C.b(objC);
        long j10 = mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
        if (j10 > id2) {
            int i10 = sv.f.f161281b;
            s1(j10 * i10);
            if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String * i10 < l0()) {
                mVar.b();
            }
            return null;
        }
        return mVar;
    }

    private final long d0() {
        return f161253f.get(this);
    }

    static /* synthetic */ <E> Object f1(e<E> eVar, E e10, Continuation<? super Unit> continuation) {
        m<E> mVar;
        m<E> mVar2 = (m) n0().get(eVar);
        while (true) {
            long andIncrement = o0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zZ0 = eVar.z0(andIncrement);
            int i10 = sv.f.f161281b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j11) {
                m<E> mVarB0 = eVar.b0(j11, mVar2);
                if (mVarB0 == null) {
                    if (zZ0) {
                        Object objN0 = eVar.N0(e10, continuation);
                        if (objN0 == IntrinsicsKt.f()) {
                            return objN0;
                        }
                    }
                } else {
                    mVar = mVarB0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar2 = eVar;
            E e11 = e10;
            int iP1 = eVar2.p1(mVar, i11, e11, j10, null, zZ0);
            if (iP1 != 0) {
                if (iP1 == 1) {
                    break;
                }
                if (iP1 != 2) {
                    if (iP1 != 3) {
                        if (iP1 != 4) {
                            if (iP1 == 5) {
                                mVar.b();
                            }
                            eVar = eVar2;
                            mVar2 = mVar;
                            e10 = e11;
                        } else {
                            if (j10 < eVar2.l0()) {
                                mVar.b();
                            }
                            Object objN02 = eVar2.N0(e11, continuation);
                            if (objN02 == IntrinsicsKt.f()) {
                                return objN02;
                            }
                        }
                    } else {
                        Object objG1 = eVar2.g1(mVar, i11, e11, j10, continuation);
                        if (objG1 == IntrinsicsKt.f()) {
                            return objG1;
                        }
                    }
                } else if (zZ0) {
                    mVar.t();
                    Object objN03 = eVar2.N0(e11, continuation);
                    if (objN03 == IntrinsicsKt.f()) {
                        return objN03;
                    }
                }
            } else {
                mVar.b();
                break;
            }
        }
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g1(sv.m<E> r17, int r18, E r19, long r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.e.g1(sv.m, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean h1(long curSendersAndCloseStatus) {
        if (z0(curSendersAndCloseStatus)) {
            return false;
        }
        return !P(curSendersAndCloseStatus & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable i0() {
        Throwable thF0 = f0();
        if (thF0 == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return thF0;
    }

    private final boolean l1(m<E> segment, int index, long b10) {
        Object objB = segment.B(index);
        if ((objB instanceof h1) && b10 >= f161252e.get(this) && segment.v(index, objB, sv.f.f161286g)) {
            if (j1(objB, segment, index)) {
                segment.F(index, sv.f.f161283d);
                return true;
            }
            segment.F(index, sv.f.f161289j);
            segment.C(index, false);
            return false;
        }
        return m1(segment, index, b10);
    }

    private final boolean m1(m<E> segment, int index, long b10) {
        while (true) {
            Object objB = segment.B(index);
            if (objB instanceof h1) {
                if (b10 < f161252e.get(this)) {
                    if (segment.v(index, objB, new WaiterEB((h1) objB))) {
                        return true;
                    }
                } else if (segment.v(index, objB, sv.f.f161286g)) {
                    if (j1(objB, segment, index)) {
                        segment.F(index, sv.f.f161283d);
                        return true;
                    }
                    segment.F(index, sv.f.f161289j);
                    segment.C(index, false);
                    return false;
                }
            } else {
                if (objB == sv.f.f161289j) {
                    return false;
                }
                if (objB == null) {
                    if (segment.v(index, objB, sv.f.f161284e)) {
                        return true;
                    }
                } else {
                    if (objB == sv.f.f161283d || objB == sv.f.f161287h || objB == sv.f.f161288i || objB == sv.f.f161290k || objB == sv.f.z()) {
                        return true;
                    }
                    if (objB != sv.f.f161285f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n1(m<E> segment, int index, long r10, Object waiter) {
        Object objB = segment.B(index);
        if (objB == null) {
            if (r10 >= (f161251d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return sv.f.f161293n;
                }
                if (segment.v(index, objB, waiter)) {
                    Y();
                    return sv.f.f161292m;
                }
            }
        } else if (objB == sv.f.f161283d && segment.v(index, objB, sv.f.f161288i)) {
            Y();
            return segment.D(index);
        }
        return o1(segment, index, r10, waiter);
    }

    private final Object o1(m<E> segment, int index, long r10, Object waiter) {
        while (true) {
            Object objB = segment.B(index);
            if (objB != null && objB != sv.f.f161284e) {
                if (objB == sv.f.f161283d) {
                    if (segment.v(index, objB, sv.f.f161288i)) {
                        Y();
                        return segment.D(index);
                    }
                } else {
                    if (objB != sv.f.f161289j && objB != sv.f.f161287h) {
                        if (objB == sv.f.z()) {
                            Y();
                            return sv.f.f161294o;
                        }
                        if (objB != sv.f.f161286g && segment.v(index, objB, sv.f.f161285f)) {
                            boolean z10 = objB instanceof WaiterEB;
                            if (z10) {
                                objB = ((WaiterEB) objB).waiter;
                            }
                            if (j1(objB, segment, index)) {
                                segment.F(index, sv.f.f161288i);
                                Y();
                                return segment.D(index);
                            }
                            segment.F(index, sv.f.f161289j);
                            segment.C(index, false);
                            if (z10) {
                                Y();
                            }
                            return sv.f.f161294o;
                        }
                    }
                    return sv.f.f161294o;
                }
            } else if (r10 < (f161251d.get(this) & 1152921504606846975L)) {
                if (segment.v(index, objB, sv.f.f161287h)) {
                    Y();
                    return sv.f.f161294o;
                }
            } else {
                if (waiter == null) {
                    return sv.f.f161293n;
                }
                if (segment.v(index, objB, waiter)) {
                    Y();
                    return sv.f.f161292m;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int p1(m<E> segment, int index, E element, long s10, Object waiter, boolean closed) {
        segment.G(index, element);
        if (closed) {
            return q1(segment, index, element, s10, waiter, closed);
        }
        Object objB = segment.B(index);
        if (objB == null) {
            if (P(s10)) {
                if (segment.v(index, null, sv.f.f161283d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objB instanceof h1) {
            segment.w(index);
            if (i1(objB, element)) {
                segment.F(index, sv.f.f161288i);
                P0();
                return 0;
            }
            if (segment.x(index, sv.f.f161290k) != sv.f.f161290k) {
                segment.C(index, true);
                return 5;
            }
            return 5;
        }
        return q1(segment, index, element, s10, waiter, closed);
    }

    private final int q1(m<E> segment, int index, E element, long s10, Object waiter, boolean closed) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null) {
                if (P(s10) && !closed) {
                    if (segment.v(index, null, sv.f.f161283d)) {
                        return 1;
                    }
                } else if (closed) {
                    if (segment.v(index, null, sv.f.f161289j)) {
                        segment.C(index, false);
                        return 4;
                    }
                } else {
                    if (waiter == null) {
                        return 3;
                    }
                    if (segment.v(index, null, waiter)) {
                        return 2;
                    }
                }
            } else if (objB == sv.f.f161284e) {
                if (segment.v(index, objB, sv.f.f161283d)) {
                    return 1;
                }
            } else {
                if (objB == sv.f.f161290k) {
                    segment.w(index);
                    return 5;
                }
                if (objB == sv.f.f161287h) {
                    segment.w(index);
                    return 5;
                }
                if (objB == sv.f.z()) {
                    segment.w(index);
                    W();
                    return 4;
                }
                segment.w(index);
                if (objB instanceof WaiterEB) {
                    objB = ((WaiterEB) objB).waiter;
                }
                if (i1(objB, element)) {
                    segment.F(index, sv.f.f161288i);
                    P0();
                    return 0;
                }
                if (segment.x(index, sv.f.f161290k) != sv.f.f161290k) {
                    segment.C(index, true);
                }
                return 5;
            }
        }
    }

    private final void r1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f161252e;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if (j10 < value) {
                long j11 = value;
                if (f161252e.compareAndSet(this, j10, j11)) {
                    return;
                } else {
                    value = j11;
                }
            } else {
                return;
            }
        }
    }

    private final void s0(long nAttempts) {
        if ((f161254g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f161254g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void s1(long value) {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f161251d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = 1152921504606846975L & j10;
            if (j11 < value) {
            } else {
                return;
            }
        } while (!f161251d.compareAndSet(this, j10, sv.f.w(j11, (int) (j10 >> 60))));
    }

    private final void u0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f161259l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? sv.f.f161296q : sv.f.f161297r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(f0());
    }

    private final boolean v0(m<E> segment, int index, long globalIndex) {
        Object objB;
        do {
            objB = segment.B(index);
            if (objB != null && objB != sv.f.f161284e) {
                if (objB == sv.f.f161283d) {
                    return true;
                }
                if (objB == sv.f.f161289j || objB == sv.f.z() || objB == sv.f.f161288i || objB == sv.f.f161287h) {
                    return false;
                }
                if (objB == sv.f.f161286g) {
                    return true;
                }
                if (objB == sv.f.f161285f || globalIndex != l0()) {
                    return false;
                }
                return true;
            }
        } while (!segment.v(index, objB, sv.f.f161287h));
        Y();
        return false;
    }

    protected final void X(long globalCellIndex) {
        m<E> mVarA0;
        UndeliveredElementException undeliveredElementExceptionC;
        m<E> mVar = (m) f161256i.get(this);
        while (true) {
            long j10 = f161252e.get(this);
            if (globalCellIndex < Math.max(this.capacity + j10, d0())) {
                return;
            }
            if (f161252e.compareAndSet(this, j10, 1 + j10)) {
                int i10 = sv.f.f161281b;
                long j11 = j10 / i10;
                int i11 = (int) (j10 % i10);
                if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j11) {
                    mVarA0 = a0(j11, mVar);
                    if (mVarA0 == null) {
                        continue;
                    }
                } else {
                    mVarA0 = mVar;
                }
                Object objN1 = n1(mVarA0, i11, j10, null);
                if (objN1 == sv.f.f161294o) {
                    if (j10 < p0()) {
                        mVarA0.b();
                    }
                } else {
                    mVarA0.b();
                    Function1<E, Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (undeliveredElementExceptionC = C17668x.c(function1, objN1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                }
                mVar = mVarA0;
            }
        }
    }

    @Override // sv.v
    public final void d(CancellationException cause) {
        Q(cause);
    }

    @Override // sv.v
    public Object e(Continuation<? super E> continuation) {
        return W0(this, continuation);
    }

    @Override // sv.w
    public void f(Function1<? super Throwable, Unit> handler) {
        if (!androidx.concurrent.futures.b.a(f161259l, this, null, handler)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f161259l;
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != sv.f.f161296q) {
                    if (obj == sv.f.f161297r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.b.a(f161259l, this, sv.f.f161296q, sv.f.f161297r));
            handler.invoke(f0());
        }
    }

    protected final Throwable f0() {
        return (Throwable) f161258k.get(this);
    }

    @Override // sv.w
    public Object k(E element) {
        E e10;
        int i10;
        m mVar;
        e<E> eVar;
        h1 h1Var;
        if (!h1(f161251d.get(this))) {
            Object obj = sv.f.f161289j;
            m mVar2 = (m) n0().get(this);
            while (true) {
                long andIncrement = o0().getAndIncrement(this);
                long j10 = andIncrement & 1152921504606846975L;
                boolean zZ0 = z0(andIncrement);
                int i11 = sv.f.f161281b;
                long j11 = j10 / i11;
                int i12 = (int) (j10 % i11);
                if (mVar2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j11) {
                    m mVarB0 = b0(j11, mVar2);
                    if (mVarB0 == null) {
                        if (zZ0) {
                            return k.INSTANCE.a(m0());
                        }
                    } else {
                        i10 = i12;
                        mVar = mVarB0;
                        eVar = this;
                        e10 = element;
                    }
                } else {
                    e10 = element;
                    i10 = i12;
                    mVar = mVar2;
                    eVar = this;
                }
                int iP1 = eVar.p1(mVar, i10, e10, j10, obj, zZ0);
                mVar2 = mVar;
                if (iP1 != 0) {
                    if (iP1 != 1) {
                        if (iP1 != 2) {
                            if (iP1 != 3) {
                                if (iP1 != 4) {
                                    if (iP1 == 5) {
                                        mVar2.b();
                                    }
                                    element = e10;
                                } else {
                                    if (j10 < l0()) {
                                        mVar2.b();
                                    }
                                    return k.INSTANCE.a(m0());
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else {
                            if (zZ0) {
                                mVar2.t();
                                return k.INSTANCE.a(m0());
                            }
                            if (obj instanceof h1) {
                                h1Var = (h1) obj;
                            } else {
                                h1Var = null;
                            }
                            if (h1Var != null) {
                                U0(h1Var, mVar2, i10);
                            }
                            mVar2.t();
                            return k.INSTANCE.b();
                        }
                    } else {
                        return k.INSTANCE.c(Unit.f142422a);
                    }
                } else {
                    mVar2.b();
                    return k.INSTANCE.c(Unit.f142422a);
                }
            }
        } else {
            return k.INSTANCE.b();
        }
    }

    public final long l0() {
        return f161252e.get(this);
    }

    protected final Throwable m0() {
        Throwable thF0 = f0();
        if (thF0 == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return thF0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sv.v
    public Object n() {
        m mVarA0;
        h1 h1Var;
        long j10 = f161252e.get(this);
        long j11 = f161251d.get(this);
        if (y0(j11)) {
            return k.INSTANCE.a(f0());
        }
        if (j10 < (j11 & 1152921504606846975L)) {
            Object obj = sv.f.f161290k;
            m mVar = (m) j0().get(this);
            while (!x0()) {
                long andIncrement = k0().getAndIncrement(this);
                int i10 = sv.f.f161281b;
                long j12 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (mVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j12) {
                    mVarA0 = a0(j12, mVar);
                    if (mVarA0 == null) {
                        continue;
                    }
                } else {
                    mVarA0 = mVar;
                }
                Object objN1 = n1(mVarA0, i11, andIncrement, obj);
                if (objN1 == sv.f.f161292m) {
                    if (obj instanceof h1) {
                        h1Var = (h1) obj;
                    } else {
                        h1Var = null;
                    }
                    if (h1Var != null) {
                        T0(h1Var, mVarA0, i11);
                    }
                    t1(andIncrement);
                    mVarA0.t();
                    return k.INSTANCE.b();
                }
                if (objN1 == sv.f.f161294o) {
                    if (andIncrement < p0()) {
                        mVarA0.b();
                    }
                    mVar = mVarA0;
                } else {
                    if (objN1 != sv.f.f161293n) {
                        mVarA0.b();
                        return k.INSTANCE.c(objN1);
                    }
                    throw new IllegalStateException("unexpected");
                }
            }
            return k.INSTANCE.a(f0());
        }
        return k.INSTANCE.b();
    }

    @Override // sv.v
    public Object o(Continuation<? super k<? extends E>> continuation) {
        return X0(this, continuation);
    }

    public final long p0() {
        return f161251d.get(this) & 1152921504606846975L;
    }

    @Override // sv.w
    public Object r(E e10, Continuation<? super Unit> continuation) {
        return f1(this, e10, continuation);
    }

    public final boolean r0() {
        while (true) {
            m<E> mVarA0 = (m) f161256i.get(this);
            long jL0 = l0();
            if (p0() <= jL0) {
                return false;
            }
            int i10 = sv.f.f161281b;
            long j10 = jL0 / i10;
            if (mVarA0.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String != j10 && (mVarA0 = a0(j10, mVarA0)) == null) {
                if (((m) f161256i.get(this)).io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String < j10) {
                    return false;
                }
            } else {
                mVarA0.b();
                if (v0(mVarA0, (int) (jL0 % i10), jL0)) {
                    return true;
                }
                f161252e.compareAndSet(this, jL0, 1 + jL0);
            }
        }
    }

    @Override // sv.w
    public boolean s() {
        return z0(f161251d.get(this));
    }

    public boolean x0() {
        return y0(f161251d.get(this));
    }
}

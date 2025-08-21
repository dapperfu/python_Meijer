package gw;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14170dq;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001`B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b2\u0010-J\u000f\u00103\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010$J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u0010$J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010$J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010@\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020F2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020FH\u0016¢\u0006\u0004\bQ\u0010HJ\u0017\u0010S\u001a\u00020F2\u0006\u0010R\u001a\u00020\u0011H\u0016¢\u0006\u0004\bS\u0010JJ\u000f\u0010T\u001a\u00020.H\u0016¢\u0006\u0004\bT\u00100J\u000f\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020U2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00132\u0006\u0010@\u001a\u00020UH\u0016¢\u0006\u0004\bZ\u0010[J'\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010\\\u001a\u00020.2\u0006\u0010@\u001a\u00020^H\u0016¢\u0006\u0004\b\\\u0010_J\r\u0010`\u001a\u00020\u0013¢\u0006\u0004\b`\u0010\u0006J\u0017\u0010a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010\u0015J\u0017\u0010c\u001a\u00020\u00002\u0006\u0010b\u001a\u000207H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020FH\u0016¢\u0006\u0004\bf\u0010gJ'\u0010j\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020.H\u0016¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u00002\u0006\u0010l\u001a\u00020.H\u0016¢\u0006\u0004\bm\u0010nJ\u001f\u0010o\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bo\u0010pJ/\u0010q\u001a\u00020\u00002\u0006\u0010e\u001a\u00020F2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020.2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u00002\u0006\u0010s\u001a\u00020UH\u0016¢\u0006\u0004\bt\u0010uJ'\u0010v\u001a\u00020\u00002\u0006\u0010s\u001a\u00020U2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020.2\u0006\u0010s\u001a\u00020^H\u0016¢\u0006\u0004\bx\u0010_J\u0017\u0010z\u001a\u00020\u00112\u0006\u0010s\u001a\u00020yH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u00020.H\u0016¢\u0006\u0004\b}\u0010nJ\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020.H\u0016¢\u0006\u0004\b\u007f\u0010nJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020.H\u0016¢\u0006\u0005\b\u0080\u0001\u0010nJ\u0019\u0010\u0081\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020.H\u0016¢\u0006\u0005\b\u0081\u0001\u0010nJ\u001b\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J\u001b\u0010\u0086\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0084\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0084\u0001J\u001c\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u0088\u0001\u001a\u00020.H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J!\u0010\u008c\u0001\u001a\u00020\u00132\u0006\u0010s\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u008c\u0001\u0010BJ \u0010\\\u001a\u00020\u00112\u0006\u0010@\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\\\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020%2\u0007\u0010\u008e\u0001\u001a\u00020\u00112\u0007\u0010\u008f\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001b\u0010\u0093\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J$\u0010\u0095\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u00020\u00112\u0007\u0010\u008f\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0094\u0001J$\u0010\u009b\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u0002072\u0007\u0010\u008e\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0096\u0001J#\u0010\u009c\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u000207H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J4\u0010\u009f\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0092\u0001\u001a\u0002072\u0007\u0010\u009e\u0001\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020.H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0011\u0010¢\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¢\u0001\u0010\u0010J\u0011\u0010£\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b£\u0001\u0010\u0006J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001f\u0010©\u0001\u001a\u00020\u000e2\n\u0010¨\u0001\u001a\u0005\u0018\u00010§\u0001H\u0096\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020.H\u0016¢\u0006\u0005\b«\u0001\u00100J\u0011\u0010¬\u0001\u001a\u00020FH\u0016¢\u0006\u0005\b¬\u0001\u0010HJ\u000f\u0010\u00ad\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\bJ\u000f\u0010|\u001a\u00020\u0000H\u0016¢\u0006\u0004\b|\u0010\bJ\u000f\u0010®\u0001\u001a\u000207¢\u0006\u0005\b®\u0001\u00109J\u0018\u0010¯\u0001\u001a\u0002072\u0006\u0010\u0012\u001a\u00020.¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010³\u0001\u001a\u00030±\u00012\n\b\u0002\u0010²\u0001\u001a\u00030±\u0001H\u0007¢\u0006\u0006\b³\u0001\u0010´\u0001R\u001b\u0010¶\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u0007\n\u0005\b`\u0010µ\u0001R.\u0010¸\u0001\u001a\u00020\u00112\u0007\u0010·\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010O\u001a\u0005\b¸\u0001\u0010$\"\u0005\b¹\u0001\u0010\u0015R\u0016\u0010»\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\b¨\u0006¼\u0001"}, d2 = {"Lgw/e;", "Lgw/g;", "Lgw/f;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "P", "()Lgw/e;", "Ljava/io/OutputStream;", "Q3", "()Ljava/io/OutputStream;", "j", "i", "", "i2", "()Z", "", "byteCount", "", "C1", "(J)V", "t", "(J)Z", "peek", "()Lgw/g;", "Ljava/io/InputStream;", "T3", "()Ljava/io/InputStream;", "out", "offset", "g", "(Lgw/e;JJ)Lgw/e;", "K0", "(Ljava/io/OutputStream;J)Lgw/e;", "c", "()J", "", "readByte", "()B", "pos", "l", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "p1", "c3", "s1", "p2", "R3", "Lgw/h;", "P2", "()Lgw/h;", "O1", "(J)Lgw/h;", "Lgw/z;", "options", "I2", "(Lgw/z;)I", "sink", "Z1", "(Lgw/e;J)V", "Lgw/J;", "Q2", "(Lgw/J;)J", "", "n3", "()Ljava/lang/String;", "M1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "G2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "J", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "i1", "limit", "w0", "K2", "", "d2", "()[B", "H", "(J)[B", "readFully", "([B)V", "read", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "a", "skip", "byteString", "e0", "(Lgw/h;)Lgw/e;", "string", "Q0", "(Ljava/lang/String;)Lgw/e;", "beginIndex", "endIndex", "S0", "(Ljava/lang/String;II)Lgw/e;", "codePoint", "T0", "(I)Lgw/e;", "J0", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lgw/e;", "H0", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lgw/e;", "source", "h0", "([B)Lgw/e;", "j0", "([BII)Lgw/e;", "write", "Lgw/K;", "t2", "(Lgw/K;)J", "b", "k0", "s", "E0", "o0", "s0", "v", "v0", "(J)Lgw/e;", "x0", "m0", "n0", "minimumCapacity", "Lgw/G;", "Y", "(I)Lgw/G;", "E1", "(Lgw/e;J)J", "fromIndex", "toIndex", "m", "(BJJ)J", "bytes", "o1", "(Lgw/h;)J", "p", "(Lgw/h;J)J", "u", "(Lgw/h;JJ)J", "targetBytes", "h3", "w", "d0", "(JLgw/h;)Z", "bytesOffset", "z", "(JLgw/h;II)Z", "flush", "isOpen", "close", "Lgw/L;", "timeout", "()Lgw/L;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "d", "O", "R", "(I)Lgw/h;", "Lgw/e$a;", "unsafeCursor", "A", "(Lgw/e$a;)Lgw/e$a;", "Lgw/G;", "head", "value", "size", "K", "e", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gw.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C14416e implements InterfaceC14418g, InterfaceC14417f, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public G head;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006&"}, d2 = {"Lgw/e$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "b", "()I", "", "offset", "d", "(J)I", "newSize", "c", "(J)J", "", "close", "Lgw/e;", "a", "Lgw/e;", "buffer", "", "Z", "readWrite", "Lgw/G;", "Lgw/G;", "()Lgw/G;", "g", "(Lgw/G;)V", "segment", "J", "", "e", "[B", "data", "f", "I", "start", "end", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gw.e$a */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public C14416e buffer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public boolean readWrite;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private G segment;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public byte[] data;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public long offset = -1;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int start = -1;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public int end = -1;

        /* renamed from: a, reason: from getter */
        public final G getSegment() {
            return this.segment;
        }

        public final int b() {
            long j10 = this.offset;
            C14416e c14416e = this.buffer;
            Intrinsics.g(c14416e);
            if (j10 == c14416e.getSize()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.offset;
            return d(j11 == -1 ? 0L : j11 + (this.end - this.start));
        }

        public final long c(long newSize) {
            C14416e c14416e = this.buffer;
            if (c14416e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c14416e.getSize();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(("newSize < 0: " + newSize).toString());
                }
                long j10 = size - newSize;
                while (true) {
                    if (j10 <= 0) {
                        break;
                    }
                    G g10 = c14416e.head;
                    Intrinsics.g(g10);
                    G g11 = g10.prev;
                    Intrinsics.g(g11);
                    int i10 = g11.limit;
                    long j11 = i10 - g11.pos;
                    if (j11 > j10) {
                        g11.limit = i10 - ((int) j10);
                        break;
                    }
                    c14416e.head = g11.b();
                    H.b(g11);
                    j10 -= j11;
                }
                g(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j12 = newSize - size;
                boolean z10 = true;
                while (j12 > 0) {
                    G gY = c14416e.Y(1);
                    int iMin = (int) Math.min(j12, 8192 - gY.limit);
                    gY.limit += iMin;
                    j12 -= iMin;
                    if (z10) {
                        g(gY);
                        this.offset = size;
                        this.data = gY.data;
                        int i11 = gY.limit;
                        this.start = i11 - iMin;
                        this.end = i11;
                        z10 = false;
                    }
                }
            }
            c14416e.K(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            g(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int d(long offset) {
            G gC;
            C14416e c14416e = this.buffer;
            if (c14416e == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > c14416e.getSize()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + offset + " > size=" + c14416e.getSize());
            }
            if (offset == -1 || offset == c14416e.getSize()) {
                g(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = c14416e.getSize();
            G segment = c14416e.head;
            long j10 = 0;
            if (getSegment() != null) {
                long j11 = this.offset;
                int i10 = this.start;
                Intrinsics.g(getSegment());
                long j12 = j11 - (i10 - r9.pos);
                if (j12 > offset) {
                    gC = segment;
                    segment = getSegment();
                    size = j12;
                } else {
                    gC = getSegment();
                    j10 = j12;
                }
            } else {
                gC = segment;
            }
            if (size - offset > offset - j10) {
                while (true) {
                    Intrinsics.g(gC);
                    int i11 = gC.limit;
                    int i12 = gC.pos;
                    if (offset < (i11 - i12) + j10) {
                        break;
                    }
                    j10 += i11 - i12;
                    gC = gC.next;
                }
            } else {
                while (size > offset) {
                    Intrinsics.g(segment);
                    segment = segment.prev;
                    Intrinsics.g(segment);
                    size -= segment.limit - segment.pos;
                }
                j10 = size;
                gC = segment;
            }
            if (this.readWrite) {
                Intrinsics.g(gC);
                if (gC.shared) {
                    G gF = gC.f();
                    if (c14416e.head == gC) {
                        c14416e.head = gF;
                    }
                    gC = gC.c(gF);
                    G g10 = gC.prev;
                    Intrinsics.g(g10);
                    g10.b();
                }
            }
            g(gC);
            this.offset = offset;
            Intrinsics.g(gC);
            this.data = gC.data;
            int i13 = gC.pos + ((int) (offset - j10));
            this.start = i13;
            int i14 = gC.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void g(G g10) {
            this.segment = g10;
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"gw/e$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: gw.e$b */
    public static final class b extends InputStream implements InputStreamRetargetInterface {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (C14416e.this.getSize() > 0) {
                return C14416e.this.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C14416e.this.getSize(), a.e.API_PRIORITY_OTHER);
        }

        public String toString() {
            return C14416e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int offset, int byteCount) {
            Intrinsics.j(sink, "sink");
            return C14416e.this.read(sink, offset, byteCount);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gw/e$c", "Ljava/io/OutputStream;", "", "b", "", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: gw.e$c */
    public static final class c extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(int b10) {
            C14416e.this.writeByte(b10);
        }

        c() {
        }

        public String toString() {
            return C14416e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) {
            Intrinsics.j(data, "data");
            C14416e.this.write(data, offset, byteCount);
        }
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C14416e writeShort(int s10) {
        G gY = Y(2);
        byte[] bArr = gY.data;
        int i10 = gY.limit;
        bArr[i10] = (byte) ((s10 >>> 8) & l3.f93323c);
        bArr[i10 + 1] = (byte) (s10 & l3.f93323c);
        gY.limit = i10 + 2;
        K(getSize() + 2);
        return this;
    }

    @Override // gw.InterfaceC14418g
    public C14416e P() {
        return this;
    }

    public final G Y(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        G g10 = this.head;
        if (g10 != null) {
            Intrinsics.g(g10);
            G g11 = g10.prev;
            Intrinsics.g(g11);
            return (g11.limit + minimumCapacity > 8192 || !g11.owner) ? g11.c(H.c()) : g11;
        }
        G gC = H.c();
        this.head = gC;
        gC.prev = gC;
        gC.next = gC;
        return gC;
    }

    @Override // gw.K, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // gw.InterfaceC14418g
    public C14416e e() {
        return this;
    }

    @Override // gw.InterfaceC14417f, gw.J, java.io.Flushable
    public void flush() {
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C14416e X() {
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C14416e t0() {
        return this;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C14416e writeByte(int b10) {
        G gY = Y(1);
        byte[] bArr = gY.data;
        int i10 = gY.limit;
        gY.limit = i10 + 1;
        bArr[i10] = (byte) b10;
        K(getSize() + 1);
        return this;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C14416e writeInt(int i10) {
        G gY = Y(4);
        byte[] bArr = gY.data;
        int i11 = gY.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & l3.f93323c);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & l3.f93323c);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & l3.f93323c);
        bArr[i11 + 3] = (byte) (i10 & l3.f93323c);
        gY.limit = i11 + 4;
        K(getSize() + 4);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) throws IOException {
        Intrinsics.j(sink, "sink");
        G g10 = this.head;
        if (g10 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), g10.limit - g10.pos);
        sink.put(g10.data, g10.pos, iMin);
        int i10 = g10.pos + iMin;
        g10.pos = i10;
        this.size -= iMin;
        if (i10 == g10.limit) {
            this.head = g10.b();
            H.b(g10);
        }
        return iMin;
    }

    public static /* synthetic */ a D(C14416e c14416e, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = C14413b.d();
        }
        return c14416e.A(aVar);
    }

    public static /* synthetic */ C14416e P0(C14416e c14416e, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = c14416e.size;
        }
        return c14416e.K0(outputStream, j10);
    }

    @JvmOverloads
    public final a A(a unsafeCursor) {
        Intrinsics.j(unsafeCursor, "unsafeCursor");
        return hw.a.d(this, unsafeCursor);
    }

    @Override // gw.InterfaceC14418g
    public void C1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // gw.J
    public void E1(C14416e source, long byteCount) {
        G g10;
        Intrinsics.j(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C14413b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            G g11 = source.head;
            Intrinsics.g(g11);
            int i10 = g11.limit;
            Intrinsics.g(source.head);
            if (byteCount < i10 - r1.pos) {
                G g12 = this.head;
                if (g12 != null) {
                    Intrinsics.g(g12);
                    g10 = g12.prev;
                } else {
                    g10 = null;
                }
                if (g10 != null && g10.owner) {
                    if ((g10.limit + byteCount) - (g10.shared ? 0 : g10.pos) <= 8192) {
                        G g13 = source.head;
                        Intrinsics.g(g13);
                        g13.g(g10, (int) byteCount);
                        source.K(source.getSize() - byteCount);
                        K(getSize() + byteCount);
                        return;
                    }
                }
                G g14 = source.head;
                Intrinsics.g(g14);
                source.head = g14.e((int) byteCount);
            }
            G g15 = source.head;
            Intrinsics.g(g15);
            long j10 = g15.limit - g15.pos;
            source.head = g15.b();
            G g16 = this.head;
            if (g16 == null) {
                this.head = g15;
                g15.prev = g15;
                g15.next = g15;
            } else {
                Intrinsics.g(g16);
                G g17 = g16.prev;
                Intrinsics.g(g17);
                g17.c(g15).a();
            }
            source.K(source.getSize() - j10);
            K(getSize() + j10);
            byteCount -= j10;
        }
    }

    @Override // gw.InterfaceC14418g
    public String G2(Charset charset) {
        Intrinsics.j(charset, "charset");
        return J(this.size, charset);
    }

    public byte[] H(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    public C14416e H0(String string, int beginIndex, int endIndex, Charset charset) {
        Intrinsics.j(string, "string");
        Intrinsics.j(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        if (Intrinsics.e(charset, Charsets.UTF_8)) {
            return N0(string, beginIndex, endIndex);
        }
        String strSubstring = string.substring(beginIndex, endIndex);
        Intrinsics.i(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.i(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // gw.InterfaceC14418g
    public int I2(z options) throws EOFException {
        Intrinsics.j(options, "options");
        int iJ = hw.a.j(this, options, false, 2, null);
        if (iJ == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iJ].V());
        return iJ;
    }

    public String J(long byteCount, Charset charset) throws EOFException {
        Intrinsics.j(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        G g10 = this.head;
        Intrinsics.g(g10);
        int i10 = g10.pos;
        if (i10 + byteCount > g10.limit) {
            return new String(H(byteCount), charset);
        }
        int i11 = (int) byteCount;
        String str = new String(g10.data, i10, i11, charset);
        int i12 = g10.pos + i11;
        g10.pos = i12;
        this.size -= byteCount;
        if (i12 == g10.limit) {
            this.head = g10.b();
            H.b(g10);
        }
        return str;
    }

    public C14416e J0(String string, Charset charset) {
        Intrinsics.j(string, "string");
        Intrinsics.j(charset, "charset");
        return H0(string, 0, string.length(), charset);
    }

    public final void K(long j10) {
        this.size = j10;
    }

    @JvmOverloads
    public final C14416e K0(OutputStream out, long byteCount) throws IOException {
        Intrinsics.j(out, "out");
        C14413b.b(this.size, 0L, byteCount);
        G g10 = this.head;
        long j10 = byteCount;
        while (j10 > 0) {
            Intrinsics.g(g10);
            int iMin = (int) Math.min(j10, g10.limit - g10.pos);
            out.write(g10.data, g10.pos, iMin);
            int i10 = g10.pos + iMin;
            g10.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == g10.limit) {
                G gB = g10.b();
                this.head = gB;
                H.b(g10);
                g10 = gB;
            }
        }
        return this;
    }

    @Override // gw.InterfaceC14418g
    public String M1(long byteCount) throws EOFException {
        return J(byteCount, Charsets.UTF_8);
    }

    @Override // gw.InterfaceC14418g
    public C14419h O1(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + byteCount).toString());
        }
        if (getSize() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new C14419h(H(byteCount));
        }
        C14419h c14419hR = R((int) byteCount);
        skip(byteCount);
        return c14419hR;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public C14416e G0(String string) {
        Intrinsics.j(string, "string");
        return N0(string, 0, string.length());
    }

    @Override // gw.InterfaceC14418g
    public long Q2(J sink) throws IOException {
        Intrinsics.j(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.E1(this, size);
        }
        return size;
    }

    @Override // gw.InterfaceC14417f
    public OutputStream Q3() {
        return new c();
    }

    public final C14419h R(int byteCount) {
        if (byteCount == 0) {
            return C14419h.f134558e;
        }
        C14413b.b(getSize(), 0L, byteCount);
        G g10 = this.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < byteCount) {
            Intrinsics.g(g10);
            int i13 = g10.limit;
            int i14 = g10.pos;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            g10 = g10.next;
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        G g11 = this.head;
        int i15 = 0;
        while (i10 < byteCount) {
            Intrinsics.g(g11);
            bArr[i15] = g11.data;
            i10 += g11.limit - g11.pos;
            iArr[i15] = Math.min(i10, byteCount);
            iArr[i15 + i12] = g11.pos;
            g11.shared = true;
            i15++;
            g11 = g11.next;
        }
        return new I(bArr, iArr);
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public C14416e N0(String string, int beginIndex, int endIndex) {
        char cCharAt;
        Intrinsics.j(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + beginIndex).toString());
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + endIndex + " < " + beginIndex).toString());
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + endIndex + " > " + string.length()).toString());
        }
        while (beginIndex < endIndex) {
            char cCharAt2 = string.charAt(beginIndex);
            if (cCharAt2 < 128) {
                G gY = Y(1);
                byte[] bArr = gY.data;
                int i10 = gY.limit - beginIndex;
                int iMin = Math.min(endIndex, 8192 - i10);
                int i11 = beginIndex + 1;
                bArr[beginIndex + i10] = (byte) cCharAt2;
                while (true) {
                    beginIndex = i11;
                    if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                        break;
                    }
                    i11 = beginIndex + 1;
                    bArr[beginIndex + i10] = (byte) cCharAt;
                }
                int i12 = gY.limit;
                int i13 = (i10 + beginIndex) - i12;
                gY.limit = i12 + i13;
                K(getSize() + i13);
            } else {
                if (cCharAt2 < 2048) {
                    G gY2 = Y(2);
                    byte[] bArr2 = gY2.data;
                    int i14 = gY2.limit;
                    bArr2[i14] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    gY2.limit = i14 + 2;
                    K(getSize() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    G gY3 = Y(3);
                    byte[] bArr3 = gY3.data;
                    int i15 = gY3.limit;
                    bArr3[i15] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    gY3.limit = i15 + 3;
                    K(getSize() + 3);
                } else {
                    int i16 = beginIndex + 1;
                    char cCharAt3 = i16 < endIndex ? string.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        beginIndex = i16;
                    } else {
                        int i17 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        G gY4 = Y(4);
                        byte[] bArr4 = gY4.data;
                        int i18 = gY4.limit;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        gY4.limit = i18 + 4;
                        K(getSize() + 4);
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C14416e Z(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            G gY = Y(2);
            byte[] bArr = gY.data;
            int i10 = gY.limit;
            bArr[i10] = (byte) ((codePoint >> 6) | 192);
            bArr[i10 + 1] = (byte) ((codePoint & 63) | 128);
            gY.limit = i10 + 2;
            K(getSize() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            G gY2 = Y(3);
            byte[] bArr2 = gY2.data;
            int i11 = gY2.limit;
            bArr2[i11] = (byte) ((codePoint >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((codePoint & 63) | 128);
            gY2.limit = i11 + 3;
            K(getSize() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C14413b.l(codePoint));
        }
        G gY3 = Y(4);
        byte[] bArr3 = gY3.data;
        int i12 = gY3.limit;
        bArr3[i12] = (byte) ((codePoint >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((codePoint & 63) | 128);
        gY3.limit = i12 + 4;
        K(getSize() + 4);
        return this;
    }

    @Override // gw.InterfaceC14418g
    public InputStream T3() {
        return new b();
    }

    @Override // gw.InterfaceC14418g
    public void Z1(C14416e sink, long byteCount) throws EOFException {
        Intrinsics.j(sink, "sink");
        if (getSize() >= byteCount) {
            sink.E1(this, byteCount);
        } else {
            sink.E1(this, getSize());
            throw new EOFException();
        }
    }

    public final C14416e d() {
        C14416e c14416e = new C14416e();
        if (getSize() == 0) {
            return c14416e;
        }
        G g10 = this.head;
        Intrinsics.g(g10);
        G gD = g10.d();
        c14416e.head = gD;
        gD.prev = gD;
        gD.next = gD;
        for (G g11 = g10.next; g11 != g10; g11 = g11.next) {
            G g12 = gD.prev;
            Intrinsics.g(g12);
            Intrinsics.g(g11);
            g12.c(g11.d());
        }
        c14416e.K(getSize());
        return c14416e;
    }

    @Override // gw.InterfaceC14418g
    public boolean d0(long offset, C14419h bytes) {
        Intrinsics.j(bytes, "bytes");
        return z(offset, bytes, 0, bytes.V());
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C14416e g1(C14419h byteString) {
        Intrinsics.j(byteString, "byteString");
        byteString.d0(this, 0, byteString.V());
        return this;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14416e)) {
            return false;
        }
        C14416e c14416e = (C14416e) other;
        if (getSize() != c14416e.getSize()) {
            return false;
        }
        if (getSize() == 0) {
            return true;
        }
        G g10 = this.head;
        Intrinsics.g(g10);
        G g11 = c14416e.head;
        Intrinsics.g(g11);
        int i10 = g10.pos;
        int i11 = g11.pos;
        long j10 = 0;
        while (j10 < getSize()) {
            long jMin = Math.min(g10.limit - i10, g11.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (g10.data[i10] != g11.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == g10.limit) {
                g10 = g10.next;
                Intrinsics.g(g10);
                i10 = g10.pos;
            }
            if (i11 == g11.limit) {
                g11 = g11.next;
                Intrinsics.g(g11);
                i11 = g11.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    public final C14416e g(C14416e out, long offset, long byteCount) {
        Intrinsics.j(out, "out");
        long j10 = offset;
        C14413b.b(getSize(), j10, byteCount);
        if (byteCount != 0) {
            out.K(out.getSize() + byteCount);
            G g10 = this.head;
            while (true) {
                Intrinsics.g(g10);
                int i10 = g10.limit;
                int i11 = g10.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                g10 = g10.next;
            }
            G g11 = g10;
            long j11 = byteCount;
            while (j11 > 0) {
                Intrinsics.g(g11);
                G gD = g11.d();
                int i12 = gD.pos + ((int) j10);
                gD.pos = i12;
                gD.limit = Math.min(i12 + ((int) j11), gD.limit);
                G g12 = out.head;
                if (g12 == null) {
                    gD.prev = gD;
                    gD.next = gD;
                    out.head = gD;
                } else {
                    Intrinsics.g(g12);
                    G g13 = g12.prev;
                    Intrinsics.g(g13);
                    g13.c(gD);
                }
                j11 -= gD.limit - gD.pos;
                g11 = g11.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C14416e write(byte[] source) {
        Intrinsics.j(source, "source");
        return write(source, 0, source.length);
    }

    @Override // gw.InterfaceC14418g
    public long h3(C14419h targetBytes) {
        Intrinsics.j(targetBytes, "targetBytes");
        return w(targetBytes, 0L);
    }

    public int hashCode() {
        G g10 = this.head;
        if (g10 == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = g10.limit;
            for (int i12 = g10.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + g10.data[i12];
            }
            g10 = g10.next;
            Intrinsics.g(g10);
        } while (g10 != this.head);
        return i10;
    }

    @Override // gw.InterfaceC14418g
    public boolean i2() {
        return this.size == 0;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C14416e write(byte[] source, int offset, int byteCount) {
        Intrinsics.j(source, "source");
        long j10 = byteCount;
        C14413b.b(source.length, offset, j10);
        int i10 = byteCount + offset;
        while (offset < i10) {
            G gY = Y(1);
            int iMin = Math.min(i10 - offset, 8192 - gY.limit);
            int i11 = offset + iMin;
            ArraysKt.j(source, gY.data, gY.limit, offset, i11);
            gY.limit += iMin;
            offset = i11;
        }
        K(getSize() + j10);
        return this;
    }

    public long m(byte b10, long fromIndex, long toIndex) {
        G g10;
        int i10;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + getSize() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > getSize()) {
            toIndex = getSize();
        }
        if (fromIndex == toIndex || (g10 = this.head) == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                g10 = g10.prev;
                Intrinsics.g(g10);
                size -= g10.limit - g10.pos;
            }
            while (size < toIndex) {
                byte[] bArr = g10.data;
                int iMin = (int) Math.min(g10.limit, (g10.pos + toIndex) - size);
                i10 = (int) ((g10.pos + fromIndex) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += g10.limit - g10.pos;
                g10 = g10.next;
                Intrinsics.g(g10);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j10 = (g10.limit - g10.pos) + size;
            if (j10 > fromIndex) {
                break;
            }
            g10 = g10.next;
            Intrinsics.g(g10);
            size = j10;
        }
        while (size < toIndex) {
            byte[] bArr2 = g10.data;
            int iMin2 = (int) Math.min(g10.limit, (g10.pos + toIndex) - size);
            i10 = (int) ((g10.pos + fromIndex) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += g10.limit - g10.pos;
            g10 = g10.next;
            Intrinsics.g(g10);
            fromIndex = size;
        }
        return -1L;
        return (i10 - g10.pos) + size;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C14416e G1(long v10) {
        boolean z10;
        if (v10 == 0) {
            return writeByte(48);
        }
        if (v10 < 0) {
            v10 = -v10;
            if (v10 < 0) {
                return G0("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iE = hw.a.e(v10);
        if (z10) {
            iE++;
        }
        G gY = Y(iE);
        byte[] bArr = gY.data;
        int i10 = gY.limit + iE;
        while (v10 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = hw.a.f()[(int) (v10 % j10)];
            v10 /= j10;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        gY.limit += iE;
        K(getSize() + iE);
        return this;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C14416e M2(long v10) {
        if (v10 == 0) {
            return writeByte(48);
        }
        long j10 = (v10 >>> 1) | v10;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        G gY = Y(i10);
        byte[] bArr = gY.data;
        int i11 = gY.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = hw.a.f()[(int) (15 & v10)];
            v10 >>>= 4;
        }
        gY.limit += i10;
        K(getSize() + i10);
        return this;
    }

    @Override // gw.InterfaceC14418g
    public String n3() {
        return J(this.size, Charsets.UTF_8);
    }

    @Override // gw.InterfaceC14418g
    public long o1(C14419h bytes) throws IOException {
        Intrinsics.j(bytes, "bytes");
        return p(bytes, 0L);
    }

    public long p(C14419h bytes, long fromIndex) throws IOException {
        Intrinsics.j(bytes, "bytes");
        return u(bytes, fromIndex, Long.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new gw.C14416e().m0(r8).k0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.n3());
     */
    @Override // gw.InterfaceC14418g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long p2() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.C14416e.p2():long");
    }

    @Override // gw.InterfaceC14418g
    public InterfaceC14418g peek() {
        return w.c(new C(this));
    }

    @Override // gw.InterfaceC14418g
    public void readFully(byte[] sink) throws EOFException {
        Intrinsics.j(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @JvmName
    /* renamed from: size, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // gw.InterfaceC14418g
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            G g10 = this.head;
            if (g10 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, g10.limit - g10.pos);
            long j10 = iMin;
            K(getSize() - j10);
            byteCount -= j10;
            int i10 = g10.pos + iMin;
            g10.pos = i10;
            if (i10 == g10.limit) {
                this.head = g10.b();
                H.b(g10);
            }
        }
    }

    @Override // gw.InterfaceC14418g
    public boolean t(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // gw.InterfaceC14417f
    public long t2(K source) throws IOException {
        Intrinsics.j(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // gw.K
    /* renamed from: timeout */
    public L getF134544a() {
        return L.f134518e;
    }

    public long u(C14419h bytes, long fromIndex, long toIndex) throws IOException {
        Intrinsics.j(bytes, "bytes");
        return hw.a.c(this, bytes, fromIndex, toIndex, 0, 0, 24, null);
    }

    public C14416e v0(long v10) {
        G gY = Y(8);
        byte[] bArr = gY.data;
        int i10 = gY.limit;
        bArr[i10] = (byte) ((v10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((v10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((v10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((v10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((v10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((v10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((v10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (v10 & 255);
        gY.limit = i10 + 8;
        K(getSize() + 8);
        return this;
    }

    public long w(C14419h targetBytes, long fromIndex) {
        int i10;
        int i11;
        Intrinsics.j(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + fromIndex).toString());
        }
        G g10 = this.head;
        if (g10 == null) {
            return -1L;
        }
        if (getSize() - fromIndex < fromIndex) {
            size = getSize();
            while (size > fromIndex) {
                g10 = g10.prev;
                Intrinsics.g(g10);
                size -= g10.limit - g10.pos;
            }
            if (targetBytes.V() == 2) {
                byte bU = targetBytes.u(0);
                byte bU2 = targetBytes.u(1);
                while (size < getSize()) {
                    byte[] bArr = g10.data;
                    i10 = (int) ((g10.pos + fromIndex) - size);
                    int i12 = g10.limit;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bU || b10 == bU2) {
                            i11 = g10.pos;
                        } else {
                            i10++;
                        }
                    }
                    size += g10.limit - g10.pos;
                    g10 = g10.next;
                    Intrinsics.g(g10);
                    fromIndex = size;
                }
            } else {
                byte[] bArrI = targetBytes.I();
                while (size < getSize()) {
                    byte[] bArr2 = g10.data;
                    i10 = (int) ((g10.pos + fromIndex) - size);
                    int i13 = g10.limit;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrI) {
                            if (b11 == b12) {
                                i11 = g10.pos;
                            }
                        }
                        i10++;
                    }
                    size += g10.limit - g10.pos;
                    g10 = g10.next;
                    Intrinsics.g(g10);
                    fromIndex = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = (g10.limit - g10.pos) + size;
            if (j10 > fromIndex) {
                break;
            }
            g10 = g10.next;
            Intrinsics.g(g10);
            size = j10;
        }
        if (targetBytes.V() == 2) {
            byte bU3 = targetBytes.u(0);
            byte bU4 = targetBytes.u(1);
            while (size < getSize()) {
                byte[] bArr3 = g10.data;
                i10 = (int) ((g10.pos + fromIndex) - size);
                int i14 = g10.limit;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bU3 || b13 == bU4) {
                        i11 = g10.pos;
                    } else {
                        i10++;
                    }
                }
                size += g10.limit - g10.pos;
                g10 = g10.next;
                Intrinsics.g(g10);
                fromIndex = size;
            }
        } else {
            byte[] bArrI2 = targetBytes.I();
            while (size < getSize()) {
                byte[] bArr4 = g10.data;
                i10 = (int) ((g10.pos + fromIndex) - size);
                int i15 = g10.limit;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrI2) {
                        if (b14 == b15) {
                            i11 = g10.pos;
                        }
                    }
                    i10++;
                }
                size += g10.limit - g10.pos;
                g10 = g10.next;
                Intrinsics.g(g10);
                fromIndex = size;
            }
        }
        return -1L;
        return (i10 - i11) + size;
    }

    @Override // gw.InterfaceC14418g
    public String w0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jM = m((byte) 10, 0L, j10);
        if (jM != -1) {
            return hw.a.h(this, jM);
        }
        if (j10 < getSize() && l(j10 - 1) == 13 && l(j10) == 10) {
            return hw.a.h(this, j10);
        }
        C14416e c14416e = new C14416e();
        g(c14416e, 0L, Math.min(32, getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(getSize(), limit) + " content=" + c14416e.P2().E() + (char) 8230);
    }

    public boolean z(long offset, C14419h bytes, int bytesOffset, int byteCount) {
        Intrinsics.j(bytes, "bytes");
        return byteCount >= 0 && offset >= 0 && ((long) byteCount) + offset <= getSize() && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.V() && (byteCount == 0 || hw.a.b(this, bytes, offset, offset + 1, bytesOffset, byteCount) != -1);
    }

    @Override // gw.InterfaceC14418g
    public int K2() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (getSize() != 0) {
            byte bL = l(0L);
            if ((bL & 128) == 0) {
                i10 = bL & Byte.MAX_VALUE;
                i12 = 0;
                i11 = 1;
            } else if ((bL & 224) == 192) {
                i10 = bL & 31;
                i11 = 2;
                i12 = 128;
            } else if ((bL & 240) == 224) {
                i10 = bL & C14170dq.MULTIPLY;
                i11 = 3;
                i12 = RecyclerView.m.FLAG_MOVED;
            } else if ((bL & 248) == 240) {
                i10 = bL & 7;
                i11 = 4;
                i12 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i11;
            if (getSize() >= j10) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j11 = i13;
                    byte bL2 = l(j11);
                    if ((bL2 & 192) == 128) {
                        i10 = (i10 << 6) | (bL2 & 63);
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i10 && i10 < 57344) || i10 < i12) {
                    return 65533;
                }
                return i10;
            }
            throw new EOFException("size < " + i11 + ": " + getSize() + " (to read code point prefixed 0x" + C14413b.k(bL) + ')');
        }
        throw new EOFException();
    }

    public final C14419h O() {
        if (getSize() <= 2147483647L) {
            return R((int) getSize());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + getSize()).toString());
    }

    @Override // gw.InterfaceC14418g
    public C14419h P2() {
        return O1(getSize());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // gw.InterfaceC14418g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long R3() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb1
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            gw.G r6 = r14.head
            kotlin.jvm.internal.Intrinsics.g(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            gw.e r0 = new gw.e
            r0.<init>()
            gw.e r0 = r0.M2(r4)
            gw.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.n3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = gw.C14413b.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            gw.G r7 = r6.b()
            r14.head = r7
            gw.H.b(r6)
            goto La1
        L9f:
            r6.pos = r8
        La1:
            if (r1 != 0) goto La7
            gw.G r6 = r14.head
            if (r6 != 0) goto Ld
        La7:
            long r1 = r14.getSize()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.K(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.C14416e.R3():long");
    }

    public final void a() throws EOFException {
        skip(getSize());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14416e clone() {
        return d();
    }

    public final long c() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        G g10 = this.head;
        Intrinsics.g(g10);
        G g11 = g10.prev;
        Intrinsics.g(g11);
        if (g11.limit < 8192 && g11.owner) {
            return size - (r3 - g11.pos);
        }
        return size;
    }

    @Override // gw.InterfaceC14418g
    public int c3() throws EOFException {
        return C14413b.h(readInt());
    }

    @Override // gw.InterfaceC14418g
    public byte[] d2() {
        return H(getSize());
    }

    @JvmName
    public final byte l(long pos) {
        C14413b.b(getSize(), pos, 1L);
        G g10 = this.head;
        if (g10 != null) {
            if (getSize() - pos < pos) {
                long size = getSize();
                while (size > pos) {
                    g10 = g10.prev;
                    Intrinsics.g(g10);
                    size -= g10.limit - g10.pos;
                }
                Intrinsics.g(g10);
                return g10.data[(int) ((g10.pos + pos) - size)];
            }
            long j10 = 0;
            while (true) {
                long j11 = (g10.limit - g10.pos) + j10;
                if (j11 <= pos) {
                    g10 = g10.next;
                    Intrinsics.g(g10);
                    j10 = j11;
                } else {
                    Intrinsics.g(g10);
                    return g10.data[(int) ((g10.pos + pos) - j10)];
                }
            }
        } else {
            Intrinsics.g(null);
            throw null;
        }
    }

    @Override // gw.InterfaceC14418g
    public short p1() throws EOFException {
        return C14413b.j(readShort());
    }

    @Override // gw.InterfaceC14418g
    public byte readByte() throws EOFException {
        if (getSize() != 0) {
            G g10 = this.head;
            Intrinsics.g(g10);
            int i10 = g10.pos;
            int i11 = g10.limit;
            int i12 = i10 + 1;
            byte b10 = g10.data[i10];
            K(getSize() - 1);
            if (i12 == i11) {
                this.head = g10.b();
                H.b(g10);
                return b10;
            }
            g10.pos = i12;
            return b10;
        }
        throw new EOFException();
    }

    @Override // gw.InterfaceC14418g
    public int readInt() throws EOFException {
        if (getSize() >= 4) {
            G g10 = this.head;
            Intrinsics.g(g10);
            int i10 = g10.pos;
            int i11 = g10.limit;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = g10.data;
            int i12 = i10 + 3;
            int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
            int i14 = i10 + 4;
            int i15 = (bArr[i12] & 255) | i13;
            K(getSize() - 4);
            if (i14 == i11) {
                this.head = g10.b();
                H.b(g10);
                return i15;
            }
            g10.pos = i14;
            return i15;
        }
        throw new EOFException();
    }

    @Override // gw.InterfaceC14418g
    public long readLong() throws EOFException {
        if (getSize() >= 8) {
            G g10 = this.head;
            Intrinsics.g(g10);
            int i10 = g10.pos;
            int i11 = g10.limit;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = g10.data;
            int i12 = i10 + 7;
            long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j11 = j10 | (bArr[i12] & 255);
            K(getSize() - 8);
            if (i13 == i11) {
                this.head = g10.b();
                H.b(g10);
                return j11;
            }
            g10.pos = i13;
            return j11;
        }
        throw new EOFException();
    }

    @Override // gw.InterfaceC14418g
    public short readShort() throws EOFException {
        if (getSize() >= 2) {
            G g10 = this.head;
            Intrinsics.g(g10);
            int i10 = g10.pos;
            int i11 = g10.limit;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = g10.data;
            int i12 = i10 + 1;
            int i13 = (bArr[i10] & 255) << 8;
            int i14 = i10 + 2;
            int i15 = (bArr[i12] & 255) | i13;
            K(getSize() - 2);
            if (i14 == i11) {
                this.head = g10.b();
                H.b(g10);
            } else {
                g10.pos = i14;
            }
            return (short) i15;
        }
        throw new EOFException();
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C14416e h2(int i10) {
        return writeInt(C14413b.h(i10));
    }

    @Override // gw.InterfaceC14418g
    public long s1() throws EOFException {
        return C14413b.i(readLong());
    }

    public String toString() {
        return O().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) throws IOException {
        Intrinsics.j(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            G gY = Y(1);
            int iMin = Math.min(i10, 8192 - gY.limit);
            source.get(gY.data, gY.limit, iMin);
            i10 -= iMin;
            gY.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // gw.InterfaceC14417f
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C14416e f0(long v10) {
        return v0(C14413b.i(v10));
    }

    @Override // gw.InterfaceC14418g
    public String i1() throws EOFException {
        return w0(Long.MAX_VALUE);
    }

    public int read(byte[] sink, int offset, int byteCount) {
        Intrinsics.j(sink, "sink");
        C14413b.b(sink.length, offset, byteCount);
        G g10 = this.head;
        if (g10 == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, g10.limit - g10.pos);
        byte[] bArr = g10.data;
        int i10 = g10.pos;
        ArraysKt.j(bArr, sink, offset, i10, i10 + iMin);
        g10.pos += iMin;
        K(getSize() - iMin);
        if (g10.pos == g10.limit) {
            this.head = g10.b();
            H.b(g10);
        }
        return iMin;
    }

    @Override // gw.K
    public long read(C14416e sink, long byteCount) {
        Intrinsics.j(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (byteCount > getSize()) {
            byteCount = getSize();
        }
        sink.E1(this, byteCount);
        return byteCount;
    }
}

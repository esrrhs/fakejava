package fakescript;

public class command
{
	public static final long EMPTY_CMD = -1;

	public static int command_help = 0;
	public static final int COMMAND_OPCODE = command_help++;
	public static final int COMMAND_ADDR = command_help++;
	public static final int COMMAND_POS = command_help++;

	public static int opcode_help = 0;
	public static final int OPCODE_ASSIGN = opcode_help++;
	public static final int OPCODE_PLUS = opcode_help++;
	public static final int OPCODE_MINUS = opcode_help++;
	public static final int OPCODE_MULTIPLY = opcode_help++;
	public static final int OPCODE_DIVIDE = opcode_help++;
	public static final int OPCODE_DIVIDE_MOD = opcode_help++;
	public static final int OPCODE_STRING_CAT = opcode_help++;
	public static final int OPCODE_PLUS_ASSIGN = opcode_help++;
	public static final int OPCODE_MINUS_ASSIGN = opcode_help++;
	public static final int OPCODE_MULTIPLY_ASSIGN = opcode_help++;
	public static final int OPCODE_DIVIDE_ASSIGN = opcode_help++;
	public static final int OPCODE_DIVIDE_MOD_ASSIGN = opcode_help++;
	public static final int OPCODE_RETURN = opcode_help++;
	public static final int OPCODE_JNE = opcode_help++;
	public static final int OPCODE_JMP = opcode_help++;
	public static final int OPCODE_FORBEGIN = opcode_help++;
	public static final int OPCODE_FORLOOP = opcode_help++;
	public static final int OPCODE_AND = opcode_help++;
	public static final int OPCODE_OR = opcode_help++;
	public static final int OPCODE_LESS = opcode_help++;
	public static final int OPCODE_MORE = opcode_help++;
	public static final int OPCODE_EQUAL = opcode_help++;
	public static final int OPCODE_MOREEQUAL = opcode_help++;
	public static final int OPCODE_LESSEQUAL = opcode_help++;
	public static final int OPCODE_NOTEQUAL = opcode_help++;
	public static final int OPCODE_NOT = opcode_help++;
	public static final int OPCODE_AND_JNE = opcode_help++;
	public static final int OPCODE_OR_JNE = opcode_help++;
	public static final int OPCODE_LESS_JNE = opcode_help++;
	public static final int OPCODE_MORE_JNE = opcode_help++;
	public static final int OPCODE_EQUAL_JNE = opcode_help++;
	public static final int OPCODE_MOREEQUAL_JNE = opcode_help++;
	public static final int OPCODE_LESSEQUAL_JNE = opcode_help++;
	public static final int OPCODE_NOTEQUAL_JNE = opcode_help++;
	public static final int OPCODE_NOT_JNE = opcode_help++;
	public static final int OPCODE_CALL = opcode_help++;
	public static final int OPCODE_SLEEP = opcode_help++;
	public static final int OPCODE_YIELD = opcode_help++;
	public static final int OPCODE_MAX = opcode_help++;

	public static int addr_help = 0;
	public static final int ADDR_STACK = addr_help++;
	public static final int ADDR_CONST = addr_help++;
	public static final int ADDR_CONTAINER = addr_help++;

	public static int call_help = 0;
	public static final int CALL_NORMAL = call_help++;
	public static final int CALL_FAKE = call_help++;
	public static final int CALL_CLASSMEM = call_help++;

	public static long MAKEINT64(int high, int low)
	{
		return ((long) ((low) | ((long) (high)) << 32));
	}

	public static int MAKEINT32(int high, int low)
	{
		return ((int) (((short) (low)) | ((int) ((short) (high))) << 16));
	}

	public static long MAKE_COMMAND(int type, int code)
	{
		return MAKEINT64(type, code);
	}

	public static long MAKE_OPCODE(int op)
	{
		return MAKE_COMMAND(COMMAND_OPCODE, op);
	}

	public static long MAKE_POS(int pos)
	{
		return MAKE_COMMAND(COMMAND_POS, pos);
	}

	public static long MAKE_ADDR(int addrtype, int pos)
	{
		return MAKE_COMMAND(COMMAND_ADDR, MAKEINT32(addrtype, pos));
	}

}

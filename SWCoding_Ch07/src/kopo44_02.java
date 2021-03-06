import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kopo44_02 {//클래스

	String kopo44_blank = "";//black를 선언

	public String kopo44_HanBlankForeword(String kop44_s, int kopo44_number) {//HanBlackForeword 메소드 
		for (int kopo44_i = 0; kopo44_i < kopo44_number; kopo44_i ++) {//i는 0부터 number 미만까지 반복 for문
			kopo44_blank += " ";	//black에 " "추가
		}
		return kopo44_blank.concat(kop44_s);//concat은 스트링 선언한 것을 이어 붙여주는 명령어
	}

	public String kopo44_HanBlankBackword(String kopo44_s, int kopo44_number) {//HanBlankBackword 메소드
		for (int i = 0; i < kopo44_number; i ++) {//i는 0부터 number 미만까지 반복 for문
			kopo44_blank += " ";	//black에 " "추가
		}
		return kopo44_s.concat(kopo44_blank);//concat은 스트링 선언한 것을 이어 붙여주는 명령어
	}

	public static int kopo44_HanCount(String kopo44_str){//https://selfdevelope.tistory.com/383
		//HanCount 메소드

		StringBuffer kopo44_sb=new StringBuffer();//스트링버퍼 선언

		if(kopo44_str!=null && kopo44_str.length()!=0){//str이 빈값이 아니고 길이가 0이 아니라면

			Pattern kopo44_p = Pattern.compile("[가-힣]");//한글을 찾게 해주는 로직 

			Matcher kopo44_m = kopo44_p.matcher(kopo44_str);//매칭을 해줌

			while(kopo44_m.find()){

				kopo44_sb.append(kopo44_m.group());//이어서 붙여줌

			}

		}
		
		return kopo44_sb.length();//글자수를 카운트 하기에 그것을 카운트한 길이가 한글 길이

	}




}

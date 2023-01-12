package Oreze;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * @author oreze
 * @creat 2023-01-12-14:22
 */
public class ATM_System {
    public static void main(String[] args) {
        //定义账户类集合
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            //展示系统首页
            System.out.println("*****************ATM系统******************");
            System.out.println("1.账户登录");
            System.out.println("2.创建账户");

            System.out.println("请您选择操作:");
            int command = sc.nextInt();

            switch(command){
                case 1://账户登录
                    login(accounts,sc);
                    break;
                case 2://创建账户
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("你选择的操作有误，请重新输入:");
            }
        }
    }

    /**
     * 登陆账户功能实现
     * @param accounts 接收的账户集合
     */
    private static void login(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("*****************登陆账户******************");

        //判断账户集合中是否存在账户，若不存在账户，则登录功能无法进行
        if (accounts.size() == 0) {
            System.out.println("当前系统中无账户，请先注册账户，再进行登录");
            return;//返回上一级
        }

        while (true) {
            //进行登陆操作
            System.out.println("请输入卡号:");
            String cardID = sc.next();

            //判断卡号是否存在，根据卡号去账户集合查询账户对象
            Account acc = getAccountByCardID(cardID, accounts);
            if (acc != null) {
                while (true) {
                    //卡号存在
                    //输入密码，认证密码
                    System.out.println("请输入密码:");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)) {
                        //登陆成功
                        System.out.println("欢迎"+acc.getUserName()+"先生/女士进入系统，您的卡号是:"+acc.getCardID());
                        //查询、转账、存款、取款
                        //展示登陆后的操作界面
                        showUserCommand(sc,acc,accounts);
                        return;//结束登陆方法，回到初始界面
                    } else {
                        System.out.println("密码不正确，请检查您输入的密码");
                    }
                }
            } else {
                //卡号不存在
                System.out.println("卡号输入错误，请检查您输入的卡号");

            }
        }
    }

    /**
     * 展示登陆后的用户操作界面
     */
    private static void showUserCommand(Scanner sc,Account acc,ArrayList<Account>accounts) {
        while(true) {
            System.out.println("*****************用户界面******************");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择您要进行的操作:");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    depositMoney(acc,sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(acc,sc,accounts);
                    break;
                case 5:
                    //修改密码
                    changePassWord(acc,sc);
                    return;
                case 6:
                    //退出
                    System.out.println("账户已退出，欢迎下次光临");
                    return;//结束用户操作方法，回到登录方法
                case 7:
                    //注销账户
                    //从当前账户集合中，删除当前账户对象
                    deleteAccount(acc,accounts,sc);
                    break;
                default:
                    System.out.println("您输入的操作不正确，请重新输入:");
            }
        }
    }

    /**
     * 销户功能实现
     * @param acc 当前账户对象
     * @param accounts 所有账户集合
     */
    private static void deleteAccount(Account acc, ArrayList<Account> accounts,Scanner sc) {
        System.out.println("您要注销当前账户吗？y/n");
        String command = sc.next();
        switch(command){
            case "y":
                //判断账户是否还有余额
                if(acc.getMoney()>0)
                {
                    //有余额时的二次确认
                    System.out.println("当前账户中仍有余额，您是否要继续注销账户？y/n");
                    String okCommand = sc.next();
                    if(okCommand=="y"){
                        accounts.remove(acc);
                        System.out.println("您的账户已经注销");
                    }else {
                        System.out.println("当前账户将继续为您保留");
                    }
                }else {
                    //没有余额时的二次确认
                    System.out.println("请二次确认您是否要注销当前账户y/n");
                    String okCommand2 =sc.next();
                    if(okCommand2=="y"){
                        accounts.remove(acc);
                        System.out.println("您的账户已经注销");
                    }else {
                        System.out.println("当前账户将继续为您保留");
                    }
                }
                    break;
            default:
                System.out.println("当前账户将继续为您保留");
                break;
        }
    }

    /**
     * 改密功能的实现
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void changePassWord(Account acc, Scanner sc) {
        System.out.println("*****************修改密码******************");

        while(true) {

            System.out.println("请输入您账户当前密码:");
            String passWord = sc.next();
            while (true) {
                //验证用户是否为本人
                if (passWord.equals(acc.getPassWord())) {
                    while (true) {

                        String name = acc.getUserName();
                        System.out.println("请输入您姓名中的第一个字:");
                        String preName = sc.next();
                        //二次验证用户是否为本人
                        if (name.startsWith(preName)) {

                            //验证成功,开始更改密码
                            while (true) {
                                System.out.println("请输入您的新密码:");
                                String newPassWord = sc.next();
                                System.out.println("请再次输入您的新密码:");
                                String okNewPassWord = sc.next();
                                //判断两次输入的密码是否一致
                                if (newPassWord.equals(okNewPassWord)) {
                                    System.out.println("密码修改成功");
                                    acc.setPassWord(newPassWord);
                                    return;
                                } else {
                                    System.out.println("两次输入的密码不一致，请重新输入");
                                }
                            }
                            } else{
                                System.out.println("您输入的信息不正确，请重新输入");
                        }
                    }
                } else {
                    System.out.println("您输入的密码不正确，请检查您输入的密码");
                }
            }
        }
    }

    /**
     * 转账功能实现
     * @param acc 当前账户对象
     * @param sc 扫描器
     * @param accounts 所有账户集合
     */
    private static void transferMoney(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("*****************转账******************");
        //判断系统中存在的账户数是否满足2个或2个以上
        if(accounts.size()<2){
            System.out.println("当前系统中不足2个账户，无法进行转账，请再创建一个新账户");
            return;//结束转账方法
        }
        if(acc.getMoney()==0){
            System.out.println("当前账户余额不足，无法进行转账");
            return;//结束转账方法
        }

        while(true) {
            //开始转帐
            System.out.println("请输入转账对象的卡号:");
            String cardID = sc.next();

            //判断卡号是否存在(利用卡号查询方法)
            Account account = getAccountByCardID(cardID, accounts);
            if (account == null) {
                System.out.println("此账户不存在，请检查您输入的卡号");
            } else {
                //账户存在
                if (cardID.equals(acc.getCardID())) {
                    System.out.println("您无法给自己的账户转账,请重新输入转账对象的卡号");
                    continue;
                }else {
                    //可以进行转账了，确认对象的姓名的第一个字
                    String userName = account.getUserName();
                    String tip = '*' + userName.substring(1);
                    System.out.println("请输入["+tip+"]的姓名的第一个字");
                    String preName = sc.next();
                    if(userName.startsWith(preName)){
                        while(true) {
                            //验证通过，开始转帐操作
                            System.out.println("请输入转账金额:");
                            double money = sc.nextDouble();
                            //判断余额是否足够
                            if (money > acc.getMoney()) {
                                System.out.println("当前余额不足，您最多可转出:" + acc.getMoney() + "元，请重新输入转账金额");
                            } else {
                                //余额充足，可以转账
                                acc.setQuoteMoney(acc.getMoney()-money);
                                account.setMoney(account.getMoney()+money);
                                System.out.println("您已成功转账"+money+"元至"+tip+"先生/女士的账户");
                                System.out.println("您当前的账户余额为"+acc.getMoney());
                                return;//结束转账方法
                            }
                        }
                    }else {
                        System.out.println("您输入的信息有误");
                    }
                }
            }
        }
    }

    /**
     * 取款功能实现
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("*****************取款******************");

        //判断账户是否达到单次取款最低金额
        if(acc.getMoney()<100){
            System.out.println("当前账户余额不足100元，无法取款");
            return;
        }

        while(true){
            //输入取款金额
            System.out.println("请输入此次取款金额:");
            double money = sc.nextDouble();

            //判断金额是否符合要求
            if(money>acc.getQuoteMoney()){
                System.out.println("此次取款金额超过单次取款限额，单次最多可取款:"+acc.getQuoteMoney());
            }else {
                if(money>acc.getMoney()){
                    System.out.println("余额不足，当前账户余额为:"+acc.getMoney());
                }else {
                    //已满足取款条件
                    System.out.println("取款"+money+"元，成功！");
                    //更新余额
                    acc.setMoney(acc.getMoney()-money);
                    System.out.println("当前账户余额为:"+acc.getMoney());
                    //取款结束
                    return;//结束取款方法，回到用户操作界面方法
                }
            }
        }
    }

    /**
     * 存款功能实现
     * @param acc 当前账户对象
     * @param sc 扫描器
     */
    private static void depositMoney(Account acc, Scanner sc) {
        System.out.println("*****************存款******************");
        System.out.println("请输入存款金额:");
        double money = sc.nextDouble();

        //更改账户余额，原有存款+存入金额
        acc.setMoney(acc.getMoney()+money);
        System.out.println("存款成功，当前账户余额为:"+acc.getMoney());
    }

    /**
     * 查询用户信息
     * @param acc 当前账户对象
     */
    private static void showAccount(Account acc) {
        System.out.println("*****************当前账户信息******************");
        System.out.println("卡号"+acc.getCardID());
        System.out.println("账户名"+acc.getUserName());
        System.out.println("余额"+acc.getMoney());
        System.out.println("账户单次限额"+acc.getQuoteMoney());
    }

    /**
     * 注册账户功能实现
     * @param accounts 接收的账户集合
     */
    private static void register(ArrayList<Account> accounts,Scanner sc) {
        System.out.println("*****************创建账户******************");

        //创建账户对象，用于封装账户信息
        Account account = new Account();

        //录入当前账户信息，注入账户对象中
        System.out.println("请输入账户用户名:");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入密码:");
            String passWord = sc.next();
            System.out.println("请确认密码:");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)) {
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次输入的密码不一致，请重新确认您的密码!");
            }
        }

        System.out.println("请设置账户单次限额:");
        double quoteMoney = sc.nextDouble();
        account.setQuoteMoney(quoteMoney);

        //为账户生成一个8位且与其他卡号不重复的卡号
        String cardID = getRandomCardID(accounts);
        account.setCardID(cardID);

        //把账户对象添加到账户集合中
        accounts.add(account);
        System.out.println("恭喜您，" + userName + "先生/女士，账户创建成功，您的卡号是:" + cardID + "，请您妥善保管卡号与密码");
    }

    /**
     * 卡号创建功能实现
     * @param accounts 接收的账户集合
     * @return
     */
    private static String getRandomCardID(ArrayList<Account> accounts) {
        Random r = new Random();
        while(true) {
            //生成8位随机数
            String cardID = "";//初始化卡号
            for (int i = 0; i < 8; i++) {
                cardID += r.nextInt(10);
            }
            //判断卡号是否与其他账户卡号重复
            //根据卡号查询账户对象
            Account acc = getAccountByCardID(cardID, accounts);
            if (acc == null) {
                //此cardID并未重复，是一个新cardID，可以用作新用户卡号
                return cardID;
            }
        }
    }

    /**
     * 根据卡号查询账户
     * @param cardID 卡号
     * @param accounts 全部账户集合
     * @return 账户对象 | null
     */
    private static  Account getAccountByCardID(String cardID,ArrayList<Account>accounts){
        for(int i=0;i< accounts.size();i++) {
            Account acc = accounts.get(i);
            if(acc.getCardID().equals(cardID)){
                return acc;
            }
        }
        return null;
    }
}
